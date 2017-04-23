package cell.habitat.airhabitat;

import animal.Animal;
import animal.flyanimal.bangau.Bangau;
import org.junit.Test;
import static org.junit.Assert.*;
import point.Point;

/**
 * Created by Hishamlazuardi on 23/04/2017.
 */
public class AirHabitatTest {
  private AirHabitat airHabitat = new AirHabitat(new Point(5,3));

  @Test
  public void testRender() throws Exception {
    assertEquals('a', airHabitat.render());
  }

  @Test
  public void testIsAirHabitat() throws Exception {
    assertEquals(true, airHabitat.isAirHabitat());
  }

  @Test
  public void testIsWaterHabitat() throws Exception {
    assertEquals(false, airHabitat.isWaterHabitat());
  }

  @Test
  public void testIsLandHabitat() throws Exception {
    assertEquals(false, airHabitat.isLandHabitat());
  }

  @Test
  public void testGetHewan() throws Exception {
    Animal hewan = new Bangau(10, 10, 30, false);
    airHabitat.addHewan(hewan);
    assertEquals(hewan, airHabitat.getHewan());
  }

  @Test
  public void testAddHewan() throws Exception {
    Animal hewan = new Bangau(10, 10, 30, false);
    airHabitat.addHewan(hewan);
    assertEquals(hewan, airHabitat.getHewan());
  }

  @Test
  public void testSetPos() throws Exception {
    airHabitat.setPos(new Point(10, 7));
    assertEquals(10, airHabitat.getPos().getX());
    assertEquals(7, airHabitat.getPos().getY());
  }

  @Test
  public void testGetPos() throws Exception {
    assertEquals(5, airHabitat.getPos().getX());
    assertEquals(3, airHabitat.getPos().getY());
  }

}