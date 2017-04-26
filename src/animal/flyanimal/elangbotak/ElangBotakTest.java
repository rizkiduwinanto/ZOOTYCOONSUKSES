package animal.flyanimal.elangbotak;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


/**
 * Created by Hishamlazuardi on 22/04/2017.
 */
public class ElangBotakTest {
  private ElangBotak ff = new ElangBotak(7, 10, 30, true);

  @Test
  public void testInteract() throws Exception {
    ff.interact();
  }

  @Test
  public void testGetLocation() throws Exception {
    assertEquals(7, ff.getLocation().getX());
    assertEquals(10, ff.getLocation().getY());
  }

  @Test
  public void testGetBeratBadan() throws Exception {
    assertEquals(30, ff.getBeratBadan(), 0);
  }

  @Test
  public void testIsBuas() throws Exception {
    assertEquals(true, ff.isBuas());
  }

  @Test
  public void testGetPorsiMakanan() throws Exception {
    assertEquals((0.05 * 30), ff.getPorsiMakanan(), 0);
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
    assertEquals(false, ff.isHerbivor());
  }

  @Test
  public void testIsKarnivor() throws Exception {
    assertEquals(true, ff.isKarnivor());
  }

}