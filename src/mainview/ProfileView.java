package mainview;

import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public class ProfileView extends JFrame {

	private JPanel contentPane;
	private JMenuItem mntmBuild;
	private JMenuItem mntmView;
	private JMenuItem mntmMenu;
	private JList<String> list;
	private JTextArea txtrNamaPemilik;
	private JTextArea txtrNamaZoo;
	private JTextArea txtrUang;
	private JTextArea txtrJumlahAnimal;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProfileView frame = new ProfileView();
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
	public ProfileView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("Mode");
		menuBar.add(mnFile);
		
		mntmBuild = new JMenuItem("Build");
		mnFile.add(mntmBuild);
		
		mntmView = new JMenuItem("View Zoo");
		mnFile.add(mntmView);
		
		JMenuItem mntmTourView = new JMenuItem("Tour View");
		mnFile.add(mntmTourView);
		
		mntmMenu = new JMenuItem("Main Menu");
		mnFile.add(mntmMenu);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNamaPemilik = new JLabel("Nama Pemilik :");
		lblNamaPemilik.setBounds(68, 35, 105, 22);
		contentPane.add(lblNamaPemilik);
		
		JLabel lblNamaZoo = new JLabel("Nama Zoo :");
		lblNamaZoo.setBounds(68, 68, 73, 14);
		contentPane.add(lblNamaZoo);
		
		JLabel lblUang = new JLabel("Uang :");
		lblUang.setBounds(68, 93, 105, 27);
		contentPane.add(lblUang);
		
		JLabel lblJumlahAnimal = new JLabel("Jumlah Animal :");
		lblJumlahAnimal.setBounds(68, 131, 105, 14);
		contentPane.add(lblJumlahAnimal);
		
		JLabel lblAchievement = new JLabel("Achievement :");
		lblAchievement.setBounds(68, 156, 94, 14);
		contentPane.add(lblAchievement);
		
		txtrNamaPemilik = new JTextArea();
		txtrNamaPemilik.setBounds(228, 34, 105, 22);
		contentPane.add(txtrNamaPemilik);
		
		txtrNamaZoo = new JTextArea();
		txtrNamaZoo.setBounds(228, 63, 105, 22);
		contentPane.add(txtrNamaZoo);
		
		txtrUang = new JTextArea();
		txtrUang.setBounds(228, 93, 105, 22);
		contentPane.add(txtrUang);
		
		txtrJumlahAnimal = new JTextArea();
		txtrJumlahAnimal.setBounds(228, 126, 115, 22);
		contentPane.add(txtrJumlahAnimal);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(225, 156, 108, 34);
		contentPane.add(scrollPane);
		
		list = new JList<String>();
		scrollPane.setViewportView(list);
	}
	
	public void setList(ArrayList<String> achieve){
		list.setListData((String[]) achieve.toArray());
	}
	
	public void setPemilik(String pemilik){
		txtrNamaPemilik.setText(pemilik);
	}
	
	public void setZoo(String zoo){
		txtrNamaZoo.setText(zoo);
	}
	
	public void setUang(int uang){
		txtrUang.setText(String.valueOf(uang));
	}
	
	public void setAnimal(int animal){
		txtrJumlahAnimal.setText(String.valueOf(animal));
	}
	
	public JMenuItem getMenuBuild(){
		return mntmBuild;
	}
	
	public JMenuItem getMenuView(){
		return mntmView;
	}
	
	public JMenuItem getMenuMain(){
		return mntmMenu;
	}
	
	public void addAllListener(ActionListener listen){
		mntmBuild.addActionListener(listen);
		mntmView.addActionListener(listen);
		mntmMenu.addActionListener(listen);
	}
}
