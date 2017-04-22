package cell.habitat.airhabitat;

import cell.habitat.Habitat;
import point.Point;

/** Kelas AirHabitat bertanggunjawab mengelola AirHabitat.
 * @author AZIS ADI KUNCORO (13515120)
 * @version 3.0
 */

public class AirHabitat extends Habitat {
  /** Konstruktor AirHabitat dengan parameter.
   * @param p Merupakan posisi AirHabitat.
   */
  public AirHabitat(Point p) {
    super(p);
  }

  /** Metode render untuk kelas AirHabitat yang di override dari Kelas Render. */
  @Override
  public char render() {
    return 'a';
  }

  @Override
  public boolean isAirHabitat() {
    return true;
  }

  @Override
  public boolean isWaterHabitat() {
    return false;
  }

  @Override
  public boolean isLandHabitat() {
    return false;
  }
}
