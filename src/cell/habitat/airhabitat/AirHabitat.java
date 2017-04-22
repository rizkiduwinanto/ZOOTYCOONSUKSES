package cell.habitat.airhabitat;

import cell.habitat.Habitat;

/**
 * Created by AZIS ADI KUNCORO (13515120) on 09/04/2017.
 */
public final class AirHabitat extends Habitat {
  public AirHabitat(boolean caged) {
    super(caged);
  }

  public final char  render() {
    if (super.caged) {
      return 'A';
    } else {
      return 'a';
    }
  }
}
