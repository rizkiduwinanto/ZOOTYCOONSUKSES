package animal.wateranimal.anjinglaut;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


/**
 * Created by Hishamlazuardi on 22/04/2017.
 */
public class AnjingLautTest {
  private AnjingLaut ww = new AnjingLaut(10, 10, 80, false);

  @Test
  public void testInteract() throws Exception {
    ww.interact();
  }

  @Test
  public void testGetLocation() throws Exception {
    assertEquals(10, ww.getLocation().getX());
    assertEquals(10, ww.getLocation().getY());
  }

  @Test
  public void testGetBeratBadan() throws Exception {
    assertEquals(80, ww.getBeratBadan(), 0);
  }

  @Test
  public void testIsBuas() throws Exception {
    assertEquals(false, ww.isBuas());
  }

  @Test
  public void testGetPorsiMakanan() throws Exception {
    assertEquals((0.05 * 80), ww.getPorsiMakanan(), 0.05);
  }

  @Test
  public void testIsLandAnimal() throws Exception {
    assertEquals(false, ww.isLandAnimal());
  }

  @Test
  public void testIsWaterAnimal() throws Exception {
    assertEquals(true, ww.isWaterAnimal());
  }

  @Test
  public void testIsFlyAnimal() throws Exception {
    assertEquals(false, ww.isFlyAnimal());
  }

  @Test
  public void testIsHerbivor() throws Exception {
    assertEquals(false, ww.isHerbivor());
  }

  @Test
  public void testIsKarnivor() throws Exception {
    assertEquals(true, ww.isKarnivor());
  }

}