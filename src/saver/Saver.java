package saver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import point.Point;
import zoo.Zoo;



/**
 * Created by AZIS ADI KUNCORO (13515120) on 22/04/2017.
 */
public class Saver {

  private Saver(){

  }

  public static void saveZoo(Zoo myZoo)  {
    String path = System.getProperty("user.dir") + "/savedprofile";

    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan nama profile : ");
    String profilename = sc.nextLine();

    File dir = new File(path + "/" + profilename);

    // attempt to create the directory here
    boolean successful = dir.mkdir();
    if (successful) {
      //Membuat cell.txt
      PrintWriter writer = null;
      try {
        writer = new PrintWriter(path + "/" + profilename + "/cell.txt", "UTF-8");
        for (int i = 0; i < myZoo.getBaris(); i++) {
          for (int j = 0; j < myZoo.getKolom(); j++) {
            writer.print(myZoo.getCell(new Point(j,i)).render());
          }
          writer.println("");
        }
        writer.close();
      } catch (FileNotFoundException e) {
        e.printStackTrace();
      } catch (UnsupportedEncodingException e) {
        e.printStackTrace();
      }


      //Membuat animal.txt
      /* UNIMPLEMENTED */

      System.out.println("Profile " + profilename + " berhasil dibuat.");
    } else {
      System.out.println("Terdapat kesalahan. (disebabkan profile sudah ada"
          + " atau kesalahan lainnya)");
    }
  }

}
