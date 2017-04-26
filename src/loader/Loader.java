package loader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import point.Point;
import zoo.Zoo;



/**
 * Created by AZIS ADI KUNCORO (13515120) on 22/04/2017.
 */
public class Loader {

  private Loader(){

  }

  public static Zoo loadZoo(String profilename) {
    Zoo myZoo = new Zoo(1,1);

    String path = System.getProperty("user.dir") + "/savedprofile";

    File folder = new File(path);
    File[] listOfFiles = folder.listFiles();
    
    Scanner sc;

    //Check apakah profilename yg akan di load ada di direktori apa tidak
    boolean found = false;
    for (int i = 0; i < listOfFiles.length && !found; i++) {
      found = listOfFiles[i].getName().equals(profilename);
    }
    assert (found) : "Maaf profile tidak ditemukan";

    String profilepath = path + "/" + profilename;
    StringBuffer readed;
    //Melakukan load terhadap cell
    String cellpath = profilepath + "/" + "cell.txt";
    try {
      sc = new Scanner(new File(cellpath));
      readed = new StringBuffer(sc.nextLine());
      int baris = readed.length();
      myZoo = new Zoo(baris,baris);
      for (int i = 0; i < baris; i++) {
        for (int j = 0; j < baris; j++) {
          myZoo.setCellType(new Point(j,i),readed.charAt(j));
        }
        if (i < baris - 1) {
          readed = new StringBuffer(sc.nextLine());
        }
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    //Melakukan load terhadap animal
    /* UNIMPLEMENTED */
    
   
    System.out.println("Profile " + profilename + " successfully loaded !");
   
    return myZoo;
  }
}
