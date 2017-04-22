package cell.habitat.landhabitat;

import cell.habitat.Habitat;

/**
 * Created by AZIS ADI KUNCORO (13515120) on 09/04/2017.
 */
public class LandHabitat extends Habitat {
  public LandHabitat(boolean caged) {
    super(caged);
  }

  public final char render() {
    if (super.caged) {
      return 'X';
    } else {
      return 'x';
    }
  }
}
