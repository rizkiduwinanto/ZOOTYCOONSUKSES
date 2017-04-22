package cell.facility.park;

import cell.facility.Facility;
import point.Point;

/** Kelas Park bertanggung jawab mengelola Park.
 * @author AZIS ADI KUNCORO (13515120)
 * @version 3.0
 */
public class Park extends Facility {
  /** Konstruktor Park dengan parameter.
   * @param p Merupakan posisi Park.
   */
  public Park(Point p) {
    super(p);
  }

  /** Metode render untuk kelas Park yang di override dari Kelas Render. */
  @Override
  public char render() {
    return '#';
  }
}
