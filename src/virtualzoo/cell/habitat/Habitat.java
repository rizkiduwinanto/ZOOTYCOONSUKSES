/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package virtualzoo.cell.habitat;

import point.Point;
import virtualzoo.cell.Cell;

/** Kelas Habitat bertanggung jawab mengelola habitat.
 * @author AZIS ADI KUNCORO (13515120)
 * @version 3.0
 */
public abstract class Habitat extends Cell {
    
  private boolean caged;
    
  /** Konstruktor Habitat. */
  public Habitat() {
    caged = false;
  }
    
  /** Konstruktor Habitat dengan parameter.
   * @param p Merupakan posisi Habitat.
   * @param cagedValue Merupakan nilai caged suatu Habitat.
   */
  public Habitat(Point p,boolean cagedValue) {
    super(p);
    caged = cagedValue;
  }
    
  /** Setter caged, mengubah nilai hasCage menjadi true / false.
   * @param val Merupakan nilai pengganti hasCage.
   */
  public void setHasCage(boolean val) {
    caged = val;
  }
    
  /**  Getted caged. 
   * @return Mengembalikan status caged suatu Habitat.
   */
  public boolean hasCage() {
    return caged;
  }  
 
  /**
   *  Method abstrak predikat apakah suatu habitat adalah AirHabitat.
   */
  public abstract boolean isAirHabitat();
  
  /**
   *  Method abstrak predikat apakah suatu habitat adalah WaterHabitat.
   */
  public abstract boolean isWaterHabitat();
  
  /**
   *  Method abstrak predikat apakah suatu habitat adalah LandHabitat.
   */
  public abstract boolean isLandHabitat();
}
