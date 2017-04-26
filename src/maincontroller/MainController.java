package maincontroller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import mainmodel.BuildModeModel;
import mainmodel.ProfileModel;
import mainview.BuildModeView;
import mainview.LoadFileView;
import mainview.MenuView;
import mainview.NewGameView;
import mainview.ProfileView;
import mainview.TourView;
import point.Point;

public class MainController {
	private TourView tourView = new TourView();
	private ProfileView profileView = new ProfileView();
	private ProfileModel profileModel = new ProfileModel();
	private MenuView menuView = new MenuView();
	private NewGameView newGameView = new NewGameView();
	private BuildModeView buildModeView = new BuildModeView();
	private BuildModeModel buildModeModel =  new BuildModeModel();
	private LoadFileView loadFileView = new LoadFileView();
	/**
	 * Constructor Main Controller.
	 */
	public MainController() {
		menuView.setVisible(true);
		init();
	}
	public void init() {
		menuView.addAllListener(new MenuViewListener());
		newGameView.addAllListener(new NewGameViewListener());
		loadFileView.addAllListener(new LoadFileViewListener());
		profileView.addAllListener(new ProfileViewListener());
		tourView.addAllListener(new TourViewListener());
		buildModeView.addAllListener(new BuildModeListener());
		
		menuView.setLocationRelativeTo(null);
		newGameView.setLocationRelativeTo(null);
		profileView.setLocationRelativeTo(null);
		tourView.setLocationRelativeTo(null);
		buildModeView.setLocationRelativeTo(null);
	}
		
		private class LoadFileViewListener implements ActionListener{
			private LoadFileViewListener() {
				
			}
			
			public void actionPerformed(ActionEvent m){
				if (m.getSource() == loadFileView.getBtnOk()) {
					loadFileView.setVisible(false);
					ProfileModel.setProfileName(String.valueOf(loadFileView.getComboBox().getSelectedItem()));
					buildModeView.fillTable( buildModeView.getTable(), buildModeModel.getMyZoo());
					buildModeView.setVisible(true);
				}
			}
		}
	
		/**
		 * 
		 * @author Muhammad Rizki Duwinanto
		 */
		
		private class MenuViewListener implements ActionListener {
			/**
			 * Constructor Profile View Listener.
			 */
		  private MenuViewListener() {
		    
		  }
		  
		  /**
		   * Prosedur untuk menangkap action yang diterima oleh suatu menu.
		   * @param m merupakan sebuah ActionEvent yang diterima
		   */
		  @Override
		  public void actionPerformed(ActionEvent m) {
				if (m.getSource() == menuView.getBtnNewGame()){
					menuView.setVisible(false);
					
					newGameView.setVisible(true);
				} else if (m.getSource() == menuView.getBtnLoad()){
					menuView.setVisible(false);
					loadFileView.setVisible(true);
				}
			}
		}
		
		private class ProfileViewListener implements ActionListener {
			/**
			 * Constructor Profile View Listener.
			 */
		  private ProfileViewListener() {
		   
		  }
		  
		  /**
			 * Prosedur untuk menangkap action yang diterima oleh suatu menu.
			 * @param m merupakan sebuah ActionEvent yang diterima
			 */
		  @Override
		  public void actionPerformed(ActionEvent m) {
				if (m.getSource()==profileView.getMenuBuild()){
					profileView.setVisible(false);
					buildModeView.setVisible(true);
				} else if (m.getSource()==profileView.getMenuTourView()){
					profileView.setVisible(false);
					tourView.setVisible(true);
				} else if (m.getSource()==profileView.getMenuMain()){
					profileView.setVisible(false);
					menuView.setVisible(true);
				}
			}
		}
		
		private class TourViewListener implements ActionListener {
			/**
			 * Constructor Tour View Listener.
			 */
		  private TourViewListener() {
			  
		  }
		  
		  /**
			 * Prosedur untuk menangkap action yang diterima oleh suatu menu.
			 * @param m merupakan sebuah ActionEvent yang diterima
			 */
		  @Override
		  public void actionPerformed(ActionEvent m) {
				if (m.getSource() == tourView.getMenu2()) {
					tourView.setVisible(false);
					buildModeView.setVisible(true);
				} else if (m.getSource() == tourView.getMenu3()) {
					tourView.setVisible(false);
					profileView.setVisible(true);
				} else {
					tourView.setVisible(false);
					menuView.setVisible(true);
				}
			}
		}
		
		
		private class NewGameViewListener implements ActionListener {
			/**
			 * Constructor Profile View Listener.
			 */
		  private NewGameViewListener() {
		    
		  }
		  
