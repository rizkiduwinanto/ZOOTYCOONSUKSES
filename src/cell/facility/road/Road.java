package cell.facility.road;

import cell.facility.Facility;
import point.Point;

/** Kelas Road bertanggung jawab mengelola Road.
 * @author AZIS ADI KUNCORO (13515120)
 * @version 3.0
 */
public class Road extends Facility {
  /** Konstruktor Road dengan parameter.
   * @param p Merupakan posisi Road.
   */
  public Road(Point p) {
    super(p);
  }

  /** Metode render untuk kelas Road yang di override dari Kelas Render.
   * @return  char untuk hasil renderan*/
  @Override
  public char render() {
    return '.';
  }
}
