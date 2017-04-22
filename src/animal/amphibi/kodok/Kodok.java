package animal.amphibi.kodok ;

import point.Point;
import animal.amphibi.Amphibi;

/**
 * @author Hisham Lazuardi Yusuf (13515069)
 * @version 3.0
 */
public class Kodok extends Amphibi {
  /** Constructor.
   * Menciptakan hewan zebra dan diletakkan pada titik (x,y)
   * @param x nilai absis dari singa yang akan diconstruct
   * @param y nilai ordinat dari singa yang akan diconstruct
   * @param beratHewan berat badan Singa yang akan diconstruct
   * @param isBuas jinak atau tidaknya hewan tersebut
   */
  public Kodok(int x, int y, float beratHewan, boolean isBuas) {
    super(true,true,false);
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
  public void interact() {
    System.out.println("Kodok: Teot Teblung! Teot teblung! Teotteotteblung");
  }
}
