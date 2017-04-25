package mainmodel;

import profile.Profile;

public class ProfileModel {
	private Profile profile;
	
	public ProfileModel(){
		profile = null;
	}
	
	public void setProfile(Profile _profile){
		profile = _profile; 
	}
	
	public Profile getProfile(){
		return profile;
	}
}
