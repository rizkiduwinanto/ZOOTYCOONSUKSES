package animal.flyanimal;

import animal.Animal;

/**
 * @author Hisham Lazuardi Yusuf (13515069)
 * @version 3.0
 */
public abstract class FlyAnimal extends Animal {
  /** Constructor.
   *  Menciptakan FlyAnimal
   */
  public FlyAnimal() {
    land = false;
    water = false;
    fly = true;
  }
}