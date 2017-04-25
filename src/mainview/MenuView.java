package mainview;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class MenuView extends JFrame {

	private JPanel contentPane;
	private JMenuItem mntmExit;
	private JButton btnNewGame;
	private JButton btnLoad;
	private JButton btnExit;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuView frame = new MenuView();
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
	public MenuView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		mntmExit = new JMenuItem("Exit");
		mnMenu.add(mntmExit);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewGame = new JButton("New Game");
		btnNewGame.setBounds(44, 178, 89, 23);
		contentPane.add(btnNewGame);
		
		btnLoad = new JButton("Load");
		btnLoad.setBounds(180, 178, 89, 23);
		contentPane.add(btnLoad);
		
		btnExit = new JButton("Exit");
		btnExit.setBounds(310, 178, 89, 23);
		contentPane.add(btnExit);
		
		/*BufferedImage image = null;
		try {
			image = ImageIO.read(getClass().getResource("/img/logozoo.PNG"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ImageIcon img = new ImageIcon(image);
		JLabel labelImage = new JLabel();
		labelImage.setBounds(0, 145, 374, -145);
		contentPane.add(labelImage);*/
	}
	
	public JButton getBtnNewGame() {
		return btnNewGame;
	}
	public JButton getBtnLoad() {
		return btnLoad;
	}
	public JButton getBtnExit(){
		return btnExit;
	}
	public JMenuItem getmntmExit(){
		return mntmExit;
	}
	public void addAllListener(ActionListener listen){
		btnLoad.addActionListener(listen);
		btnNewGame.addActionListener(listen);
		btnExit.addActionListener(listen);
		mntmExit.addActionListener(listen);
	}
}
