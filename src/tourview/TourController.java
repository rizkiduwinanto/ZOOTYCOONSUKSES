package tourview;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

/**
 * @author Hisham Lazuardi Yusuf (13515069)
 */
public class TourController {
  Object view;
  Object model;
	private TourView tourView = new TourView();
	//private TourModel tourModel = new TourModel();
	
	/**
	 * Constructor Tour Controller.
	 */
	public TourController() {
	  view = tourView;
//	  /model = tourModel;
	  
	  if (view.getClass() == tourView.getClass()) {
	    ((TourView) view).addAllListener(new TourViewListener());
	    ((TourView) view).setVisible(true);
	  }
	}
	
	/**
	 * 
	 * @author Hishamlazuardi
	 */
	private class TourViewListener implements ActionListener {
		/**
		 * Constructor Tour View Listener.
		 */
	  private TourViewListener() {
	    //view.fillTable(view.getTable(), model.getMyZoo());
	  }
	  
	  /**
		 * Prosedur untuk menangkap action yang diterima oleh suatu menu.
		 * @param m merupakan sebuah ActionEvent yang diterima
		 */
	  @Override
		public void actionPerformed(ActionEvent m) {
			if (m.getSource() == ((TourView)view).getMenu1()) {
				JOptionPane.showMessageDialog(((TourView)view), "Anda Masuk ke Dalam Build Mode");
			} else if (m.getSource() == ((TourView)view).getMenu2()) {
				JOptionPane.showMessageDialog(((TourView)view), "Anda Masuk ke Dalam View Zoo");
			} else if (m.getSource() == ((TourView)view).getMenu3()) {
				JOptionPane.showMessageDialog(((TourView)view), "Anda Masuk ke Dalam Profile");
			} else {
			  JOptionPane.showMessageDialog(((TourView)view), "Anda Telah Keluar dari Permainan");
			}
		}
	}
}
