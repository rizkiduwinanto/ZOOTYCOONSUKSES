package maincontroller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import mainmodel.BuildModeModel;
import mainmodel.MenuModel;
import mainmodel.ProfileModel;
import mainmodel.TourModel;
import mainmodel.VZooModel;
import mainview.BuildModeView;
import mainview.MenuView;
import mainview.NewGameView;
import mainview.ProfileView;
import mainview.TourView;
import mainview.VZooView;
import point.Point;

public class MainController {
	Object view;
	Object model;
	private TourView tourView = new TourView();
	private TourModel tourModel = new TourModel();
	private VZooView vZooView = new VZooView();
	private VZooModel vZooModel = new VZooModel();
	private ProfileView profileView = new ProfileView();
	private ProfileModel profileModel = new ProfileModel();
	private MenuView menuView = new MenuView();
	private MenuModel menuModel = new MenuModel();
	private NewGameView newGameView = new NewGameView();
	private BuildModeView buildModeView = new BuildModeView();
	private BuildModeModel buildModeModel = new BuildModeModel();
	/**
	 * Constructor Main Controller.
	 */
	public MainController() {
		view = menuView;
		model = menuModel;  
		((MenuView)view).setVisible(true);
		init();
	}
	public void init() {
		menuView.addAllListener(new MenuViewListener());
		newGameView.addAllListener(new NewGameViewListener());
		vZooView.addAllListener(new VZooViewListener());
		profileView.addAllListener(new ProfileViewListener());
		tourView.addAllListener(new TourViewListener());
		buildModeView.addAllListener(new BuildModeListener());
		
		menuView.setLocationRelativeTo(null);
		newGameView.setLocationRelativeTo(null);
		vZooView.setLocationRelativeTo(null);
		profileView.setLocationRelativeTo(null);
		tourView.setLocationRelativeTo(null);
		buildModeView.setLocationRelativeTo(null);
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
				if (m.getSource() == ((MenuView) view).getBtnNewGame()){
					((MenuView)view).setVisible(false);
					model = profileModel;
					view = newGameView;
					((NewGameView)view).setVisible(true);
				} else if (m.getSource() == ((MenuView) view).getBtnLoad()){
					
				} else if (m.getSource() == ((MenuView)view).getBtnExit() || m.getSource() == ((MenuView) view).getmntmExit()){
					int exitTrue = JOptionPane.showOptionDialog(menuView, "Serius Mau Keluar?", "Exit Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
					if (exitTrue == JOptionPane.YES_OPTION){
						System.exit(0);
					}
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
				if (m.getSource()==((ProfileView)view).getMenuBuild()){
					((ProfileView)view).setVisible(false);
					model = vZooModel;
					view = vZooView;
					((VZooView)view).setVisible(true);
				} else if (m.getSource()==((ProfileView)view).getMenuView()){
					((ProfileView)view).setVisible(false);
					model = tourModel;
					view = tourView;
					((TourView)view).setVisible(true);
				} else if (m.getSource()==((ProfileView)view).getMenuMain()){
					((ProfileView)view).setVisible(false);
					model = menuModel;
					view = menuView;
					((MenuView)view).setVisible(true);
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
				if (m.getSource() == ((TourView)view).getMenu1()) {
					
				} else if (m.getSource() == ((TourView)view).getMenu2()) {
					((TourView)view).setVisible(false);
					model = vZooModel;
					view = vZooView;
					((VZooView)view).setVisible(true);
				} else if (m.getSource() == ((TourView)view).getMenu3()) {
					((TourView)view).setVisible(false);
					model = profileModel;
					view = profileView;
					((ProfileView)view).setVisible(true);
				} else {
					((TourView)view).setVisible(false);
					model = menuModel;
					view = menuView;
					((MenuView)view).setVisible(true);
				}
			}
		}
		
		private class VZooViewListener implements ActionListener {
		    /**
		     * Constructor.
		     */
		    private VZooViewListener() {
		      
		    }
		    
		    /**
		     * Prosedur untuk menangkap action yang diterima oleh suatu menu.
		     * @param m merupakan sebuah ActionEvent yang diterima
		     */
		    @Override
		    public void actionPerformed(ActionEvent m) {
		      if (m.getSource() == ((VZooView)view).getMenu1()) {
		    	  
		      } else if (m.getSource() == ((VZooView)view).getMenu2()) {
		    	  ((VZooView)view).setVisible(false);
		    	  model = tourModel;
		    	  view = tourView;
		    	  ((TourView)view).setVisible(true);
		      } else if (m.getSource() == ((VZooView)view).getMenu3()) {
		    	  ((VZooView)view).setVisible(false);
		    	  model = profileModel;
		    	  view = profileView;
		    	  ((ProfileView)view).setVisible(true);
		      } else {
		    	  ((VZooView)view).setVisible(false);
		    	  model = menuModel;
		    	  view = menuView;
		    	  ((MenuView)view).setVisible(true);
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
			  if (m.getSource() == ((NewGameView)view).getBtnBuild()){
				  String profilePemilik = ((NewGameView)view).getPemilikField().getText();
				  String namaZoo = ((NewGameView)view).getNamaZooField().getText();
				  ((ProfileModel)model).setProfile(profilePemilik, namaZoo);
				  
			  } else if (m.getSource() == ((NewGameView)view).getBtnCancel()){
				  
			  } 
			}
		}
		  private class BuildModeListener implements ActionListener {
			    private BuildModeListener() {
			      ((BuildModeView) view ).fillTable( ((BuildModeModel) model).getMyZoo());
			    }

			    public void actionPerformed(ActionEvent e){
			      if (e.getSource() == ((BuildModeView) view ).getBtnBuyAnimal()) {
			        JOptionPane.showMessageDialog(((BuildModeView) view ),"BUY ANIMAL");
			      } else if (e.getSource() == ((BuildModeView) view ).getBtnSellAnimal()) {
			        JOptionPane.showMessageDialog(((BuildModeView) view ), "SELL ANIMAL");
			      } else if (e.getSource() == ((BuildModeView) view ).getBtnMoveAnimal()) {
			        JOptionPane.showMessageDialog(((BuildModeView) view ), "MOVE ANIMAL");
			      } else if (e.getSource() == ((BuildModeView) view ).getBtnChangeCellType()) {
			        //JOptionPane.showMessageDialog(((BuildModeView) view ), "CHANGE CELL TYPE");
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
			    			readed = 'P';    			
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
			    		((BuildModeModel) model).getMyZoo().setCellType(new Point(posx,posy), readed);
			    		((BuildModeView) view ).fillTable(((BuildModeModel) model).getMyZoo());
			    	}
					
			      } else if (e.getSource() == ((BuildModeView) view ).getMntmNewMenuItem()) {
			        //JOptionPane.showMessageDialog(((BuildModeView) view ), "TUR VIEW");
			        //--Edit
			        /*((BuildModeView)view).setVisible(false);
			        model = calcModel;
			        view = calcView;
			        ((CalcView) view).setVisible(true);*/
			        //--ediT
			      } else if (e.getSource() == ((BuildModeView) view ).getMntmProfile()) {
			        JOptionPane.showMessageDialog(((BuildModeView) view ),"PROFILE VIEW");
			      } else if (e.getSource() == ((BuildModeView) view ).getMntmViewZoo()) {
			        JOptionPane.showMessageDialog(((BuildModeView) view ), "VIEW ZOO VIEW");
			      }
			    }
			  }
}
