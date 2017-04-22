package animal.amphibi;

import animal.Animal;

/**
 * @author Hisham Lazuardi Yusuf (13515069)
 * @version 3.0
 */
public abstract class Amphibi extends Animal {
  /** Constructor.
   *  Menciptakan Amphibi
   *  @param land variabel boolean untuk menandakan LandAnimal
   *  @param water variabel boolean untuk menandakan WaterAnimal
   *  @param fly variabel boolean untuk menandakan FlyAnimal
   */
  public Amphibi(boolean land, boolean water, boolean fly) {
    this.land = land;
    this.water = water;
    this.fly = fly;
  }
}