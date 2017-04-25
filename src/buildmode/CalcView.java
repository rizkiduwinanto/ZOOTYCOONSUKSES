package buildmode;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Created by AZIS ADI KUNCORO (13515120) on 13/04/2017.
 */
public class CalcView extends JFrame {

  private JTextField firstNum = new JTextField(10);
  private JLabel operatorPlus = new JLabel("+");
  private JTextField secondNum = new JTextField(10);
  private JButton calcButton = new JButton("Calculate");
  private JTextField result = new JTextField(10);

  CalcView(){
    super("Calculator standard");
    setSize(600,400);
    JPanel panel = new JPanel();

    panel.add(firstNum);
    panel.add(operatorPlus);
    panel.add(secondNum);
    panel.add(calcButton);
    result.setEditable(false);
    panel.add(result);
    add(panel);
  }

  public void setResult(int res){
    result.setText(Integer.toString(res));
  }

  public int getFirstNum(){
    return Integer.parseInt(firstNum.getText());
  }

  public int getSecondNum(){
    return Integer.parseInt(secondNum.getText());
  }

  public void addCalcButtonListener(ActionListener listen) {
    calcButton.addActionListener(listen);
  }

  public JButton getCalcButton(){
    return calcButton;
  }

}
