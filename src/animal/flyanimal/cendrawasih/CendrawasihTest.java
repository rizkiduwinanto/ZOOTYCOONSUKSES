package animal.flyanimal.cendrawasih;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


/**
 * Created by Hishamlazuardi on 22/04/2017.
 */
public class CendrawasihTest {
  private Cendrawasih ff = new Cendrawasih(3, 5, 10, false);

  @Test
  public void testInteract() throws Exception {
    ff.interact();
  }

  @Test
  public void testGetLocation() throws Exception {
    assertEquals(3, ff.getLocation().getX());
    assertEquals(5, ff.getLocation().getY());
  }

  @Test
  public void testGetBeratBadan() throws Exception {
    assertEquals(10, ff.getBeratBadan(), 0);
  }

  @Test
  public void testIsBuas() throws Exception {
    assertEquals(false, ff.isBuas());
  }

  @Test
  public void testGetPorsiMakanan() throws Exception {
    assertEquals((0.05 * 10), ff.getPorsiMakanan(), 0);
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