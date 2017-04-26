package loader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import point.Point;
import profile.Profile;
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
  
  public static Profile loadProfile(String profilename) {
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
	    
	   //Load terhadap profile
	    String prof_path = profilepath + "/" + "profile.txt";
	    String namaPemilik = "";
	    long uang = 0;
	    String namaZoo = "";
	    int nbanimal = 0;
	    ArrayList<String> achievement = new ArrayList<>();
	    try {
	        sc = new Scanner(new File(prof_path));
	        namaPemilik = sc.nextLine();
	        uang = Integer.parseInt(sc.nextLine());
	        namaZoo = sc.nextLine();
	        nbanimal = Integer.parseInt(sc.nextLine());
	        while (sc.hasNextLine()){
	        	achievement.add(sc.nextLine());
	        }
	      } catch (FileNotFoundException e) {
	        e.printStackTrace();
	     }
	    Profile myProf = new Profile(namaPemilik,uang,namaZoo,nbanimal,achievement);
	    
	    return myProf;
  }
}
