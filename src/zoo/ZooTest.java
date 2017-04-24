package zoo;

import cell.habitat.airhabitat.AirHabitat;
import org.junit.Test;
import point.Point;

import static org.junit.Assert.assertEquals;

/**
 * Created by Hishamlazuardi on 24/04/2017.
 */
public class ZooTest {
  private Zoo zooTest = new Zoo(15,15);

  @Test
  public void testSetCellType() throws Exception {
    boolean cell = false;
    zooTest.setCellType(new Point(5,5), 'a');
    if (zooTest.getCell(new Point(5,5)) instanceof AirHabitat) {
      cell = true;
    }
    assertEquals(true, cell);
  }

  @Test
  public void testGetBaris() throws Exception {
    assertEquals(15, zooTest.getBaris());
  }

  @Test
  public void testGetKolom() throws Exception {
    assertEquals(15, zooTest.getKolom());
  }

  @Test
  public void testGetCell() throws Exception {
    boolean cell = false;
    zooTest.setCellType(new Point(5,5), 'a');
    if (zooTest.getCell(new Point(5,5)) instanceof AirHabitat) {
      cell = true;
    }
    assertEquals(true, cell);
  }

  @Test
  public void testDisplay() throws Exception {
  }

}