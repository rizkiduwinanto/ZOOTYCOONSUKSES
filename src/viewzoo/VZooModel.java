package viewzoo;

import loader.Loader;
import zoo.Zoo;

public class VZooModel {
  private Zoo myZoo;
  
  /**
   * Constructor View Zoo Model.
   */
  public VZooModel() {
    myZoo = Loader.loadZoo();
  }
  
  /**
   * Getter myZoo.
   * @return myZoo
   */
  public Zoo getMyZoo() {
    return myZoo;
  }
}
