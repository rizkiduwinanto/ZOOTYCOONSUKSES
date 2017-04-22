package cell.facility.road.entrance;

import cell.facility.road.Road;
import point.Point;

/** Kelas Entrance bertanggung jawab mengelola Entrance.
 * @author AZIS ADI KUNCORO (13515120)
 * @version 3.0
 */
public class Entrance extends Road {
  /** Konstruktor Entrance dengan parameter.
   * @param p Merupakan posisi Entrance.
   */
  public Entrance(Point p) {
    super(p);
  }

  /** Metode render untuk kelas Entrance yang di override dari Kelas Render. */
  @Override
  public char render() {
    return 'I';
  }
}
