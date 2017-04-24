package buildmode;

import loader.Loader;
import zoo.Zoo;

/**
 * Created by AZIS ADI KUNCORO (13515120) on 24/04/2017.
 */
public class BuildModeModel {
  Zoo myZoo;
  public BuildModeModel() {
      myZoo = Loader.loadZoo();
  }

  public Zoo getMyZoo() {
    return myZoo;
  }
}
