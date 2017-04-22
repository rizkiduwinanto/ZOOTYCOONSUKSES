package animal.amphibi.kodok;

import point.Point;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by hishaml on 4/11/17.
 */
public class KodokTest {
  @Test
  public void testInteract() throws Exception {
    Kodok K = new Kodok(1,1,5, false);
    K.interact();
  }

  @Test
  public void testGetLocation() throws Exception {
    Kodok K = new Kodok(1,1,5, false);
    Point P = new Point(1, 1);
    assertEquals(P.getX(), K.getLocation().getX());
    assertEquals(P.getY(), K.getLocation().getY());
  }

  @Test
  public void testGetBeratBadan() throws Exception {
    Kodok K = new Kodok(1,1,5, false);
    float berat = 5;
    assertEquals(berat, K.getBeratBadan(), 0);
  }

  @Test
  public void testIsBuas() throws Exception {
    Kodok K = new Kodok(1,1,5, false);
    boolean buas = false;
    assertEquals(buas, K.isBuas());
  }

  @Test
  public void testGetPorsiMakanan() throws Exception {
    Kodok K = new Kodok(1,1,5, false);
    float testMakan = (float) 0.05 * 5;
    assertEquals(testMakan, K.getPorsiMakanan(), 0);
  }

  @Test
  public void testIsLandAnimal() throws Exception {
    Kodok K = new Kodok(1,1,5, false);
    boolean landTest = true;
    assertEquals(landTest, K.isLandAnimal());
  }

  @Test
  public void testIsWaterAnimal() throws Exception {
    Kodok K = new Kodok(1,1,5, false);
    boolean waterTest = true;
    assertEquals(waterTest, K.isWaterAnimal());
  }

  @Test
  public void testIsFlyAnimal() throws Exception {
    Kodok K = new Kodok(1,1,5, false);
    boolean flyTest = false;
    assertEquals(flyTest, K.isFlyAnimal());
  }

  @Test
  public void testIsHerbivor() throws Exception {
    Kodok K = new Kodok(1,1,5, false);
    boolean herbivorTest = false;
    assertEquals(herbivorTest, K.isHerbivor());
  }

  @Test
  public void testIsKarnivor() throws Exception {
    Kodok K = new Kodok(1,1,5, false);
    boolean karnivorTest = true;
    assertEquals(karnivorTest, K.isKarnivor());
  }
}