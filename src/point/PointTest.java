package point;

import junit.framework.TestCase;

/**
 * Created by AZIS ADI KUNCORO (13515120) on 23/04/2017.
 */
public class PointTest extends TestCase {
  private Point p1 = new Point(5,6);
  
  public void testGetX() throws Exception {
    assertEquals(5,p1.getX());
  }

  public void testGetY() throws Exception {
    assertEquals(6,p1.getY());
  }

  public void testToString() throws Exception {
    assertEquals("[ 5 , 6 ]",p1.toString());
  }

}