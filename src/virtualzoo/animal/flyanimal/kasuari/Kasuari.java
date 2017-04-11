/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package virtualzoo.animal.flyanimal.kasuari;

import point.Point;
import virtualzoo.animal.flyanimal.FlyAnimal;

/**
 * @author Hisham Lazuardi Yusuf
 * @version 3.0
 */
public class Kasuari extends FlyAnimal {
  /** Constructor.
    * Menciptakan hewan Kasuari dan diletakkan pada titik (x,y)
    * @param x nilai absis dari singa yang akan diconstruct
    * @param y nilai ordinat dari singa yang akan diconstruct
    * @param beratHewan berat badan Singa yang akan diconstruct
    * @param isBuas jinak atau tidaknya hewan tersebut
    */
  public Kasuari(int x, int y, float beratHewan, boolean isBuas) {
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
    System.out.println("Kasuari : Hwok hwok whok whok whok");
  }
}
