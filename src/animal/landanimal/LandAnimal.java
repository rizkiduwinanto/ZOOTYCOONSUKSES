package animal.landanimal;

import animal.Animal;

/**
 * @author Hisham Lazuardi Yusuf (13515069)
 * @version 3.0
 */
public abstract class LandAnimal extends Animal {
  /** Constructor.
   *  Menciptakan LandAnimal
   */
  public LandAnimal() {
    land = true;
    water = false;
    fly = false;
  }
}