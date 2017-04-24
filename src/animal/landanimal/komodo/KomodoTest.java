package animal.landanimal.komodo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Hishamlazuardi on 22/04/2017.
 */
public class KomodoTest {
  private Komodo l = new Komodo(12, 4, 120, true);

  @Test
  public void testInteract() throws Exception {
    l.interact();
  }

  @Test
  public void testGetLocation() throws Exception {
    assertEquals(12, l.getLocation().getX());
    assertEquals(4, l.getLocation().getY());
  }

  @Test
  public void testGetBeratBadan() throws Exception {
    assertEquals(120, l.getBeratBadan(), 0);
  }

  @Test
  public void testIsBuas() throws Exception {
    assertEquals(true, l.isBuas());
  }

  @Test
  public void testGetPorsiMakanan() throws Exception {
    assertEquals((0.05 * 120), l.getPorsiMakanan(), 0.05);
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