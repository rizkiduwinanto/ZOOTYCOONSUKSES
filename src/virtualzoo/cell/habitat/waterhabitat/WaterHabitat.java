/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package virtualzoo.cell.habitat.waterhabitat;

import point.Point;
import virtualzoo.cell.habitat.Habitat;
/** Kelas WaterHabitat bertanggung jawab mengelola WaterHabitat
 * @author AZIS ADI KUNCORO (13515120)
 * @version 3.0
 */

public class WaterHabitat extends Habitat {
    
  /** Konstruktor WaterHabitat. */
  public WaterHabitat() {
        
  }
  
  /** Konstruktor WaterHabitat dengan parameter.
   * @param p Merupakan posisi WaterHabitat.
   * @param cagedValue Merupakan nilai caged suatu Habitat.
   */
  public WaterHabitat(Point p,boolean cagedValue) {
    super(p,cagedValue);
  }
  
  /** Metode render untuk kelas Park yang di override dari Kelas Render. */  
  @Override
  public char render() {
    if (super.hasCage()) {
      return 'W';
    } else {
      return 'w';
    }
  }
  
  @Override
  public boolean isAirHabitat() {
    return false;
  }
  
  @Override
  public boolean isWaterHabitat() {
    return true;
  }
  
  @Override
  public boolean isLandHabitat() {
    return false;
  }
}
