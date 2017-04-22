package cell.habitat.landhabitat;

import cell.habitat.Habitat;
import point.Point;

/** Kelas LandHabitat bertanggung jawab mengelola LandHabitat.
 * @author AZIS
 * @version 3.0
 */

public class LandHabitat extends Habitat {
  /** Konstruktor LandHabitat dengan parameter.
   * @param p Merupakan posisi LandHabitat.
   */
  public LandHabitat(Point p) {
    super(p);
  }

  /** Metode render untuk kelas Park yang di override dari Kelas Render. */
  @Override
  public char render() {
    return 'x';
  }

  @Override
  public boolean isAirHabitat() {
    return false;
  }

  @Override
  public boolean isWaterHabitat() {
    return false;
  }

  @Override
  public boolean isLandHabitat() {
    return true;
  }
}
