package cell.facility.restaurant;

import cell.facility.Facility;
import point.Point;

/** Kelas Restaurant bertanggung jawab mengelola Restaurant.
 * @author AZIS ADI KUNCORO (13515120)
 * @version 3.0
 */
public class Restaurant extends Facility {
  /** Konstruktor Restaurant dengan parameter .
   * @param p Merupakan posisi Restaurant.
   */
  public Restaurant(Point p) {
    super(p);
  }

  /** Metode render untuk kelas Restaurant yang di override dari Kelas Render. */
  @Override
  public char render() {
    return 'R';
  }
}
