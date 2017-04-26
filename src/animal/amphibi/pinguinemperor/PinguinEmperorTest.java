package animal.amphibi.pinguinemperor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import point.Point;



/**
 * Created by hishaml on 4/11/17.
 */
public class PinguinEmperorTest {
  @Test
  public void testInteract() throws Exception {
    PinguinEmperor kk = new PinguinEmperor(1,1,20, false);
    kk.interact();
  }

  @Test
  public void testGetLocation() throws Exception {
    PinguinEmperor kk = new PinguinEmperor(1,1,20, false);
    Point pp = new Point(1, 1);
    assertEquals(pp.getX(), kk.getLocation().getX());
    assertEquals(pp.getY(), kk.getLocation().getY());
  }

  @Test
  public void testGetBeratBadan() throws Exception {
    PinguinEmperor kk = new PinguinEmperor(1,1,20, false);
    float berat = 20;
    assertEquals(berat, kk.getBeratBadan(), 0);
  }

  @Test
  public void testIsBuas() throws Exception {
    PinguinEmperor kk = new PinguinEmperor(1,1,20, false);
    boolean buas = false;
    assertEquals(buas, kk.isBuas());
  }

  @Test
  public void testGetPorsiMakanan() throws Exception {
    PinguinEmperor kk = new PinguinEmperor(1,1,20, false);
    float testMakan = (float) 0.05 * 20;
    assertEquals(testMakan, kk.getPorsiMakanan(), 0);
  }

  @Test
  public void testIsLandAnimal() throws Exception {
    PinguinEmperor kk = new PinguinEmperor(1,1,20, false);
    boolean landTest = true;
    assertEquals(landTest, kk.isLandAnimal());
  }

  @Test
  public void testIsWaterAnimal() throws Exception {
    PinguinEmperor kk = new PinguinEmperor(1,1,20, false);
    boolean waterTest = true;
    assertEquals(waterTest, kk.isWaterAnimal());
  }

  @Test
  public void testIsFlyAnimal() throws Exception {
    PinguinEmperor kk = new PinguinEmperor(1,1,20, false);
    boolean flyTest = false;
    assertEquals(flyTest, kk.isFlyAnimal());
  }

  @Test
  public void testIsHerbivor() throws Exception {
    PinguinEmperor kk = new PinguinEmperor(1,1,20, false);
    boolean herbivorTest = false;
    assertEquals(herbivorTest, kk.isHerbivor());
  }

  @Test
  public void testIsKarnivor() throws Exception {
    PinguinEmperor kk = new PinguinEmperor(1,1,20, false);
    boolean karnivorTest = true;
    assertEquals(karnivorTest, kk.isKarnivor());
  }
}