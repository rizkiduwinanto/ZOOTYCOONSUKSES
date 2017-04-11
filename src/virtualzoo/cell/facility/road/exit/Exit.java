/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package virtualzoo.cell.facility.road.exit;

import point.Point;
import virtualzoo.cell.facility.road.Road;

/** Kelas Exit bertanggung jawab mengelola Exit.
 * @author AZIS ADI KUNCORO (13515120)
 * @version 3.0
 */
public class Exit extends Road {
    
  /** Konstruktor Exit. */
  public Exit() {
      
  }
  
  /** Konstruktor Exit dengan parameter. 
   * @param p Merupakan posisi Exit.
   */
  public Exit(Point p) {
      super(p);
  }
  
  /** Metode render untuk kelas Exit yang di override dari Kelas Render. */
  @Override
  public char render() {
    return 'O';
  }
}
