package mainmodel;

import java.util.ArrayList;

import profile.Profile;

public class ProfileModel {
	private Profile profile;
	
	public ProfileModel(){
		profile = null;
	}
	
	public void setProfile(String namaPemilik, String namaZoo){
		long uang = 0;
		int jumlahAnimal = 0;
		ArrayList<String> arrayList= null;
		profile = new Profile(namaPemilik, uang, namaZoo, jumlahAnimal, arrayList); 
	}
	
	public Profile getProfile(){
		return profile;
	}
}
