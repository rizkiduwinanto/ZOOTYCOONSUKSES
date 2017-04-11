/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package virtualzoo.cell.facility.road.entrance;

import point.Point;
import virtualzoo.cell.facility.road.Road;

/** Kelas Entrance bertanggung jawab mengelola Entrance.
 * @author AZIS ADI KUNCORO (13515120)
 * @version 3.0
 */
public class Entrance extends Road {
    
  /** Konstruktor Entrance. */
  public Entrance() {
    
  }
  
  /** Konstruktor Entrance dengan parameter. 
   * @param p Merupakan posisi Entrance.
   */
  public Entrance(Point p) {
    super(p);
  }
  
  /** Metode render untuk kelas Entrance yang di override dari Kelas Render. */
  @Override
  public char render() {
    return 'I';
  }
}
