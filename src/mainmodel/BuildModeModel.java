package mainmodel;

import animal.Animal;
import cell.habitat.Habitat;
import java.lang.Thread.State;
import java.util.ArrayList;
import loader.Loader;
import mover.AnimalThread;
import mover.MapThread;
import point.Point;
import zoo.Zoo;

/**
 * Created by AZIS ADI KUNCORO (13515120) on 24/04/2017.
 */
public class BuildModeModel {
  private Zoo myZoo;
  private ArrayList<Animal> arrayAnimal;
  private ArrayList<AnimalThread> arrayThreadAnimal;

  /**
   * Konstruktor Build Mode Model
   */
  public BuildModeModel() {
    arrayAnimal = new ArrayList<>();
    arrayThreadAnimal = new ArrayList<>();

	  if (ProfileModel.getProfileName() == null) {
		  myZoo = new Zoo(25,25);
	  }else {
		  myZoo = Loader.loadZoo(ProfileModel.getProfileName());
	  }
  }

  /**
   * Getter Zoo
   * @return myZoo
   */
  public Zoo getMyZoo() {
    return myZoo;
  }

  public Animal getAnimal(Point loc) {
    return((Habitat) myZoo.getCell(new Point(loc.getX(), loc.getY()))).getHewan();
  }

  public void addAnimal(Animal hewan) {
    ((Habitat) myZoo.getCell(new Point(hewan.getLocation().getX(), hewan.getLocation().getY()))).addHewan(hewan);
    arrayAnimal.add(hewan);
    AnimalThread T = new AnimalThread("Animal", myZoo, hewan);
    arrayThreadAnimal.add(T);
  }

  public void startThread() {
    for (int i = 0; i < arrayThreadAnimal.size(); i++) {
      if (!arrayThreadAnimal.get(i).isAlive())
        arrayThreadAnimal.get(i).start();
      System.out.println(arrayThreadAnimal.get(i).getState());
    }
  }

  public void stopThread() {
    for (int i = 0; i < arrayThreadAnimal.size(); i++) {
      arrayThreadAnimal.get(i).kill();
    }
  }
}
