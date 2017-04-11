/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package virtualzoo.cell.facility.road;

import point.Point;
import virtualzoo.cell.facility.Facility;

/** Kelas Road bertanggung jawab mengelola Road.
 * @author AZIS ADI KUNCORO (13515120)
 * @version 3.0
 */
public class Road extends Facility {
    
  /** Konstruktor Road. */
  public Road() {
      
  }
    
  /** Konstruktor Road dengan parameter. 
   * @param p Merupakan posisi Road.
   */
  public Road(Point p) {
    super(p);
  }

  /** Metode render untuk kelas Road yang di override dari Kelas Render.
   * @return  char untuk hasil renderan*/
  @Override
  public char render() {
    return '.';
  }
}
