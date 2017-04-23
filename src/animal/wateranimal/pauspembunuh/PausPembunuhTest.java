package animal.wateranimal.pauspembunuh;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Created by Hishamlazuardi on 22/04/2017.
 */
public class PausPembunuhTest {
  private PausPembunuh w = new PausPembunuh(20, 20, 300, false);

  @Test
  public void testInteract() throws Exception {
    w.interact();
  }

  @Test
  public void testGetLocation() throws Exception {
    assertEquals(20, w.getLocation().getX());
    assertEquals(20, w.getLocation().getY());
  }

  @Test
  public void testGetBeratBadan() throws Exception {
    assertEquals(300, w.getBeratBadan(), 0);
  }

  @Test
  public void testIsBuas() throws Exception {
    assertEquals(false, w.isBuas());
  }

  @Test
  public void testGetPorsiMakanan() throws Exception {
    assertEquals((0.05 * 300), w.getPorsiMakanan(), 0.05);
  }

  @Test
  public void testIsLandAnimal() throws Exception {
    assertEquals(false, w.isLandAnimal());
  }

  @Test
  public void testIsWaterAnimal() throws Exception {
    assertEquals(true, w.isWaterAnimal());
  }

  @Test
  public void testIsFlyAnimal() throws Exception {
    assertEquals(false, w.isFlyAnimal());
  }

  @Test
  public void testIsHerbivor() throws Exception {
    assertEquals(false, w.isHerbivor());
  }

  @Test
  public void testIsKarnivor() throws Exception {
    assertEquals(true, w.isKarnivor());
  }

}