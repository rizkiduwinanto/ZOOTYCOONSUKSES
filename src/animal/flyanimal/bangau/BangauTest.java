package animal.flyanimal.bangau;

import point.Point;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by hishaml on 4/14/17.
 */
public class BangauTest {
  @Test
  public void testInteract() throws Exception {
    Bangau f = new Bangau(5, 5, 15, false);
    f.interact();
  }

  @Test
  public void testGetLocation() throws Exception {
    Bangau f = new Bangau(5, 5, 15, false);
    assertEquals(5, f.getLocation().getX());
    assertEquals(5, f.getLocation().getX());
  }

  @Test
  public void testGetBeratBadan() throws Exception {
    Bangau f = new Bangau(5, 5, 15, false);
    assertEquals(15, f.getBeratBadan(), 0);
  }

  @Test
  public void testIsBuas() throws Exception {
    Bangau f = new Bangau(5, 5, 15, false);
    assertEquals(false, f.isBuas());
  }

  @Test
  public void testGetPorsiMakanan() throws Exception {
    Bangau f = new Bangau(5, 5, 15, false);
    assertEquals((0.05 * 15), f.getPorsiMakanan(), 0);
  }

  @Test
  public void testIsLandAnimal() throws Exception {
    Bangau f = new Bangau(5, 5, 15, false);
    assertEquals(false, f.isLandAnimal());
  }

  @Test
  public void testIsWaterAnimal() throws Exception {
    Bangau f = new Bangau(5, 5, 15, false);
    assertEquals(false, f.isWaterAnimal());
  }

  @Test
  public void testIsFlyAnimal() throws Exception {
    Bangau f = new Bangau(5, 5, 15, false);
    assertEquals(true, f.isFlyAnimal());
  }

  @Test
  public void testIsHerbivor() throws Exception {
    Bangau f = new Bangau(5, 5, 15, false);
    assertEquals(false, f.isHerbivor());
  }

  @Test
  public void testIsKarnivor() throws Exception {
    Bangau f = new Bangau(5, 5, 15, false);
    assertEquals(true, f.isKarnivor());
  }
}