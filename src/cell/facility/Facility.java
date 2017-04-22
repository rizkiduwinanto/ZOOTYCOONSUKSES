package cell.facility;

import cell.Cell;
import point.Point;

/** Kelas Facility bertanggung jawab mengelola Facility.
 * @author AZIS ADI KUNCORO (13515120)
 * @version 3.0
 */
public abstract class Facility extends Cell {
  /** Konstruktor Facility dengan parameter.
   * @param p Merupakan posisi Facility.
   */
  public Facility(Point p) {
    super(p);
  }
}
