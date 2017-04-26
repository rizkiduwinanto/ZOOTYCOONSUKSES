package animal.landanimal.harimau;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


/**
 * Created by Hishamlazuardi on 22/04/2017.
 */
public class HarimauTest {
  private Harimau ll = new Harimau(9, 5, 70, true);

  @Test
  public void testInteract() throws Exception {
    ll.interact();
  }

  @Test
  public void testGetLocation() throws Exception {
    assertEquals(9, ll.getLocation().getX());
    assertEquals(5, ll.getLocation().getY());
  }

  @Test
  public void testGetBeratBadan() throws Exception {
    assertEquals(70, ll.getBeratBadan(), 0);
  }

  @Test
  public void testIsBuas() throws Exception {
    assertEquals(true, ll.isBuas());
  }

  @Test
  public void testGetPorsiMakanan() throws Exception {
    assertEquals((0.05 * 70), ll.getPorsiMakanan(), 0.05);
  }

  @Test
  public void testIsLandAnimal() throws Exception {
    assertEquals(true, ll.isLandAnimal());
  }

  @Test
  public void testIsWaterAnimal() throws Exception {
    assertEquals(false, ll.isWaterAnimal());
  }

  @Test
  public void testIsFlyAnimal() throws Exception {
    assertEquals(false, ll.isFlyAnimal());
  }

  @Test
  public void testIsHerbivor() throws Exception {
    assertEquals(false, ll.isHerbivor());
  }

  @Test
  public void testIsKarnivor() throws Exception {
    assertEquals(true, ll.isKarnivor());
  }

}