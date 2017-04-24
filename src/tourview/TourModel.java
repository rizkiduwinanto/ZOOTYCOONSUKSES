package tourview;

import loader.Loader;
import zoo.Zoo;

/**
 * 
 * @author Hisham Lazuardi Yusuf (13515069)
 *
 */
public class TourModel {
  private Zoo myZoo;
  
  /**
   * Constructor Tour Model.
   */
  public TourModel() {
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
