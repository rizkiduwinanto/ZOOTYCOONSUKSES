package mainmodel;

import java.util.ArrayList;

import profile.Profile;

public class ProfileModel {
	private Profile profile;
	private static String profileName;
	public ProfileModel(){
		profile = null;
	}
	
	public void setProfile(String namaPemilik, String namaZoo){
		long uang = 1000;
		int jumlahAnimal = 0;
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Rookie");
		arrayList.add("Jito");
		arrayList.add("cibur");
		arrayList.add("ambyar");
		profile = new Profile(namaPemilik, uang, namaZoo, jumlahAnimal, arrayList); 
	}
	
	public Profile getProfile(){
		return profile;
	}
	
	public static String getProfileName(){
		return profileName;
	}
	
	public static void setProfileName(String profilename) {
		profileName = profilename;
	}
}
