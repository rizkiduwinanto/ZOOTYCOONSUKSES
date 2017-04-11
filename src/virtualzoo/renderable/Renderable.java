/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package virtualzoo.renderable;

/** Kelas Renderable bertanggung jawab mengenai proses render kelas lain.
 * @author AZIS ADI KUNCORO (13515120)
 * @version 3.0
 */
public abstract class Renderable {
    
  /** Konstruktor kelas Renderable. */
  public Renderable(){
        
  }
    
  /** Menuliskan karakter ke layar sesuai kelas yang di render. */
  public abstract char render();
    
}
