package maincontroller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import mainmodel.MenuModel;
import mainmodel.ProfileModel;
import mainmodel.TourModel;
import mainmodel.VZooModel;
import mainview.MenuView;
import mainview.NewGameView;
import mainview.ProfileView;
import mainview.TourView;
import mainview.VZooView;

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
	/**
	 * Constructor Main Controller.
	 */
	public MainController() {
		view = profileView;
		model = profileModel;  
		((ProfileView)view).setVisible(true);
		initAllViewListener();
	}
	public void initAllViewListener() {
		menuView.addAllListener(new MenuViewListener());
		newGameView.addAllListener(new NewGameViewListener());
		vZooView.addAllListener(new VZooViewListener());
		profileView.addAllListener(new ProfileViewListener());
		tourView.addAllListener(new TourViewListener());
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
				  
			  }
			}
		}
}
