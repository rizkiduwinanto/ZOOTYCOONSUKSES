package animal.flyanimal.merak;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Hishamlazuardi on 22/04/2017.
 */
public class MerakTest {
  private Merak f = new Merak(10, 15, 20, false);

  @Test
  public void testInteract() throws Exception {
    f.interact();
  }

  @Test
  public void testGetLocation() throws Exception {
    assertEquals(10, f.getLocation().getX());
    assertEquals(15, f.getLocation().getY());
  }

  @Test
  public void testGetBeratBadan() throws Exception {
    assertEquals(20, f.getBeratBadan(), 0);
  }

  @Test
  public void testIsBuas() throws Exception {
    assertEquals(false, f.isBuas());
  }

  @Test
  public void testGetPorsiMakanan() throws Exception {
    assertEquals((0.05 * 20), f.getPorsiMakanan(), 0.05);
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