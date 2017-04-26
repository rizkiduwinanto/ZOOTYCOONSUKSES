package point;

/**
 * Created by AZIS ADI KUNCORO (13515120) on 22/04/2017.
 */
public class Point {
  private int absis;
  private int ordinat;

  public Point(int x, int y) {
    absis = x;
    ordinat = y;
  }

  public Point(final Point p) {
    absis = p.absis;
    ordinat = p.ordinat;
  }

  /* ==GETTER== */

  public final int getX() {
    return absis;
  }

  public final int getY() {
    return ordinat;
  }

  /* ========= */

  @Override
  public String toString() {
    return ("[ " + getX() + " , " + getY() + " ]");
  }
  
  /** 
   * Memeriksa apakah kedua point tersebut sama.
   * @param p2 Point kedua yang akan dibandingkan
   * @return isEqual
   */
  public boolean isEqual(Point p2) {
    return (getX() == p2.getX() && getY() == p2.getY());
  }
}
