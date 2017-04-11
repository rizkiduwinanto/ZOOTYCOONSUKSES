/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package virtualzoo.animal.landanimal.simpanse;

import point.Point;
import virtualzoo.animal.landanimal.LandAnimal;

/**
 * @author Hisham Lazuardi Yusuf (13515069)
 * @version 3.0
 */
public class Simpanse extends LandAnimal {
  /** Constructor.
    * Menciptakan hewan simpanse dan diletakkan pada titik (x,y)
    * @param x nilai absis dari hewan yang akan diconstruct
    * @param y nilai ordinat dari hewan yang akan diconstruct
    * @param beratHewan berat badan hewan yang akan diconstruct
    * @param isBuas jinak atau tidaknya hewan tersebut
    */
  public Simpanse(int x, int y, float beratHewan, boolean isBuas) {
    loc = new Point();
    loc.setPoint(x, y);
    beratBadan = beratHewan;
    buas = isBuas;
    herbivor = true;
    karnivor = true;
    porsiSemuaHewan += (float) (0.05 * beratBadan);
  }
  
  /** I.S Current objek terdefinisi
   *  F.S Menampilkan interaksi hewan dengan pengunjung
   */
  public void interact() {
    System.out.println("Simpanse : *Garuk2*");
  }
}
