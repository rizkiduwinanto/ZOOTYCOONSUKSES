package profile.view;

import javax.swing.*;

import com.sun.prism.paint.Color;

import profile.controller.ProfileController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProfilePanel extends JPanel {
	private ProfileController baseController;
	private JLabel pemilikLabel;
	private JLabel uangLabel;
	private JLabel namaZooLabel;
	private JLabel jumlahAnimalLabel;
	private JLabel achievementLabel;
	private JMenuItem mntmExit;
	private JMenuItem mntmBuild;
	private JMenuItem mntmGuest;
	private SpringLayout springLayout;
	private JList AchievementList;
	private JScrollPane scrollPane;
	private JTextArea txtrPemilik;
	private JTextArea txtrUangfield;
	private JTextArea txtrZoofield;
	private JTextArea txtrAnimalfield;
	private JMenuBar menuBar;
	private JMenu mnMenu;
	
	public ProfilePanel(ProfileController baseController){
		this.baseController = baseController;
		
		pemilikLabel = new JLabel("Nama Pemilik :");
		uangLabel = new JLabel("Jumlah Uang :");
		namaZooLabel = new JLabel("Nama Zoo :");
		jumlahAnimalLabel = new JLabel("Jumlah Animal :");
		achievementLabel = new JLabel("Achievement :");
		txtrPemilik = new JTextArea();
		txtrUangfield = new JTextArea();
		txtrZoofield = new JTextArea();
		txtrAnimalfield = new JTextArea();
		menuBar = new JMenuBar();
		mnMenu = new JMenu("Menu");
		mntmBuild = new JMenuItem("Build");
		mntmGuest = new JMenuItem("Guest");
		mntmExit = new JMenuItem("Exit");
		AchievementList = new JList(baseController.getModel().getAchievement().toArray());
		scrollPane = new JScrollPane(AchievementList);
		springLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	public void setupLayout(){
		setLayout(springLayout);
		springLayout.putConstraint(SpringLayout.NORTH, achievementLabel, 21, SpringLayout.SOUTH, jumlahAnimalLabel);
		springLayout.putConstraint(SpringLayout.WEST, achievementLabel, 0, SpringLayout.WEST, pemilikLabel);
		springLayout.putConstraint(SpringLayout.NORTH, jumlahAnimalLabel, 19, SpringLayout.SOUTH, namaZooLabel);
		springLayout.putConstraint(SpringLayout.WEST, jumlahAnimalLabel, 0, SpringLayout.WEST, pemilikLabel);
		springLayout.putConstraint(SpringLayout.NORTH, namaZooLabel, 21, SpringLayout.SOUTH, uangLabel);
		springLayout.putConstraint(SpringLayout.WEST, namaZooLabel, 0, SpringLayout.WEST, pemilikLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, pemilikLabel, -216, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.WEST, pemilikLabel, 77, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.NORTH, uangLabel, 21, SpringLayout.SOUTH, pemilikLabel);
		springLayout.putConstraint(SpringLayout.WEST, uangLabel, 0, SpringLayout.WEST, pemilikLabel);	
		springLayout.putConstraint(SpringLayout.NORTH, menuBar, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, menuBar, 0, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.NORTH, txtrPemilik, -5, SpringLayout.NORTH, pemilikLabel);
		springLayout.putConstraint(SpringLayout.WEST, txtrPemilik, 18, SpringLayout.EAST, pemilikLabel);
		springLayout.putConstraint(SpringLayout.NORTH, txtrUangfield, -5, SpringLayout.NORTH, uangLabel);
		springLayout.putConstraint(SpringLayout.WEST, txtrUangfield, 0, SpringLayout.WEST, txtrPemilik);
		springLayout.putConstraint(SpringLayout.NORTH, txtrZoofield, -5, SpringLayout.NORTH, namaZooLabel);
		springLayout.putConstraint(SpringLayout.WEST, txtrZoofield, 0, SpringLayout.WEST, txtrPemilik);
		springLayout.putConstraint(SpringLayout.NORTH, txtrAnimalfield, -5, SpringLayout.NORTH, jumlahAnimalLabel);
		springLayout.putConstraint(SpringLayout.WEST, txtrAnimalfield, 0, SpringLayout.WEST, txtrPemilik);
		springLayout.putConstraint(SpringLayout.NORTH, AchievementList, 0, SpringLayout.NORTH, achievementLabel);
		springLayout.putConstraint(SpringLayout.WEST, AchievementList, 0, SpringLayout.WEST, txtrPemilik);
		springLayout.putConstraint(SpringLayout.NORTH, scrollPane, 16, SpringLayout.SOUTH, txtrAnimalfield);
		springLayout.putConstraint(SpringLayout.WEST, scrollPane, 17, SpringLayout.EAST, achievementLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, 49, SpringLayout.SOUTH, txtrAnimalfield);
		springLayout.putConstraint(SpringLayout.EAST, scrollPane, 157, SpringLayout.EAST, achievementLabel);
	}
	
	public void setupPanel(){
		setSize(350,300);
		txtrPemilik.setText(baseController.getModel().getNamaPemilik());
		txtrUangfield.setText(String.valueOf(baseController.getModel().getUang()));
		txtrZoofield.setText(baseController.getModel().getNamaZoo());
		txtrAnimalfield.setText(String.valueOf(baseController.getModel().getJumlahAnimal()));
		add(pemilikLabel);
		add(uangLabel);
		add(namaZooLabel);
		add(jumlahAnimalLabel);
		add(achievementLabel);
		add(menuBar);
		menuBar.add(mnMenu);
		mnMenu.add(mntmBuild);
		mnMenu.add(mntmGuest);
		mnMenu.add(mntmExit);
		add(txtrPemilik);
		add(txtrUangfield);
		add(txtrZoofield);
		add(txtrAnimalfield);
		add(scrollPane);
		
	}
	
	public void setupListeners(){
		
	}
}

