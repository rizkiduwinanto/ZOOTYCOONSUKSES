package mainview;

import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
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
	private JMenuItem mntmMenu;
	private JMenuItem mntmTourView;
	private JList list;
	private JTextArea txtrNamaPemilik;
	private JTextArea txtrNamaZoo;
	private JTextArea txtrUang;
	private JTextArea txtrJumlahAnimal;
	private DefaultListModel listModel;
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
		super("Profile");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("Mode");
		menuBar.add(mnFile);
		
		mntmBuild = new JMenuItem("Build");
		mnFile.add(mntmBuild);
		
		mntmTourView = new JMenuItem("Tour View");
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
		txtrNamaPemilik.setEditable(false);
		txtrNamaPemilik.setBounds(228, 34, 105, 22);
		contentPane.add(txtrNamaPemilik);
		
		txtrNamaZoo = new JTextArea();
		txtrNamaZoo.setEditable(false);
		txtrNamaZoo.setBounds(228, 63, 105, 22);
		contentPane.add(txtrNamaZoo);
		
		txtrUang = new JTextArea();
		txtrUang.setEditable(false);
		txtrUang.setBounds(228, 93, 105, 22);
		contentPane.add(txtrUang);
		
		txtrJumlahAnimal = new JTextArea();
		txtrJumlahAnimal.setEditable(false);
		txtrJumlahAnimal.setBounds(228, 126, 105, 22);
		contentPane.add(txtrJumlahAnimal);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(225, 156, 108, 34);
		
		listModel = new DefaultListModel();
		list = new JList(listModel);
		scrollPane.setViewportView(list);
		contentPane.add(scrollPane);
	}
	
	public void setList(ArrayList<String> achieve){
		if (achieve.size() > 0) {
			
			for (String acv : achieve) {
				listModel.addElement(acv);
			}
			list = new JList(listModel);
		}
	}
	
	public void setPemilik(String pemilik){
		txtrNamaPemilik.setText(pemilik);
	}
	
	public void setZoo(String zoo){
		txtrNamaZoo.setText(zoo);
	}
	
	public void setUang(long uang){
		txtrUang.setText(String.valueOf(uang));
	}
	
	public void setAnimal(int animal){
		txtrJumlahAnimal.setText(String.valueOf(animal));
	}
	
	public JMenuItem getMenuBuild(){
		return mntmBuild;
	}
	
	
	public JMenuItem getMenuMain(){
		return mntmMenu;
	}
	
	public JMenuItem getMenuTourView() {
		return mntmTourView;
	}
	
	public void addAllListener(ActionListener listen){
		mntmBuild.addActionListener(listen);
		mntmMenu.addActionListener(listen);
		mntmTourView.addActionListener(listen);
	}
}
