/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package virtualzoo.animal.landanimal;

import virtualzoo.animal.Animal;

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
