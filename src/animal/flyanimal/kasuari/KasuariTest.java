package animal.flyanimal.kasuari;

import static org.junit.Assert.assertEquals;

import javax.annotation.processing.SupportedAnnotationTypes;
import org.junit.Test;




/**
 * Created by Hishamlazuardi on 22/04/2017.
 */
public class KasuariTest {
  private Kasuari ff = new Kasuari(1,3, 7, false);

  @Test
  public void testInteract() throws Exception {
    ff.interact();
  }

  @Test
  public void testGetLocation() throws Exception {
    assertEquals(1, ff.getLocation().getX());
    assertEquals(3, ff.getLocation().getY());
  }

  @Test
  public void testGetBeratBadan() throws Exception {
    assertEquals(7, ff.getBeratBadan(), 0);
  }

  @Test
  public void testIsBuas() throws Exception {
    assertEquals(false, ff.isBuas());
  }

  @Test
  public void testGetPorsiMakanan() throws Exception {
    assertEquals((0.05 * 7), ff.getPorsiMakanan(), 0.05);
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