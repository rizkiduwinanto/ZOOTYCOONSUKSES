/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package virtualzoo;

import virtualzoo.driver.Driver;

/**
 * @author M RIZKI DUWINANTO      (13515006)
 * @author RIZKI ELZANDI BARIK    (13515030)
 * @author HISHAM LAZUARDI YUSUF  (13515069)
 * @author AZIS ADI KUNCORO       (13515120)
 * @version 3.0
 */
public class VirtualZoo {

  
  /** Starting point.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Driver driver = new Driver();
    driver.start();
  }
}