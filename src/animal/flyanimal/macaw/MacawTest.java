package animal.flyanimal.macaw;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Hishamlazuardi on 22/04/2017.
 */
public class MacawTest {
  private Macaw f = new Macaw(5,6,10,false);

  @Test
  public void testInteract() throws Exception {
    f.interact();
  }

  @Test
  public void testGetLocation() throws Exception {
    assertEquals(5, f.getLocation().getX());
    assertEquals(6, f.getLocation().getY());
  }

  @Test
  public void testGetBeratBadan() throws Exception {
    assertEquals(10, f.getBeratBadan(), 0);
  }

  @Test
  public void testIsBuas() throws Exception {
    assertEquals(false, f.isBuas());
  }

  @Test
  public void testGetPorsiMakanan() throws Exception {
    assertEquals((0.05 * 10), f.getPorsiMakanan(), 0);
  }

  @Test
  public void testIsLandAnimal() throws Exception {
    assertEquals(false, f.isLandAnimal());
  }

  @Test
  public void testIsWaterAnimal() throws Exception {
    assertEquals(false, f.isWaterAnimal());
  }

  @Test
  public void testIsFlyAnimal() throws Exception {
    assertEquals(true, f.isFlyAnimal());
  }

  @Test
  public void testIsHerbivor() throws Exception {
    assertEquals(true, f.isHerbivor());
  }

  @Test
  public void testIsKarnivor() throws Exception {
    assertEquals(false, f.isKarnivor());
  }
}