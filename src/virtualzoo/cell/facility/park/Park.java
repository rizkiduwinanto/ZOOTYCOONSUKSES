/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package virtualzoo.cell.facility.park;

import point.Point;
import virtualzoo.cell.facility.Facility;

/** Kelas Park bertanggung jawab mengelola Park.
 * @author AZIS ADI KUNCORO (13515120)
 * @version 3.0
 */
public class Park extends Facility {

  /** Konstruktor Park. */
  public Park() {
        
  }
    
  /** Konstruktor Park dengan parameter.
   * @param p Merupakan posisi Park.
   */
  public Park(Point p) {
    super(p);
  }
  
  /** Metode render untuk kelas Park yang di override dari Kelas Render. */
  @Override
  public char render() {
    return '#';
  }
}
