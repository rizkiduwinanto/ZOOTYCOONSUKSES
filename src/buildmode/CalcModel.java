package buildmode;

/**
 * Created by AZIS ADI KUNCORO (13515120) on 13/04/2017.
 */
public class CalcModel {
  private int calcValue;

  public void calc(int first_num, int second_num) {
    calcValue = first_num + second_num;
  }

  public int getCalcValue() {
    return calcValue;
  }
}
