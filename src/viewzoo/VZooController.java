package viewzoo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VZooController {
  Object view;
  Object model;
  private VZooView vZooView = new VZooView();
  // private VZooModel vZooModel = new VZooModel();
  
  public VZooController() {
    view = vZooView;
    // model = tourModel;
  
    if (view.getClass() == vZooView.getClass()) {
      ((VZooView) view).addAllListener(new VZooViewListener());
      ((VZooView) view).setVisible(true);
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
        JOptionPane.showMessageDialog(((VZooView)view), "Anda Masuk ke Dalam Build Mode");
      } else if (m.getSource() == ((VZooView)view).getMenu2()) {
        JOptionPane.showMessageDialog(((VZooView)view), "Anda Masuk ke Dalam Tour View");
      } else if (m.getSource() == ((VZooView)view).getMenu3()) {
        JOptionPane.showMessageDialog(((VZooView)view), "Anda Masuk ke Dalam Profile");
      } else {
        JOptionPane.showMessageDialog(((VZooView)view), "Anda Telah Keluar dari Permainan");
      }
    }
  }
}
