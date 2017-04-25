package maincontroller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import mainmodel.BuildModeModel;
import mainview.BuildModeView;
import point.Point;



/**
 * Created by AZIS ADI KUNCORO (13515120) on 24/04/2017.
 */
public class BuildModeController {
  Object view;
  Object model;
  BuildModeView buildModeView = new BuildModeView();
  
  BuildModeModel buildModeModel = new BuildModeModel();

  public void initAllViewListener() {
	  buildModeView.addAllListener(new BuildModeListener());
  }
  
  public void initAllViewPosition() {
	  buildModeView.setLocationRelativeTo(null);
  }
  
  public BuildModeController() {
	
	//Default frame
    model = buildModeModel;
    view = buildModeView;
    
    initAllViewListener();
	initAllViewPosition();
    //Cek dia pakai kelas yang mana
    if (view.getClass() == buildModeView.getClass()) {
      ((BuildModeView) view).setVisible(true);
    } else {
    	
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

