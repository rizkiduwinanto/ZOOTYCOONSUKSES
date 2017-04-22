package animal.wateranimal;


import animal.Animal;

/**
 * @author Hisham Lazuardi Yusuf (13515069)
 * @version 3.0
 */
public abstract class WaterAnimal extends Animal {
  /** Constructor.
   *  Menciptakan WaterAnimal
   */
  public WaterAnimal() {
    land = false;
    water = true;
    fly = false;
  }
}