package animal.flyanimal.kasuari;

import javax.annotation.processing.SupportedAnnotationTypes;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Hishamlazuardi on 22/04/2017.
 */
public class KasuariTest {
  private Kasuari f = new Kasuari (1,3, 7, false);

  @Test
  public void testInteract() throws Exception {
    f.interact();
  }

  @Test
  public void testGetLocation() throws Exception {
    assertEquals(1, f.getLocation().getX());
    assertEquals(3, f.getLocation().getY());
  }

  @Test
  public void testGetBeratBadan() throws Exception {
    assertEquals(7, f.getBeratBadan(), 0);
  }

  @Test
  public void testIsBuas() throws Exception {
    assertEquals(false, f.isBuas());
  }

  @Test
  public void testGetPorsiMakanan() throws Exception {
    assertEquals((0.05 * 7), f.getPorsiMakanan(), 0.05);
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