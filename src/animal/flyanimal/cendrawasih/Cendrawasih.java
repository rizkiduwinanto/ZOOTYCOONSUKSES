package animal.flyanimal.cendrawasih;


import point.Point;
import animal.flyanimal.FlyAnimal;

/**
 * @author Hisham Lazuardi Yusuf (13515069)
 * @version 3.0
 */
public class Cendrawasih extends FlyAnimal {
  /** Constructor.
   * Menciptakan hewan Cendrawasih dan diletakkan pada titik (x,y)
   * @param x nilai absis dari singa yang akan diconstruct
   * @param y nilai ordinat dari singa yang akan diconstruct
   * @param beratHewan berat badan Singa yang akan diconstruct
   * @param isBuas jinak atau tidaknya hewan tersebut
   */
  public Cendrawasih(int x, int y, float beratHewan, boolean isBuas) {
    loc = new Point(x, y);
    beratBadan = beratHewan;
    buas = isBuas;
    porsiSemuaHewan += (float) (0.05 * beratBadan);
    herbivor = true;
    karnivor = false;
  }

  /** I.S Current objek terdefinisi
   *  F.S Menampilkan interaksi hewan dengan pengunjung
   */
  public String interact() { return("Cendrawasih : ciuwwwhiiiit whuitwhuitwhuit");
  }

  /** Fungsi untuk melakukan render di dalam GUI.
   */
  public char render() {
    return('C');
  }
}