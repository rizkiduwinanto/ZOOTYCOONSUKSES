/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package virtualzoo.animal.amphibi.pinguinemperor;

import point.Point;
import virtualzoo.animal.amphibi.Amphibi;

/**
 * @author Hisham Lazuardi Yusuf
 * @version 3.0
 */
public class PinguinEmperor extends Amphibi {
  /** Constructor.
    * Menciptakan hewan Pinguin Emperor dan diletakkan pada titik (x,y)
    * @param x nilai absis dari singa yang akan diconstruct
    * @param y nilai ordinat dari singa yang akan diconstruct
    * @param beratHewan berat badan Singa yang akan diconstruct
    * @param isBuas jinak atau tidaknya hewan tersebut
    */
  public PinguinEmperor(int x, int y, float beratHewan, boolean isBuas) {
    super(true,true,false);
    loc = new Point();
    loc.setPoint(x, y);
    beratBadan = beratHewan;
    buas = isBuas;
    karnivor = true;
    herbivor = false;
    porsiSemuaHewan += (float) (0.05 * beratBadan);
  }
  
  /** I.S Current objek terdefinisi
   *  F.S Menampilkan interaksi hewan dengan pengunjung 
   */
  public void interact() {
    System.out.println("Pinguin Emperor : Krrr...Tot! Krrr....Tot!");
  }
}
