package cell.habitat.landhabitat;

import static org.junit.Assert.assertEquals;

import animal.Animal;
import animal.flyanimal.bangau.Bangau;
import cell.habitat.landhabitat.LandHabitat;
import junit.framework.TestCase;
import org.junit.Test;
import point.Point;

/**
 * Created by Hishamlazuardi on 23/04/2017.
 */
public class LandHabitatTest extends TestCase {
  private LandHabitat landHabitat = new LandHabitat(new Point(5,3));

  @Test
  public void testRender() throws Exception {
    assertEquals('x', landHabitat.render());
  }

  @Test
  public void testIsAirHabitat() throws Exception {
    assertEquals(false, landHabitat.isAirHabitat());
  }

  @Test
  public void testIsWaterHabitat() throws Exception {
    assertEquals(false, landHabitat.isWaterHabitat());
  }

  @Test
  public void testIsLandHabitat() throws Exception {
    assertEquals(true, landHabitat.isLandHabitat());
  }

  @Test
  public void testGetHewan() throws Exception {
    Animal hewan = new Bangau(10, 10, 30, false);
    landHabitat.addHewan(hewan);
    assertEquals(hewan, landHabitat.getHewan());
  }

  @Test
  public void testAddHewan() throws Exception {
    Animal hewan = new Bangau(10, 10, 30, false);
    landHabitat.addHewan(hewan);
    assertEquals(hewan, landHabitat.getHewan());
  }

  @Test
  public void testSetPos() throws Exception {
    landHabitat.setPos(new Point(10, 7));
    assertEquals(10, landHabitat.getPos().getX());
    assertEquals(7, landHabitat.getPos().getY());
  }

  @Test
  public void testGetPos() throws Exception {
    assertEquals(5, landHabitat.getPos().getX());
    assertEquals(3, landHabitat.getPos().getY());
  }

}