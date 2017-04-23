package animal.landanimal.singa;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Hishamlazuardi on 22/04/2017.
 */
public class SingaTest {
  private Singa l = new Singa(5,5,140, true);

  @Test
  public void testInteract() throws Exception {
    l.interact();
  }

  @Test
  public void testGetLocation() throws Exception {
    assertEquals(5, l.getLocation().getX());
    assertEquals(5, l.getLocation().getY());
  }

  @Test
  public void testGetBeratBadan() throws Exception {
    assertEquals(140, l.getBeratBadan(), 0);
  }

  @Test
  public void testIsBuas() throws Exception {
    assertEquals(true, l.isBuas());
  }

  @Test
  public void testGetPorsiMakanan() throws Exception {
    assertEquals((0.05 * 140), l.getPorsiMakanan(), 0.05);
  }

  @Test
  public void testIsLandAnimal() throws Exception {
    assertEquals(true, l.isLandAnimal());
  }

  @Test
  public void testIsWaterAnimal() throws Exception {
    assertEquals(false, l.isWaterAnimal());
  }

  @Test
  public void testIsFlyAnimal() throws Exception {
    assertEquals(false, l.isFlyAnimal());
  }

  @Test
  public void testIsHerbivor() throws Exception {
    assertEquals(false, l.isHerbivor());
  }

  @Test
  public void testIsKarnivor() throws Exception {
    assertEquals(true, l.isKarnivor());
  }

}