package profile.controller;

import profile.model.ProfileModel;
import profile.view.ProfileFrame;

public class ProfileController {
	private ProfileModel appModel;
	private ProfileFrame appFrame;
	public ProfileModel getModel(){
		return appModel;
	}
	public ProfileController(ProfileModel model){
		appModel = model;
	}
	public void start(){
		appFrame = new ProfileFrame(this);
	}
}
