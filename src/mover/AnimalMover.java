package mover;

import animal.Animal;
import cell.habitat.Habitat;
import java.util.Random;
import point.Point;
import zoo.Zoo;

/**
 * @author Hisham Lazuardi Yusuf (13515069).
 */
public class AnimalMover {

  /**
   * Constructor Move Animal.
   */
  public AnimalMover() {}

  /**
   * Fungsi untuk melakukan random nilai.
   * @return randomNumber
   */
  private static int randomMove() {
    Random ranNum = new Random();
    return (ranNum.nextInt(4));
  }

  /**
   * Fungsi untuk melakukan pengecekan pemindahan animal valid atau tidak.
   * @param myZoo zoo yang aktif
   * @param num arah gerakan
   * @return checkMove
   */
  private static boolean checkMove(Zoo myZoo, int num, Point loc) {
    if (num == 1) {
      return (loc.getX() - 1 >= 0 
              && myZoo.getCell(new Point(loc.getX() - 1, loc.getY())) instanceof Habitat);
    } else if (num == 0) {
      return (loc.getY() - 1 >= 0 
              && myZoo.getCell(new Point(loc.getX(), loc.getY() - 1)) instanceof Habitat);
    } else if (num == 3) {
      return (loc.getX() + 1 < myZoo.getKolom() 
              && myZoo.getCell(new Point(loc.getX() + 1, loc.getY())) instanceof Habitat);
    } else {
      return (loc.getY() + 1 < myZoo.getBaris()
              && myZoo.getCell(new Point(loc.getX(), loc.getY() + 1)) instanceof Habitat);
    }
  }
  
  /**
   * I.S. myZoo dan hewan terdefinisi
   * F.S. hewan berhasil berpindah di dalam myZoo
   * @param myZoo zoo yang aktif
   * @param hewan hewan yang digerakkan
   */
  public static void moveAnimal(Zoo myZoo, Animal hewan) {
    int randomNum = -1;
    Point currLoc = new Point(hewan.getLocation().getX(), hewan.getLocation().getY());
    Point animalLoc = new Point(hewan.getLocation().getX(), hewan.getLocation().getY());
    boolean valid = false;

    while (!valid) {
      randomNum = randomMove();
      valid = checkMove(myZoo, randomNum, animalLoc);
    }

    System.out.println(randomNum);
    // Menaruh hewan ke dalam cell selanjutnya
    //((Habitat)myZoo.getCell(new Point(currLoc.getX() - 1, currLoc.getY()))).addHewan(hewan);
    if (randomNum == 1) {
      ((Habitat) myZoo.getCell(new Point(currLoc.getX() - 1, currLoc.getY()))).addHewan(hewan);
      hewan.setLocation(new Point(currLoc.getX() - 1, currLoc.getY()));
    } else if (randomNum == 0) {
      ((Habitat) myZoo.getCell(new Point(currLoc.getX(), currLoc.getY() - 1))).addHewan(hewan);
      hewan.setLocation(new Point(currLoc.getX(), currLoc.getY() - 1));
    } else if (randomNum == 3) {
      ((Habitat) myZoo.getCell(new Point(currLoc.getX() + 1, currLoc.getY()))).addHewan(hewan);
      hewan.setLocation(new Point(currLoc.getX() + 1, currLoc.getY()));
    } else if (randomNum == 2) {
      ((Habitat) myZoo.getCell(new Point(currLoc.getX(), currLoc.getY() + 1))).addHewan(hewan);
      hewan.setLocation(new Point(currLoc.getX(), currLoc.getY() + 1));
    }
    // Inisiasi hewan pada posisi sebelumnya menjadi null
    ((Habitat) myZoo.getCell(new Point(currLoc.getX(), currLoc.getY()))).addHewan(null);
  }
}
