package mainview;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import point.Point;
import zoo.Zoo;

public class BuildModeView extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JMenuBar menuBar;
	private JMenu mnMode;
	private JMenuItem mntmNewMenuItem, mntmProfile;
	private JButton btnBuyAnimal, btnSellAnimal, btnMoveAnimal, btnChangeCellType;
	private JLabel lblNewLabel, lblCiburZoo;
	private ImageIcon imgThisImg;
	private JMenuItem mntmMenu;

	/**
	 * Launch the application.
	 */


	/**
	 * Initiation
	 */
	public void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 726, 582);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		mnMode = new JMenu("Mode");
		menuBar.add(mnMode);

		mntmNewMenuItem = new JMenuItem("Tur");
		mnMode.add(mntmNewMenuItem);

		mntmProfile = new JMenuItem("Profile");
		mnMode.add(mntmProfile);
		
		mntmMenu = new JMenuItem("Menu");
		mnMode.add(mntmMenu);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		table = new JTable() {
			@Override
		    public Component prepareRenderer(TableCellRenderer renderer, int row, int col) {
		        Component comp = super.prepareRenderer(renderer, row, col);
		        Object value = getModel().getValueAt(row, col);
		        if (value!=null){
		        	if (value.equals('w')){
		        		comp.setBackground(Color.blue);
		        	} else if (value.equals('a')) {
		        		comp.setBackground(Color.cyan);
		        	} else if (value.equals('x')) {
		        		comp.setBackground(Color.green);
		        	} else if (value.equals('R')){
		        		comp.setBackground(Color.magenta);
		        	} else if (value.equals('.')) {
		        		comp.setBackground(Color.gray);
		        	} else if (value.equals('#')) {
		        		comp.setBackground(Color.ORANGE);
		        	} else {
		        		comp.setBackground(Color.white);
		        	}
		        }
		        return comp;
		    }
		};
		//table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
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
		table.setBounds(10, 11, 500, 500);
		contentPane.add(table);

		btnBuyAnimal = new JButton("BUY ANIMAL");
		btnBuyAnimal.setFont(new Font("Kristen ITC", Font.BOLD, 11));
		btnBuyAnimal.setBounds(520, 158, 180, 45);
		contentPane.add(btnBuyAnimal);

		btnSellAnimal = new JButton("SELL ANIMAL");
		btnSellAnimal.setFont(new Font("Kristen ITC", Font.BOLD, 11));
		btnSellAnimal.setBounds(520, 230, 180, 45);
		contentPane.add(btnSellAnimal);

		btnMoveAnimal = new JButton("MOVE ANIMAL");
		btnMoveAnimal.setFont(new Font("Kristen ITC", Font.BOLD, 11));
		btnMoveAnimal.setBounds(520, 302, 180, 45);
		contentPane.add(btnMoveAnimal);

		btnChangeCellType = new JButton("CHANGE CELL TYPE");
		btnChangeCellType.setFont(new Font("Kristen ITC", Font.BOLD, 11));
		btnChangeCellType.setBounds(520, 374, 180, 45);
		contentPane.add(btnChangeCellType);

		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(539, 11, 161, 109);

		imgThisImg = new ImageIcon("img/logozoo.PNG");
		lblNewLabel.setIcon(imgThisImg);

		contentPane.add(lblNewLabel);

		lblCiburZoo = new JLabel("Cibur Zoo");
		lblCiburZoo.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 14));
		lblCiburZoo.setBounds(576, 121, 104, 26);
		contentPane.add(lblCiburZoo);

	}

	/**
	 * Mengisi tabel dengan zoo
	 * @param table
	 * @param myZoo
	 */
	public void fillTable(JTable table,Zoo myZoo) {
		assert(myZoo.getKolom() == 25) : "Kolom dari matriks of cell pada zoo harus 25";
		assert(myZoo.getBaris() == 25) : "Baris dari matrisk of cell pada zoo harus 25";
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment( JLabel.CENTER );
		
		for (int i = 0; i < myZoo.getBaris(); i++) {
			for (int j = 0; j < myZoo.getKolom(); j++) {
				Point p = new Point(j,i);
				if (myZoo.getCell(p)!=null){
					table.getModel().setValueAt(myZoo.getCell(p).render(),i,j);
				}
				
			}
		}
		
		for (int j = 0; j < myZoo.getKolom(); j++) {
			table.getColumnModel().getColumn(j).setCellRenderer( centerRenderer );
		}
	}

	/**
	 * Create the frame.
	 */
	public BuildModeView() {
		super("Build mode");
		init();
	}


	public void addAllListener(ActionListener listen) {
		btnBuyAnimal.addActionListener(listen);
		btnSellAnimal.addActionListener(listen);
		btnMoveAnimal.addActionListener(listen);
		btnChangeCellType.addActionListener(listen);
		mntmNewMenuItem.addActionListener(listen);
		mntmProfile.addActionListener(listen);
		mntmMenu.addActionListener(listen);
	}


	public JTable getTable() {
		return table;
	}

	public JMenu getMnMode() {
		return mnMode;
	}

	public JMenuItem getMntmNewMenuItem() {
		return mntmNewMenuItem;
	}

	public JMenuItem getMntmProfile() {
		return mntmProfile;
	}

	
	public JMenuItem getMntmMenu(){
		return mntmMenu;
	}

	public JButton getBtnBuyAnimal() {
		return btnBuyAnimal;
	}

	public JButton getBtnSellAnimal() {
		return btnSellAnimal;
	}

	public JButton getBtnMoveAnimal() {
		return btnMoveAnimal;
	}

	public JButton getBtnChangeCellType() {
		return btnChangeCellType;
	}

	public JLabel getLblNewLabel() {
		return lblNewLabel;
	}

	public JLabel getLblCiburZoo() {
		return lblCiburZoo;
	}

	public ImageIcon getImgThisImg() {
		return imgThisImg;
	}
	
	
	
	
}
