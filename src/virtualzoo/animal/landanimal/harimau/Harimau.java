/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package virtualzoo.animal.landanimal.harimau;

import point.Point;
import virtualzoo.animal.landanimal.LandAnimal;

/**
 * @author Hisham Lazuardi Yusuf (13515069)
 * @version 3.0
 */
public class Harimau extends LandAnimal {
  /** Constructor.
   * Menciptakan hewan harimau dan diletakkan pada titik (x,y)
   * @param x nilai absis dari singa yang akan diconstruct
   * @param y nilai ordinat dari singa yang akan diconstruct
   * @param beratHewan berat badan Singa yang akan diconstruct
   * @param isBuas jinak atau tidaknya hewan tersebut
   */
  public Harimau(int x, int y, float beratHewan, boolean isBuas) {
    loc = new Point();
    loc.setPoint(x, y);
    beratBadan = beratHewan;
    buas = isBuas;
    herbivor = false;
    karnivor = true;
    porsiSemuaHewan += (float) (0.05 * beratBadan);
  }
  
  /** I.S Current objek terdefinisi
   *  F.S Menampilkan interaksi hewan dengan pengunjung
   */
  public void interact() {
    System.out.println("Harimau : Grrrrr");
  }
}
