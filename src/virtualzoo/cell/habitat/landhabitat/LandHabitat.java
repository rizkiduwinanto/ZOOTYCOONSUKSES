/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package virtualzoo.cell.habitat.landhabitat;

import point.Point;
import virtualzoo.cell.habitat.Habitat;

/** Kelas LandHabitat bertanggung jawab.
 * @author AZIS
 * @version 3.0
 */
public class LandHabitat extends Habitat {
    
  /** Konstruktor LandHabitat. */
  public LandHabitat(){
        
  }
    
  /** Konstruktor LandHabitat dengan parameter.
   * @param p Merupakan posisi LandHabitat.
   * @param cagedValue Merupakan nilai caged suatu Habitat.
   */
  public LandHabitat(Point p,boolean cagedValue) {
    super(p,cagedValue);
  }
  
  /** Metode render untuk kelas Park yang di override dari Kelas Render. */
  @Override
  public char render() {
    if (super.hasCage()) {
      return 'X';
    } else {
      return 'x';
    }
  }
  
  @Override
  public boolean isAirHabitat() {
    return false;
  }
  
  @Override
  public boolean isWaterHabitat() {
    return false;
  }
  
  @Override
  public boolean isLandHabitat() {
    return true;
  }
}
