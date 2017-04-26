package cell.facility.road.entrance;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import point.Point;

/**
 * Created by Hishamlazuardi on 23/04/2017.
 */
public class EntranceTest {
  private Entrance entrance = new Entrance(new Point(1, 1));

  @Test
  public void testRender() throws Exception {
    assertEquals('I', entrance.render());
  }

  @Test
  public void testSetPos() throws Exception {
    entrance.setPos(new Point(7,6));
    assertEquals(7, entrance.getPos().getX());
    assertEquals(6, entrance.getPos().getY());
  }

  public void testGetPos() throws Exception {
    assertEquals(1, entrance.getPos().getX());
    assertEquals(1, entrance.getPos().getY());
  }

}