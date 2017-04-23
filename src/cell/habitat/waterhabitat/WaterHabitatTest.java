package cell.habitat.waterhabitat;

import static org.junit.Assert.assertEquals;

import animal.Animal;
import animal.flyanimal.bangau.Bangau;
import cell.habitat.waterhabitat.WaterHabitat;
import junit.framework.TestCase;
import org.junit.Test;
import point.Point;

/**
 * Created by Hishamlazuardi on 23/04/2017.
 */
public class WaterHabitatTest extends TestCase {
  private WaterHabitat waterHabitat = new WaterHabitat(new Point(5,3));

  @Test
  public void testRender() throws Exception {
    assertEquals('w', waterHabitat.render());
  }

  @Test
  public void testIsAirHabitat() throws Exception {
    assertEquals(false, waterHabitat.isAirHabitat());
  }

  @Test
  public void testIsWaterHabitat() throws Exception {
    assertEquals(true, waterHabitat.isWaterHabitat());
  }

  @Test
  public void testIsLandHabitat() throws Exception {
    assertEquals(false, waterHabitat.isLandHabitat());
  }

  @Test
  public void testGetHewan() throws Exception {
    Animal hewan = new Bangau(10, 10, 30, false);
    waterHabitat.addHewan(hewan);
    assertEquals(hewan, waterHabitat.getHewan());
  }

  @Test
  public void testAddHewan() throws Exception {
    Animal hewan = new Bangau(10, 10, 30, false);
    waterHabitat.addHewan(hewan);
    assertEquals(hewan, waterHabitat.getHewan());
  }

  @Test
  public void testSetPos() throws Exception {
    waterHabitat.setPos(new Point(10, 7));
    assertEquals(10, waterHabitat.getPos().getX());
    assertEquals(7, waterHabitat.getPos().getY());
  }

  @Test
  public void testGetPos() throws Exception {
    assertEquals(5, waterHabitat.getPos().getX());
    assertEquals(3, waterHabitat.getPos().getY());
  }

}