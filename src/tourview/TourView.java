package tourview;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;

import point.Point;
import zoo.Zoo;

import java.awt.Component;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Dimension;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.CompoundBorder;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 * 
 * @author Hisham Lazuardi Yusuf (13515069)
 *
 */
@SuppressWarnings("serial")
public class TourView extends JFrame {

  private JPanel contentPane;
  private JTable table;
  private JMenuItem mntmNewMenuItem;
  private JMenuItem mntmNewMenuItem_2;
  private JMenuItem mntmNewMenuItem_3;
  private JMenuItem mntmNewMenuItem_4;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          new TourController();
          // TourController frame = new TourController();
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the frame.
   */
  public TourView() {
    setPreferredSize(new Dimension(10, 4));
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 521, 694);
    contentPane = new JPanel();
    contentPane.setFocusTraversalKeysEnabled(false);
    contentPane.setAlignmentY(Component.TOP_ALIGNMENT);
    contentPane.setAlignmentX(Component.CENTER_ALIGNMENT);
    contentPane.setBackground(new Color(240, 240, 240));
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    table = new JTable();
    table.setBorder(new LineBorder(new Color(0, 0, 0)));
    table.setBounds(0, 29, 500, 500);
    table.setRowHeight(20);
    table.setModel(new DefaultTableModel(
    	new Object[][] {
    		{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
    		{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
    		{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
    		{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
    		{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
    		{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
    		{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
    		{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
    		{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
    		{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
    		{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
    		{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
    		{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
    		{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
    		{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
    		{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
    		{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
    		{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
    		{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
    		{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
    		{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
    		{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
    		{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
    		{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
    		{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
    	},
    	new String[] {
    		"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
    	}
    ));
    contentPane.add(table);
    
    JTextPane textPane = new JTextPane();
    textPane.setBorder(new MatteBorder(5, 5, 7, 7, (Color) Color.GRAY));
    textPane.setBounds(0, 529, 500, 120);
    textPane.setFont(new Font("Consolas", Font.PLAIN, 14));
    textPane.setText("Singa : Roaarrrr" + "\r\n" + "Harimau : Grrrr");
    textPane.setEditable(false);
    contentPane.add(textPane);
    
    JMenuBar menuBar = new JMenuBar();
    menuBar.setBounds(0, 0, 500, 26);
    contentPane.add(menuBar);
    
    JMenu mnNewMenu = new JMenu("Mode");
    mnNewMenu.setForeground(Color.BLACK);
    menuBar.add(mnNewMenu);
    
    mntmNewMenuItem = new JMenuItem("Build Mode");
    mnNewMenu.add(mntmNewMenuItem);
    
    mntmNewMenuItem_2 = new JMenuItem("View Zoo");
    mnNewMenu.add(mntmNewMenuItem_2);
    
    mntmNewMenuItem_3 = new JMenuItem("Profile");
    mnNewMenu.add(mntmNewMenuItem_3);
    
    mntmNewMenuItem_4= new JMenuItem("Exit");
    mnNewMenu.add(mntmNewMenuItem_4);
  }
  
  /**
   * Prosedur untuk mengisi tabel dengan Zoo.
   * I.S. table dan myZoo terdefinisi
   * F.S. table terisi dengan map tampilan dari myZoo beserta hewan-hewan
   * @param table
   * @param myZoo
   */
  public void fillTable(JTable table, Zoo myZoo) {
    assert(myZoo.getKolom() == 25) : "Kolom dari matriks of cell pada zoo harus 25";
    assert(myZoo.getBaris() == 25) : "Baris dari matrisk of cell pada zoo harus 25";
    for (int i = 0; i < myZoo.getBaris(); i++) {
      for (int j = 0; j < myZoo.getKolom(); j++) {
        table.getModel().setValueAt(myZoo.getCell(new Point(j,i)).render(),j,i);
      }
    }
  }
  
  /**
   * Getter Menu Build Mode.
   * @return mntmNewMenuItem
   */
  public JMenuItem getMenu1() {
	  return mntmNewMenuItem;
  }
  
  /**
   * Getter Menu View Zoo.
   * @return mntmNewMenuItem_2
   */
  public JMenuItem getMenu2() {
	  return mntmNewMenuItem_2;
  }
  
  /**
   * Getter Menu Profile.
   * @return mntmNewMenuItem_3
   */
  public JMenuItem getMenu3() {
	  return mntmNewMenuItem_3;
  }
  
  /**
   * Getter Menu Exit.
   * @return mntmNewMenuItem_4
   */
  public JMenuItem getMenu4() {
    return mntmNewMenuItem_4;
  }
  
  /**
   * 
   */
  public JTable getTable() {
    return table;
  }
  
  /**
   * Prosedur untuk menambahkan listener dari semua menu dan button.
   * @param listen sebuah ActionListener untuk button atau menu
   */
  public void addAllListener(ActionListener listen) {
	  mntmNewMenuItem.addActionListener(listen);
	  mntmNewMenuItem_2.addActionListener(listen);
	  mntmNewMenuItem_3.addActionListener(listen);
	  mntmNewMenuItem_4.addActionListener(listen);
  }
}
