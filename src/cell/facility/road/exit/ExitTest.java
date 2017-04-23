package cell.facility.road.exit;

import static org.junit.Assert.assertEquals;

import junit.framework.TestCase;
import org.junit.Test;
import point.Point;

/**
 * Created by Hishamlazuardi on 23/04/2017.
 */
public class ExitTest extends TestCase {
  private Exit exit = new Exit(new Point(4, 7));

  @Test
  public void testRender() throws Exception {
    assertEquals('O', exit.render());
  }

  @Test
  public void testSetPos() throws Exception {
    exit.setPos(new Point(7,6));
    assertEquals(7, exit.getPos().getX());
    assertEquals(6, exit.getPos().getY());
  }

  public void testGetPos() throws Exception {
    assertEquals(4, exit.getPos().getX());
    assertEquals(7, exit.getPos().getY());
  }

}