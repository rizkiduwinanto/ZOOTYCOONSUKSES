package buildmode;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import mainmodel.BuildModeModel;

/**
 * Created by AZIS ADI KUNCORO (13515120) on 24/04/2017.
 */
public class BuildModeController {
  Object view;
  Object model;
  BuildModeView buildModeView = new BuildModeView();
  
  BuildModeModel buildModeModel = new BuildModeModel();
  CalcView calcView = new CalcView();
  CalcModel calcModel = new CalcModel();

  public void initAllViewListener() {
	  buildModeView.addAllListener(new BuildModeListener());
	  calcView.addCalcButtonListener(new CalcListener());
  }
  
  public void initAllViewPosition() {
	  calcView.setLocationRelativeTo(null);
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
      ((BuildModeView) view ).fillTable(
          ((BuildModeView) view ).getTable(),
          ((BuildModeModel) model).getMyZoo());
    }

    public void actionPerformed(ActionEvent e){
      if (e.getSource() == ((BuildModeView) view ).getBtnBuyAnimal()) {
        JOptionPane.showMessageDialog(((BuildModeView) view ),"BUY ANIMAL");
      } else if (e.getSource() == ((BuildModeView) view ).getBtnSellAnimal()) {
        JOptionPane.showMessageDialog(((BuildModeView) view ), "SELL ANIMAL");
      } else if (e.getSource() == ((BuildModeView) view ).getBtnMoveAnimal()) {
        JOptionPane.showMessageDialog(((BuildModeView) view ), "MOVE ANIMAL");
      } else if (e.getSource() == ((BuildModeView) view ).getBtnChangeCellType()) {
        JOptionPane.showMessageDialog(((BuildModeView) view ), "CHANGE CELL TYPE");
      } else if (e.getSource() == ((BuildModeView) view ).getMntmNewMenuItem()) {
        //JOptionPane.showMessageDialog(((BuildModeView) view ), "TUR VIEW");
        //--Edit
        ((BuildModeView)view).setVisible(false);
        model = calcModel;
        view = calcView;
        ((CalcView) view).setVisible(true);
        //--ediT
      } else if (e.getSource() == ((BuildModeView) view ).getMntmProfile()) {
        JOptionPane.showMessageDialog(((BuildModeView) view ),"PROFILE VIEW");
      } else if (e.getSource() == ((BuildModeView) view ).getMntmViewZoo()) {
        JOptionPane.showMessageDialog(((BuildModeView) view ), "VIEW ZOO VIEW");
      }
    }
  }

  private class CalcListener implements ActionListener {
    public void actionPerformed(ActionEvent e){

      if (e.getSource() == ((CalcView) view).getCalcButton()) {
        ((CalcModel) model).calc(((CalcView) view).getFirstNum(),((CalcView) view).getSecondNum());
        ((CalcView) view).setResult(((CalcModel) model).getCalcValue());
        //Edit--
        ((CalcView) view).setVisible(false);
        model = buildModeModel;
        view = buildModeView;
        ((BuildModeView) view).setVisible(true);
        //--ediT
      } else {
        System.out.println("No");
      }
    }
  }
}

