package cell.habitat;

import cell.Cell;
import animal.Animal;
import point.Point;

/** Kelas Habitat bertanggung jawab mengelola habitat.
 * @author AZIS ADI KUNCORO (13515120)
 * @version 3.0
 */
public abstract class Habitat extends Cell {
  private Animal hewan;

  /** Konstruktor Habitat dengan parameter.
   * @param p Merupakan posisi Habitat.
   */
  public Habitat(Point p) {
    super(p);
    hewan = null;
  }

  /**
   *  Method abstrak predikat apakah suatu habitat adalah AirHabitat.
   */
  public abstract boolean isAirHabitat();

  /**
   *  Method abstrak predikat apakah suatu habitat adalah WaterHabitat.
   */
  public abstract boolean isWaterHabitat();

  /**
   *  Method abstrak predikat apakah suatu habitat adalah LandHabitat.
   */
  public abstract boolean isLandHabitat();

  /**
   * Getter Animal.
   */
  public Animal getHewan() {
    return hewan;
  }

  /**
   * Setter Animal
   */
  public void addHewan(Animal hewan) {
    this.hewan = hewan;
  }
}
