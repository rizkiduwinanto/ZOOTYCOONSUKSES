/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package virtualzoo.cell;

import point.Point;
import virtualzoo.renderable.Renderable;

/** Kelas Cell bertanggung jawab atas kebutuhan-kebutuhan cell.
 * @author AZIS ADI KUNCORO (13515120)
 * @version 3.0
 */
public abstract class Cell extends Renderable  {
    
  private Point position;
  
  /** Konstruktor Cell Default. */
  public Cell() {
    position = new Point();
  }
    
  /** Konstruktor Cell dengan Parameter Point.
   * @param p Merupakan posisi suatu Cell.
   */
  public Cell(Point p) {
    position = new Point(p.getX(),p.getY());
  }
  
  /** Setter Posisi suatu Cell.
   * @param p Merupakan posisi baru untuk Cell.
   */
  public void setPos(Point p) {
    position = new Point(p.getX(),p.getY());
  }
  
  /** Getter Posisi suatu Cell.
   * @return Mengembalikan posisi Cell.
   */
  public Point getPos() {
    return position;
  }
  
} 

