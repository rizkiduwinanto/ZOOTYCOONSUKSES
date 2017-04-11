/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package virtualzoo.cell.habitat.airhabitat;

import point.Point;
import virtualzoo.cell.habitat.Habitat;

/** Kelas AirHabitat bertanggunjawab mengelola AirHabitat.
 * @author AZIS ADI KUNCORO (13515120)
 */
public class AirHabitat extends Habitat {
    
  /** Konstruktor AirHabitat. */
  public AirHabitat() {
    
  }
  
  /** Konstruktor AirHabitat dengan parameter.
   * @param p Merupakan posisi AirHabitat.
   * @param cagedValue Merupakan nilai caged suatu Habitat.
   */
  public AirHabitat(Point p,boolean cagedValue) {
    super(p,cagedValue);
  }
    
  /** Metode render untuk kelas AirHabitat yang di override dari Kelas Render. */
  @Override
  public char render() {
    if (super.hasCage()) {
      return 'A';
    } else {
      return 'a';
    }
  }
  
  @Override
  public boolean isAirHabitat() {
    return true;
  }
  
  @Override
  public boolean isWaterHabitat() {
    return false;
  }
  
  @Override
  public boolean isLandHabitat() {
    return false;
  }
}