		  /**
			 * Prosedur untuk menangkap action yang diterima oleh suatu menu.
			 * @param m merupakan sebuah ActionEvent yang diterima
			 */
		  @Override
			public void actionPerformed(ActionEvent m) {
			  if (m.getSource() == newGameView.getBtnBuild()){
				  String profilePemilik = newGameView.getPemilikField().getText();
				  String namaZoo = newGameView.getNamaZooField().getText();
				  profileModel.setProfile(profilePemilik, namaZoo);
				  newGameView.setVisible(false);
				  profileModel.setProfile(newGameView.getPemilikField().getText() ,newGameView.getNamaZooField().getText() );
				  
				  profileView.setPemilik(profileModel.getProfile().getNamaPemilik());
				  profileView.setZoo(profileModel.getProfile().getNamaZoo());
				  profileView.setUang(profileModel.getProfile().getUang());
				  profileView.setAnimal(profileModel.getProfile().getJumlahAnimal());
				  profileView.setList(profileModel.getProfile().getAchievement());
				  
				  buildModeView.fillTable( buildModeView.getTable(), buildModeModel.getMyZoo());
				  
				  buildModeView.setVisible(true);
				  
			  } else if (m.getSource() == newGameView.getBtnCancel()){
				  
			  } 
			}
		}
		  private class BuildModeListener implements ActionListener {
			    private BuildModeListener() {
			      
			    }

			    public void actionPerformed(ActionEvent e){
				      if (e.getSource() == buildModeView.getBtnBuyAnimal()) {
				        JOptionPane.showMessageDialog(buildModeView,"BUY ANIMAL"); } else if (e.getSource() == buildModeView.getBtnSellAnimal()) {
				        JOptionPane.showMessageDialog(buildModeView, "SELL ANIMAL");
				      } else if (e.getSource() == buildModeView.getBtnMoveAnimal()) {
				        JOptionPane.showMessageDialog(buildModeView, "MOVE ANIMAL");
				      } else if (e.getSource() == buildModeView.getBtnChangeCellType()) {
				        //JOptionPane.showMessageDialog(buildModeView, "CHANGE CELL TYPE");
				    	String[] celltypes = { "Park","Restaurant","Road","Entrance","Exit","AirHabitat","WaterHabitat","LandHabitat" };
				    	String selectedCellType = (String)JOptionPane.showInputDialog(
				                null,
				                "Tipe Cell:\n",
				                "Pilih tipe Cell",
				                JOptionPane.PLAIN_MESSAGE,
				                null, //icon
				                celltypes,
				                "Park");
				    	int posx = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan X"));
				    	int posy = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Y"));
				    	if (posx < 0 || posx >=25 || posy < 0 || posy >= 25) {
				    		JOptionPane.showMessageDialog(null,
				    			    "Lokasi cell tidak valid!",
				    			    "Location Wrong",
				    			    JOptionPane.ERROR_MESSAGE);
				    		
				    	} else {
				    		JOptionPane.showMessageDialog(null,
				    			    "Berhasil dimasukkan!");
				    		char readed;
				    		if (selectedCellType.equals("Park")){
				    			System.out.println("PARKED");
				    			readed = '#';    			
				    		}else if (selectedCellType.equals("Restaurant")){
				    			readed = 'R';
				    		}else if (selectedCellType.equals("Road")){
				    			readed = '.';
				    		}else if (selectedCellType.equals("Entrance")){
				    			readed = 'I';
				    		}else if (selectedCellType.equals("Exit")){
				    			readed = 'O';
				    		}else if (selectedCellType.equals("AirHabitat")){
				    			readed = 'a';
				    		}else if (selectedCellType.equals("WaterHabitat")) {
				    			readed = 'w';
				    		}else {
				    			readed = 'x';
				    		}
				    		buildModeModel.getMyZoo().setCellType(new Point(posx,posy), readed);
				    		buildModeView.fillTable(buildModeView.getTable(),buildModeModel.getMyZoo());
				    	}
						
				      } else if (e.getSource() == buildModeView.getMntmNewMenuItem()) {
				    	buildModeView.setVisible(false);
				    	tourView.setVisible(true);
				      } else if (e.getSource() == buildModeView.getMntmProfile()) {
				        buildModeView.setVisible(false);
				        profileView.setVisible(true);
				      } else if (e.getSource() == buildModeView.getMntmMenu()) {
				    	buildModeView.setVisible(false);
				    	menuView.setVisible(true);
				      }
				    }
				  }
}
