package animal.landanimal.badakjawa;

import animal.landanimal.LandAnimal;
import point.Point;


/**
 * @author Hisham Lazuardi Yusuf (13515069)
 * @version 3.0
 */
public class BadakJawa extends LandAnimal {
  /** Constructor.
   * Menciptakan hewan badak jawa dan diletakkan pada titik (x,y)
   * @param x nilai absis dari hewan yang akan diconstruct
   * @param y nilai ordinat dari hewan yang akan diconstruct
   * @param beratHewan berat badan hewan yang akan diconstruct
   * @param isBuas jinak atau tidaknya hewan tersebut
   */
  public BadakJawa(int x, int y, float beratHewan, boolean isBuas) {
    loc = new Point(x, y);
    beratBadan = beratHewan;
    buas = isBuas;
    herbivor = true;
    karnivor = false;
    porsiSemuaHewan += (float) (0.05 * beratBadan);
  }

  /** I.S Current objek terdefinisi
   *  F.S Menampilkan interaksi hewan dengan pengunjung
   */
  public String interact() {
    return ("BadakJawa : *Awas Diseruduk*");
  }

  /** Fungsi untuk melakukan render di dalam GUI.
   */
  public char render() {
    return ('D');
  }
}