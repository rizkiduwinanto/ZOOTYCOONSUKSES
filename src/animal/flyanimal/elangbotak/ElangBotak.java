package animal.flyanimal.elangbotak;

import animal.flyanimal.FlyAnimal;
import point.Point;


/**
 * @author Hisham Lazuardi Yusuf (13515069)
 * @version 3.0
 */
public class ElangBotak extends FlyAnimal {
  /** Constructor.
   * Menciptakan hewan Elang Botak dan diletakkan pada titik (x,y)
   * @param x nilai absis dari singa yang akan diconstruct
   * @param y nilai ordinat dari singa yang akan diconstruct
   * @param beratHewan berat badan Singa yang akan diconstruct
   * @param isBuas jinak atau tidaknya hewan tersebut
   */
  public ElangBotak(int x, int y, float beratHewan, boolean isBuas) {
    loc = new Point(x, y);
    beratBadan = beratHewan;
    buas = isBuas;
    herbivor = false;
    karnivor = true;
    porsiSemuaHewan += (float) (0.05 * beratBadan);
  }

  /** I.S Current objek terdefinisi
   *  F.S Menampilkan interaksi hewan dengan pengunjung
   */
  public String interact() {
    return ("Elang Botak : Kwaaaawk Kwaaaak");
  }

  /** Fungsi untuk melakukan render di dalam GUI.
   */
  public char render() {
    return ('E');
  }
}
