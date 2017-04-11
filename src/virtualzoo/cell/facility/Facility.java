/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package virtualzoo.cell.facility;

import point.Point;
import virtualzoo.cell.Cell;

/** Kelas Facility bertanggung jawab mengelola Facility.
 * @author AZIS ADI KUNCORO (13515120)
 * @version 3.0
 */
public abstract class Facility extends Cell {
  
  /** Konstruktor Facility. */
  public Facility(){
      
  }
    
  /** Konstruktor Facility dengan parameter.
   * @param p Merupakan posisi Facility.
   */
  public Facility(Point p) {
    super(p);
  }
}
