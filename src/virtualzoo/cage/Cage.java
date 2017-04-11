
package virtualzoo.cage;

import point.Point;
import virtualzoo.animal.Animal;
import virtualzoo.cell.Cell;
import virtualzoo.cell.habitat.Habitat;
import virtualzoo.zoo.Zoo;

/** @author Rizky Elzandi Barik.
 */

public class Cage {
  private Point startLoc;
  private Point endLoc;
  private Animal[] penghuniCage;
  private int nbhewan;
  
  /** Constructor tanpa parameter. 
  */
  public Cage() {
    startLoc = new Point();
    endLoc = new Point();
    penghuniCage = new Animal[10];
    nbhewan = 0;
  }
  
  /**
   * @param pstart titik mula.
   * @param pend titik akhir.
   */
  public Cage(Point pstart, Point pend) {
    startLoc = pstart;
    endLoc = pend;
    penghuniCage = new Animal[getMaxIsi()];
    nbhewan = 0;
  }
  
  /**
  * @return Starting location dari cage.
  */
  public Point getStartPoint() {
    return startLoc;
  }
  
  /**
   * @return End location dari cage.
   */
  public Point getEndPoint() {
    return endLoc;
  }
  
  /**
   * @return Size Cage.
   */
  public int getLuas() {
    return ((endLoc.getX() - startLoc.getX() + 1) * (endLoc.getY() - startLoc.getY() + 1));
  }
  
  /** Mengembalikan jumlah hewan yang ada di cell.
   * @return jumlah hewan
   */
  public int getNbHewan() {
    return nbhewan;
  }
  
  /**
   * Mendapatkan porsi makanan satu kandang.
   * @return porsi makanan total dalam sebuah kandang
   */
  public float getPorsiKandang() {
    float sum = 0;
    for (int i = 0; i < nbhewan; i++) {
      sum = sum + penghuniCage[i].getPorsiMakanan();
    }
    return sum;
  }
  
  /**
   * Prosedur menambahkan hewan ke dalam cage.
   * @param z Merupakan sebuah Zoo
   * @param a Hewan yang akan dimasukkan ke dalam cage. 
   */
  public void addAnimal(Zoo z,Animal a) {
    
    if (isFull()) { //Cek apakah cage tersebut sudah penuh
      System.out.println("Maaf, cage ini sudah penuh");
    } else if (!isInside(a.getLocation())) { 
      //Cek apakah posisi animal berada pada range cage
      System.out.println("Maaf, posisi hewan berada di luar range cage");
    } else if (!isHabitatBersesuaian(z.getCell(a.getLocation()),a)) {
      //Cek apakah habitatnya bersesuaian
      System.out.println("Maaf, habitatnya tidak bersesuaian");
    } else if (isUsedAnimalPosition(a.getLocation())) { 
      //Cek apakah sudah ada hewan di posisi tersebut
      System.out.println("Maaf, sudah terdapat hewan pada posisi tersebut");
    } else { //Taruh
      penghuniCage [nbhewan] = a;
      nbhewan++;
      System.out.println("Hewan berhasil ditaruh !");
    }
  }
  
  /** 
   * Menghilangkan animal dari Cage pada indeks hewan ke idx dari suatu Cage.
   */
  public void removeAnimal(int idx) {
    if (idx < nbhewan) {
      if (penghuniCage[idx] == null) {
        System.out.println("Tidak ada hewan disini");
      } else {
        nbhewan--;
        penghuniCage[idx] = null;
      }
    } else {
      System.out.println("indeks hewan melebihi batas hewan yang ada di cage");
    }
  }
  
  /**
   * Melakukan validasi apakah sudah ada hewan di posisi tersebut.
   */
  public boolean isUsedAnimalPosition(Point pos) {
    for (int i = 0; i < nbhewan; i++) {
      if (pos.isEqual(penghuniCage[i].getLocation())) {
        return true;
      }
    }
    return false;
  }
  
  /**
   * Mengembalikan animal pada indeks ke i
   * @param idx
   * @return 
   */
  public Animal getAnimal(int idx) {
    return penghuniCage[idx];
  }
  
  /**
   * Mengembalikan indeks ditemukannya animal dengan posisi tertentu
   */
  public int getAnimalId(Point pos) {
    int id = 0;
    for (int i = 0; i < nbhewan; i++) {
      if (pos.isEqual(penghuniCage[i].getLocation())) {
        id = i;
      }
    }
    return id;
  }
          
  /**
   * Validasi apakah full.
   */
  public boolean isFull() {
    return (nbhewan >= getMaxIsi());
  }
  
  /** Validasi apakah didalam range cage.
   * @param p Point yang dicek apakah berada dalam cage.
   * @return apakah point P berada di dalam cage. 
   */
  public boolean isInside(Point p) {
    boolean cekX = (p.getX() >= startLoc.getX()) && (p.getX() <= endLoc.getX());
    boolean cekY = (p.getY() >= startLoc.getY()) && (p.getY() <= endLoc.getY());
    return (cekX && cekY);
  }
  
  /** Menghasilkan Max isi suatu Cage.
   * @return maksimum yang boleh diisi hewan, yaitu 30% luas cage.
   */
  public int getMaxIsi() {
    return (getLuas() * 3 / 10);
  }
  
  /**
   * Menampilkan hewan-hewan yang ada di cage.
   */
  public void showAnimal() {
    System.out.println("jumlah hewan : " + nbhewan);
    for (int i = 0; i < nbhewan; i++) {
      System.out.print("" + i + "> posisi <" + penghuniCage[i].getLocation().getX() + ",");
      System.out.println("" + penghuniCage[i].getLocation().getX() + ">");
    }

  }
  /**
   * Mengecek apakah Animal A dapat diletakkan di Habitat tertentu
   * @param c Sebuah Cell yang akan di cek
   * @param a Animal yang akan ditempatkan. 
   * @return true jika Animal A dapat tinggal di Habitat H.
   */
  
  public boolean isHabitatBersesuaian(Cell c, Animal a) {
    boolean res = false;
    if (c instanceof Habitat) {
      Habitat h = (Habitat) c;
      if ((h.isAirHabitat()) && (a.isFlyAnimal())) {
        //Cek AirHabitat
        res = true;
      } else if ((h.isWaterHabitat()) && (a.isWaterAnimal())) {
        //CekWaterHabitat
        res = true;
      } else if ((h.isLandHabitat()) && (a.isLandAnimal())) {
        //CekLandHabitat
        res = true;
      }
    } else {
      System.out.println("Cell tersebut bukan habitat");
    }
    return res;
  }

}