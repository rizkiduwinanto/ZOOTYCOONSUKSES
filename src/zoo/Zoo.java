package zoo;

import cell.Cell;
import cell.facility.park.Park;
import cell.facility.restaurant.Restaurant;
import cell.facility.road.Road;
import cell.facility.road.entrance.Entrance;
import cell.facility.road.exit.Exit;
import cell.habitat.airhabitat.AirHabitat;
import cell.habitat.landhabitat.LandHabitat;
import cell.habitat.waterhabitat.WaterHabitat;
import point.Point;

/**
 * Created by AZIS ADI KUNCORO (13515120) on 22/04/2017.
 */
public class Zoo {
  private final int brs;
  private final int kol;
  private Cell[][] mycell;
  private Point entrance;
  private Point exit;
  
  /**
   * Ctor.
   * @param baris panjang zoo
   * @param kolom lebar zoo
   */
  public Zoo(int baris, int kolom) {
    assert (baris >= 0) : "Nilai baris tidak boleh negatif";
    assert (kolom >= 0) : "Nilai kolom tidak boleh negatif";

    brs = baris;
    kol = kolom;
    mycell = new Cell[brs][kol];
  }

  /* ==SETTER== */
  /**
   * set tipe cell.
   * @param p posisi cell
   * @param readed char yang dibaca
   */
  public final void setCellType(Point p,char readed) {
    switch (readed) {
      case '.' :
        mycell[p.getY()][p.getX()] = new Road(new Point(p.getX(), p.getY()));
        break;
      case 'I' :
        mycell[p.getY()][p.getX()] = new Entrance(new Point(p.getX(), p.getY()));
        break;
      case 'O' :
        mycell[p.getY()][p.getX()] = new Exit(new Point(p.getX(), p.getY()));
        break;
      case '#' :
        mycell[p.getY()][p.getX()] = new Park(new Point(p.getX(), p.getY()));
        break;
      case 'R' :
        mycell[p.getY()][p.getX()] = new Restaurant(new Point(p.getX(), p.getY()));
        break;
      case 'w' :
        mycell[p.getY()][p.getX()] = new WaterHabitat(new Point(p.getX(), p.getY()));
        break;
      case 'a' :
        mycell[p.getY()][p.getX()] = new AirHabitat(new Point(p.getX(), p.getY()));
        break;
      case 'x' :
        mycell[p.getY()][p.getX()] = new LandHabitat(new Point(p.getX(), p.getY()));
        break;
      default :
        assert (false) : "Symbol " + readed + " tidak dikenali.";
        break;
    }
  }

  /* ========= */

  /* ==GETTER== */
  /**
   * getter baris.
   * @return jumlah baris
   */
  public final int getBaris() {
    return brs;
  }

  /**
   * getter jumlah kolom.
   * @return jumlah kolom
   */
  public final int getKolom() {
    return kol;
  }
  
  /**
   * Getter Entrance suato Zoo.
   * @return entrance
   */
  public Point getEntrance() {
    return entrance;
  }
    
  /**
   * Getter Exit suatu Zoo.
   * @return exit
   */
  public Point getExit() {
    return exit;
  }
  
  /**
   * Setter entrance suatu Zoo.
   * @param p merupakan posisi baru untuk entrance
   */
  
  public void setEntrance(Point p) {
    entrance = new Point(p.getX(), p.getY());
  }
  
  /**
   * Setter exit suatu Zoo.
   * @param p merupakan posisi baru untuk exit
   */
  public void setExit(Point p) {
    exit = new Point(p.getX(), p.getY());
  }
  
  /**
   * getter Cell.
   * @param p titik letak cell
   * @return Cell yang berada di titik p
   */
  public final Cell getCell(Point p) {
    assert (p.getY() >= 0 && p.getY() < brs) : "Batas ordinat / baris melewati constraint !";
    assert (p.getX() >= 0 && p.getX() < kol) : "Batas absis / kolom melewati constraint !";
    return mycell[p.getY()][p.getX()];
  }

  /* ========= */
  /**
   * merender zoo.
   */
  public final void display() {
    for (int i = 0; i < brs; i++) {
      for (int j = 0; j < kol; j++) {
        System.out.print("" + i + " " + j);
        System.out.print(getCell(new Point(j,i)).render());
        if (j == kol - 1) {
          System.out.println("");
        }
      }
    }
  }


}
