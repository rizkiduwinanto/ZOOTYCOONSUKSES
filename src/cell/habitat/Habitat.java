package cell.habitat;

import cell.Cell;
import renderable.Renderable;

/**
 * Created by AZIS ADI KUNCORO (13515120) on 09/04/2017.
 */
public abstract class Habitat extends Cell {
  protected boolean caged;

  public Habitat(boolean c) {
    caged = c;
  }

  public final void setCageStatus(boolean cage) {
    caged = cage;
  }

  public final boolean getCageStatus() {
    return caged;
  }
}
