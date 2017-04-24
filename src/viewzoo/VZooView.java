package viewzoo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import point.Point;
import zoo.Zoo;

import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

public class VZooView extends JFrame {

  private JPanel contentPane;
  private JTable table;
  private JMenuItem mntmNewMenuItem;
  private JMenuItem mntmNewMenuItem_1;
  private JMenuItem mntmNewMenuItem_2;
  private JMenuItem mntmNewMenuItem_3;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          new VZooController();
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the frame.
   */
  public VZooView() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 522, 576);
    
    JMenuBar menuBar = new JMenuBar();
    setJMenuBar(menuBar);
    
    JMenu mnNewMenu = new JMenu("Mode");
    mnNewMenu.setForeground(new Color(0, 0, 0));
    mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 15));
    menuBar.add(mnNewMenu);
    
    mntmNewMenuItem = new JMenuItem("Build Mode");
    mnNewMenu.add(mntmNewMenuItem);
    
    mntmNewMenuItem_1 = new JMenuItem("Tour View");
    mnNewMenu.add(mntmNewMenuItem_1);
    
    mntmNewMenuItem_2 = new JMenuItem("Profile");
    mnNewMenu.add(mntmNewMenuItem_2);
    
    mntmNewMenuItem_3 = new JMenuItem("Exit");
    mnNewMenu.add(mntmNewMenuItem_3);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    table = new JTable();
    table.setRowHeight(20);
    table.setBorder(new LineBorder(new Color(0, 0, 0)));
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
    table.setBounds(0, 0, 500, 500);
    contentPane.add(table);
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
   * Getter Menu Tour View.
   * @return mntmNewMenuItem_1
   */
  public JMenuItem getMenu2() {
    return mntmNewMenuItem_1;
  }
  
  /**
   * Getter Menu Profile.
   * @return mntmNewMenuItem_2
   */
  public JMenuItem getMenu3() {
    return mntmNewMenuItem_2;
  }
  
  /**
   * Getter Menu Exit.
   * @return mntmNewMenuItem_3
   */
  public JMenuItem getMenu4() {
    return mntmNewMenuItem_3;
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
    mntmNewMenuItem_1.addActionListener(listen);
    mntmNewMenuItem_2.addActionListener(listen);
    mntmNewMenuItem_3.addActionListener(listen);
  }
}
