/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package virtualzoo.cell.facility.restaurant;

import point.Point;
import virtualzoo.cell.facility.Facility;

/** Kelas Restaurant bertanggung jawab mengelola Restaurant.
 * @author AZIS ADI KUNCORO (13515120)
 * @version 3.0
 */
public class Restaurant extends Facility {

  /** Konstruktor Restaurant. */
  public Restaurant(){
        
  }
    
  /** Konstruktor Restaurant dengan parameter .
   * @param p Merupakan posisi Restaurant.
   */
  public Restaurant(Point p) {
      super(p);
  }
  
  /** Metode render untuk kelas Restaurant yang di override dari Kelas Render. */ 
  @Override
  public char render() {
    return 'R';
  }
}
