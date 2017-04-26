package cell;

import point.Point;
import renderable.Renderable;


/** Kelas Cell bertanggung jawab atas kebutuhan-kebutuhan cell.
 * @author AZIS ADI KUNCORO (13515120)
 * @version 3.0
 */
public abstract class Cell implements Renderable  {
  private Point position;

  /** Konstruktor Cell dengan Parameter Point.
   * @param p Merupakan posisi suatu Cell.
   */
  public Cell(Point p) {
    position = new Point(p.getX(),p.getY());
  }

  /** Setter Posisi suatu Cell.
   * @param p Merupakan posisi baru untuk Cell.
   */
  public void setPos(Point p) {
    position = new Point(p.getX(),p.getY());
  }

  /** Getter Posisi suatu Cell.
   * @return Mengembalikan posisi Cell.
   */
  public Point getPos() {
    return position;
  }
}