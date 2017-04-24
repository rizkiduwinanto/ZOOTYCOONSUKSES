package profile.view;

import javax.swing.JFrame;

import profile.controller.ProfileController;

public class ProfileFrame extends JFrame {
	
	private ProfilePanel basePanel;
	
	public ProfileFrame(ProfileController baseController){
		basePanel = new ProfilePanel(baseController);
		setupFrame();
	}
	private void setupFrame(){
		this.setContentPane(basePanel);
		this.setSize(420, 320);
		this.setVisible(true);
	}
}
