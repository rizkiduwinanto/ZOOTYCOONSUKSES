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

  public Zoo(int baris, int kolom) {
    assert (baris >= 0) : "Nilai baris tidak boleh negatif";
    assert (kolom >= 0) : "Nilai kolom tidak boleh negatif";

    brs = baris;
    kol = kolom;
    mycell = new Cell[brs][kol];

  }

  /* ==SETTER== */

  public final void setCellType(Point p,char readed) {
    switch (readed) {
      case '.' :
        mycell[p.getY()][p.getX()] = new Road();
        break;
      case 'I' :
        mycell[p.getY()][p.getX()] = new Entrance();
        break;
      case 'O' :
        mycell[p.getY()][p.getX()] = new Exit();
        break;
      case 'P' :
        mycell[p.getY()][p.getX()] = new Park();
        break;
      case 'R' :
        mycell[p.getY()][p.getX()] = new Restaurant();
        break;
      case 'w' :
        mycell[p.getY()][p.getX()] = new WaterHabitat(false);
        break;
      case 'W' :
        mycell[p.getY()][p.getX()] = new WaterHabitat(true);
        break;
      case 'a' :
        mycell[p.getY()][p.getX()] = new AirHabitat(false);
        break;
      case 'A' :
        mycell[p.getY()][p.getX()] = new AirHabitat(true);
        break;
      case 'x' :
        mycell[p.getY()][p.getX()] = new LandHabitat(false);
        break;
      case 'X' :
        mycell[p.getY()][p.getX()] = new LandHabitat(true);
        break;
      default :
        assert (false) : "Symbol " + readed + " tidak dikenali.";
        break;
    }
  }

  /* ========= */

  /* ==GETTER== */

  public final int getBaris() {
    return brs;
  }

  public final int getKolom() {
    return kol;
  }

  public final Cell getCell(Point p) {
    assert (p.getY() >= 0 && p.getY() < brs) : "Batas ordinat / baris melewati constraint !";
    assert (p.getX() >= 0 && p.getX() < kol) : "Batas absis / kolom melewati constraint !";
    return mycell[p.getY()][p.getX()];
  }

  /* ========= */

  public final void display() {
    for (int i = 0; i < brs; i++) {
      for (int j = 0; j < kol; j++) {
        System.out.print(getCell(new Point(j,i)).render());
        if (j == kol - 1) {
          System.out.println("");
        }
      }
    }
  }


}
