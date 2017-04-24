package profile.controller;

import java.util.ArrayList;

import profile.model.ProfileModel;

public class ProfileRunner {

	public static void main(String[] args) {
		ArrayList<String> best = new ArrayList<String>();
		best.add("Cibur of the Cibur");
		best.add("Fakuy of the month");
		best.add("Asisten Apanih?");
		ProfileModel model = new ProfileModel("Jito", 100, "Cibur", 20, best);
		ProfileController baseApp = new ProfileController(model);
		baseApp.start();
	}

}
