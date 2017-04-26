package animal.flyanimal.merak;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


/**
 * Created by Hishamlazuardi on 22/04/2017.
 */
public class MerakTest {
  private Merak ff = new Merak(10, 15, 20, false);

  @Test
  public void testInteract() throws Exception {
    ff.interact();
  }

  @Test
  public void testGetLocation() throws Exception {
    assertEquals(10, ff.getLocation().getX());
    assertEquals(15, ff.getLocation().getY());
  }

  @Test
  public void testGetBeratBadan() throws Exception {
    assertEquals(20, ff.getBeratBadan(), 0);
  }

  @Test
  public void testIsBuas() throws Exception {
    assertEquals(false, ff.isBuas());
  }

  @Test
  public void testGetPorsiMakanan() throws Exception {
    assertEquals((0.05 * 20), ff.getPorsiMakanan(), 0.05);
  }

  @Test
  public void testIsLandAnimal() throws Exception {
    assertEquals(false, ff.isLandAnimal());
  }

  @Test
  public void testIsWaterAnimal() throws Exception {
    assertEquals(false, ff.isWaterAnimal());
  }

  @Test
  public void testIsFlyAnimal() throws Exception {
    assertEquals(true, ff.isFlyAnimal());
  }

  @Test
  public void testIsHerbivor() throws Exception {
    assertEquals(true, ff.isHerbivor());
  }

  @Test
  public void testIsKarnivor() throws Exception {
    assertEquals(false, ff.isKarnivor());
  }

}