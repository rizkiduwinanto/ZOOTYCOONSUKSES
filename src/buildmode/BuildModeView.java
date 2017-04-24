package buildmode;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

public class BuildModeView extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuildModeView frame = new BuildModeView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BuildModeView() {
		super("Build Mode");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 726, 582);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMode = new JMenu("Mode");
		menuBar.add(mnMode);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Tur");
		mnMode.add(mntmNewMenuItem);
		
		JMenuItem mntmProfile = new JMenuItem("Profile");
		mnMode.add(mntmProfile);
		
		JMenuItem mntmViewZoo = new JMenuItem("View Zoo");
		mnMode.add(mntmViewZoo);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
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
		
		JButton btnBuyAnimal = new JButton("BUY ANIMAL");
		btnBuyAnimal.setFont(new Font("Kristen ITC", Font.BOLD, 11));
		btnBuyAnimal.setBounds(520, 158, 180, 45);
		contentPane.add(btnBuyAnimal);
		
		JButton btnSellAnimal = new JButton("SELL ANIMAL");
		btnSellAnimal.setFont(new Font("Kristen ITC", Font.BOLD, 11));
		btnSellAnimal.setBounds(520, 230, 180, 45);
		contentPane.add(btnSellAnimal);
		
		JButton btnMoveAnimal = new JButton("MOVE ANIMAL");
		btnMoveAnimal.setFont(new Font("Kristen ITC", Font.BOLD, 11));
		btnMoveAnimal.setBounds(520, 302, 180, 45);
		contentPane.add(btnMoveAnimal);
		
		JButton btnChangeCellType = new JButton("CHANGE CELL TYPE");
		btnChangeCellType.setFont(new Font("Kristen ITC", Font.BOLD, 11));
		btnChangeCellType.setBounds(520, 374, 180, 45);
		contentPane.add(btnChangeCellType);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(539, 11, 161, 109);
		
		ImageIcon imgThisImg = new ImageIcon("img/logozoo.PNG");
		lblNewLabel.setIcon(imgThisImg);
		
		contentPane.add(lblNewLabel);
		
		JLabel lblCiburZoo = new JLabel("Cibur Zoo");
		lblCiburZoo.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 14));
		lblCiburZoo.setBounds(576, 121, 104, 26);
		contentPane.add(lblCiburZoo);
		
	}
}
