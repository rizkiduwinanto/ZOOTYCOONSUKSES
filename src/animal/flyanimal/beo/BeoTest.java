package animal.flyanimal.beo;

import static org.junit.Assert.assertEquals;

import junit.framework.TestCase;
import org.junit.Test;




/**
 * Created by hishaml on 4/14/17.
 */
public class BeoTest {

  @Test
  public void testInteract() throws Exception {
    Beo f = new Beo(5, 5, 10, false);
    f.interact();
  }

  @Test
  public void testGetLocation() throws Exception {
    Beo f = new Beo(5, 5, 10, false);
    assertEquals(5, f.getLocation().getX());
    assertEquals(5, f.getLocation().getY());
  }

  @Test
  public void testGetBeratBadan() throws Exception {
    Beo f = new Beo(5, 5, 10, false);
    assertEquals(10, f.getBeratBadan(), 0);
  }

  @Test
  public void testIsBuas() throws Exception {
    Beo f = new Beo(5, 5, 10, false);
    assertEquals(false, f.isBuas());
  }

  @Test
  public void testGetPorsiMakanan() throws Exception {
    Beo f = new Beo(5, 5, 10, false);
    assertEquals((0.05 * 10), f.getPorsiMakanan(), 0);
  }

  @Test
  public void testIsLandAnimal() throws Exception {
    Beo f = new Beo(5, 5, 10, false);
    assertEquals(false, f.isLandAnimal());
  }

  @Test
  public void testIsWaterAnimal() throws Exception {
    Beo f = new Beo(5, 5, 10, false);
    assertEquals(false, f.isWaterAnimal());
  }

  @Test
  public void testIsFlyAnimal() throws Exception {
    Beo f = new Beo(5, 5, 10, false);
    assertEquals(true, f.isFlyAnimal());
  }

  @Test
  public void testIsHerbivor() throws Exception {
    Beo f = new Beo(5, 5, 10, false);
    assertEquals(true, f.isHerbivor());
  }

  @Test
  public void testIsKarnivor() throws Exception {
    Beo f = new Beo(5, 5, 10, false);
    assertEquals(false, f.isKarnivor());
  }

}