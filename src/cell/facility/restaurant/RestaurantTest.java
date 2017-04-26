package cell.facility.restaurant;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import point.Point;

/**
 * Created by Hishamlazuardi on 23/04/2017.
 */
public class RestaurantTest {
  private Restaurant restaurant = new Restaurant(new Point(7,2));

  @Test
  public void testRender() throws Exception {
    assertEquals('R', restaurant.render());
  }

  @Test
  public void testSetPos() throws Exception {
    restaurant.setPos(new Point(10, 5));
    assertEquals(10, restaurant.getPos().getX());
    assertEquals(5, restaurant.getPos().getY());
  }

  @Test
  public void testGetPos() throws Exception {
    assertEquals(7, restaurant.getPos().getX());
    assertEquals(2, restaurant.getPos().getY());
  }

}