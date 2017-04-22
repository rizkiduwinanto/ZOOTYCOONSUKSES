package cell.facility.road.exit;

import cell.facility.road.Road;
import point.Point;

/** Kelas Exit bertanggung jawab mengelola Exit.
 * @author AZIS ADI KUNCORO (13515120)
 * @version 3.0
 */
public class Exit extends Road {
  /** Konstruktor Exit dengan parameter.
   * @param p Merupakan posisi Exit.
   */
  public Exit(Point p) {
    super(p);
  }

  /** Metode render untuk kelas Exit yang di override dari Kelas Render. */
  @Override
  public char render() {
    return 'O';
  }
}
