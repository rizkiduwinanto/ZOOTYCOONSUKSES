package cell.habitat.waterhabitat;

import cell.habitat.Habitat;

/**
 * Created by AZIS ADI KUNCORO (13515120) on 09/04/2017.
 */
public class WaterHabitat extends Habitat {
  public WaterHabitat(boolean caged) {
    super(caged);
  }

  public final char render() {
    if (super.caged) {
      return 'W';
    } else {
      return 'w';
    }
  }
}
