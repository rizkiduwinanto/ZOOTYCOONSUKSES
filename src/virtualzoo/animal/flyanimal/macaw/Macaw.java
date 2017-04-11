/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package virtualzoo.animal.flyanimal.macaw;

import point.Point;
import virtualzoo.animal.flyanimal.FlyAnimal;

/**
 * @author Hisham Lazuardi Yusuf (13515069)
 * @version 3.0
 */
public class Macaw extends FlyAnimal {
  /** Constructor.
    * Menciptakan hewan Macaw dan diletakkan pada titik (x,y)
    * @param x nilai absis dari singa yang akan diconstruct
    * @param y nilai ordinat dari singa yang akan diconstruct
    * @param beratHewan berat badan Singa yang akan diconstruct
    * @param isBuas jinak atau tidaknya hewan tersebut
    */
  public Macaw(int x, int y, float beratHewan, boolean isBuas) {
    loc = new Point();
    loc.setPoint(x, y);
    beratBadan = beratHewan;
    buas = isBuas;
    herbivor = true;
    karnivor = false;
    porsiSemuaHewan += (float) (0.05 * beratBadan);
  }
  
  /** I.S Current objek terdefinisi
   *  F.S Menampilkan interaksi hewan dengan pengunjung
   */
  public void interact() {
    System.out.println("Macaw : Raaaak.. Raaaak");
  }
}
