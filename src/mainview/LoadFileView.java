package mainview;

import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class LoadFileView extends JFrame {
	private JComboBox comboBox;
	private JPanel contentPane;
	private JButton btnOk;
	
	/**
	 * Create the frame.
	 */
	public LoadFileView() {
		super("Load File");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 358, 167);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String path = System.getProperty("user.dir") + "/savedprofile";

	    File folder = new File(path);
	    File[] listOfFiles = folder.listFiles();
		
	    comboBox = new JComboBox();
		comboBox.setBounds(129, 45, 179, 20);
		for (File file : listOfFiles){
			comboBox.addItem(file.getName());
		}
				
		contentPane.add(comboBox);
		
		JLabel lblPilihProfiles = new JLabel("Pilih profiles :");
		lblPilihProfiles.setBounds(28, 48, 76, 14);
		contentPane.add(lblPilihProfiles);
		
		btnOk = new JButton("OK");
		btnOk.setBounds(150, 94, 63, 23);
		contentPane.add(btnOk);
		this.setLocationRelativeTo(null);
	}
	
	public JComboBox getComboBox() {
		return comboBox;
	}
	
	public JButton getBtnOk() {
		return btnOk;
	}
	
	public void addAllListener(ActionListener listen) {
		btnOk.addActionListener(listen);
	}
}
