package animal.flyanimal.kelelawarvampir;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


/**
 * Created by Hishamlazuardi on 22/04/2017.
 */
public class KelelawarVampirTest {
  private KelelawarVampir ff = new KelelawarVampir(6, 10, 5, false);

  @Test
  public void testInteract() throws Exception {
    ff.interact();
  }

  @Test
  public void testGetLocation() throws Exception {
    assertEquals(6, ff.getLocation().getX());
    assertEquals(10, ff.getLocation().getY());
  }

  @Test
  public void testGetBeratBadan() throws Exception {
    assertEquals(5, ff.getBeratBadan(), 0);
  }

  @Test
  public void testIsBuas() throws Exception {
    assertEquals(false, ff.isBuas());
  }

  @Test
  public void testGetPorsiMakanan() throws Exception {
    assertEquals((0.05 * 5), ff.getPorsiMakanan(), 0.05);
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