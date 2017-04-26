package mover;

import mainmodel.BuildModeModel;
import mainview.TourView;

/**
 * Created by Hishamlazuardi on 26/04/2017.
 */
public class MapThread extends Thread {
  private BuildModeModel buildModeModel;
  private TourView view;
  private boolean runnable = true;

  /**
   * Konstruktor Map Thread.
   * @param buildModeModel model yang digunakan menjalankan zoo
   * @param view tampilan yang digunakan untuk mengadaptasi thread
   */
  public MapThread(BuildModeModel buildModeModel, TourView view) {
    this.buildModeModel = buildModeModel;
    this.view = view;
  }

  /**
   * Prosedur untuk memberhentikan thread.
   * I.S. nilai runnable terdefinisi
   * F.S. nllai runnable di set menjadi false
   */
  public void kill() {
    runnable = false;
  }

  /**
   * Prosedur yang digunakan untuk memulai thread.
   */
  @Override
  public void run() {
    while (true) {
      view.fillTable(buildModeModel.getMyZoo());
      try {
        Thread.sleep(1000);
      }
      catch (Exception e) { }
    }
  }
}
