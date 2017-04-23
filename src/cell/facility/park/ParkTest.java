package cell.facility.park;

import static org.junit.Assert.*;
import org.junit.Test;
import point.Point;

/**
 * Created by Hishamlazuardi on 23/04/2017.
 */
public class ParkTest {
  private Park park = new Park(new Point(7,2));

  @Test
  public void testRender() throws Exception {
    assertEquals('#', park.render());
  }

  @Test
  public void testSetPos() throws Exception {
    park.setPos(new Point(10,5));
    assertEquals(10, park.getPos().getX());
    assertEquals(5, park.getPos().getY());
  }

  @Test
  public void testGetPos() throws Exception {
    assertEquals(7, park.getPos().getX());
    assertEquals(2, park.getPos().getY());
  }

}