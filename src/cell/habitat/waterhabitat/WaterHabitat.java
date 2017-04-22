package cell.habitat.waterhabitat;

import cell.habitat.Habitat;
import point.Point;

/** Kelas WaterHabitat bertanggung jawab mengelola WaterHabitat
 * @author AZIS ADI KUNCORO (13515120)
 * @version 3.0
 */

public class WaterHabitat extends Habitat {
  /** Konstruktor WaterHabitat dengan parameter.
   * @param p Merupakan posisi WaterHabitat.
   */
  public WaterHabitat(Point p) {
    super(p);
  }

  /** Metode render untuk kelas Park yang di override dari Kelas Render. */
  @Override
  public char render() {
    return 'w';
  }

  @Override
  public boolean isAirHabitat() {
    return false;
  }

  @Override
  public boolean isWaterHabitat() {
    return true;
  }

  @Override
  public boolean isLandHabitat() {
    return false;
  }
}
