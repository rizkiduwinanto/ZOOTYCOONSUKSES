package animal.landanimal.zebra;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


/**
 * Created by Hishamlazuardi on 22/04/2017.
 */
public class ZebraTest {
  private Zebra ll = new Zebra(5, 5, 60, false);

  @Test
  public void testInteract() throws Exception {
    ll.interact();
  }

  @Test
  public void testGetLocation() throws Exception {
    assertEquals(5, ll.getLocation().getX());
    assertEquals(5, ll.getLocation().getY());
  }

  @Test
  public void testGetBeratBadan() throws Exception {
    assertEquals(60, ll.getBeratBadan(), 0);
  }

  @Test
  public void testIsBuas() throws Exception {
    assertEquals(false, ll.isBuas());
  }

  @Test
  public void testGetPorsiMakanan() throws Exception {
    assertEquals((0.05 * 60), ll.getPorsiMakanan(), 0.05);
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
    assertEquals(true, ll.isHerbivor());
  }

  @Test
  public void testIsKarnivor() throws Exception {
    assertEquals(false, ll.isKarnivor());
  }

}