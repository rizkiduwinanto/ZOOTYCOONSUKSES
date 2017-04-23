package point;

import junit.framework.TestCase;

/**
 * Created by AZIS ADI KUNCORO (13515120) on 23/04/2017.
 */
public class PointTest extends TestCase {
  private Point p = new Point(5,6);
  public void testGetX() throws Exception {
    assertEquals(5,p.getX());
  }

  public void testGetY() throws Exception {
    assertEquals(6,p.getY());
  }

  public void testToString() throws Exception {
    assertEquals("[ 5 , 6 ]",p.toString());
  }

}