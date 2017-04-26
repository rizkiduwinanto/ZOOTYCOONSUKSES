package mainmodel;

import loader.Loader;
import zoo.Zoo;

/**
 * Created by AZIS ADI KUNCORO (13515120) on 24/04/2017.
 */
public class BuildModeModel {
  Zoo myZoo;
  public BuildModeModel() {
	  if (ProfileModel.getProfileName() == null) {
		  System.out.println("KOSONG");
		  myZoo = new Zoo(25,25);
	  }else {
		  myZoo = Loader.loadZoo(ProfileModel.getProfileName()); 
	  }
	  
  }
  

  public Zoo getMyZoo() {
    return myZoo;
  }
}
