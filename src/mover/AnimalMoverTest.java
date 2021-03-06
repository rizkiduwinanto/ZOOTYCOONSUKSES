package mover;

import static org.junit.Assert.assertEquals;

import animal.Animal;
import animal.amphibi.kodok.Kodok;
import cell.habitat.Habitat;
import loader.Loader;
import mainmodel.ProfileModel;
import org.junit.Test;
import point.Point;
import zoo.Zoo;

/**
 * Created by Hishamlazuardi on 25/04/2017.
 */
public class AnimalMoverTest {
  private Zoo myZoo = Loader.loadZoo(ProfileModel.getProfileName());
  private Animal hewan = new Kodok(3, 5, 15, false);

  @Test
  public void testMoveAnimal() throws Exception {
    ((Habitat)myZoo.getCell(new Point(3, 5))).addHewan(hewan);
    assertEquals(hewan, ((Habitat)myZoo.getCell(new Point(3, 5))).getHewan());
    AnimalMover.moveAnimal(myZoo, hewan);
    assertEquals(null, ((Habitat)myZoo.getCell(new Point(3, 5))).getHewan());
    assertEquals(hewan, ((Habitat)myZoo.getCell(
        new Point(hewan.getLocation().getX(), hewan.getLocation().getY()))).getHewan());
    System.out.println(hewan.getLocation());
    /*assertEquals(2, hewan.getLocation().getX());
    assertEquals(5, hewan.getLocation().getY());*/
  }
}