package mainview;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class NewGameView extends JFrame {

	private JPanel contentPane;
	private JTextField pemilikField;
	private JTextField namaZooField;
	private JButton btnBuild;
	private JButton btnCancel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewGameView frame = new NewGameView();
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
	public NewGameView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Nama Pemilik :");
		label.setBounds(72, 55, 105, 22);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Nama Zoo :");
		label_1.setBounds(72, 88, 73, 14);
		contentPane.add(label_1);
		
		pemilikField = new JTextField();
		pemilikField.setBounds(150, 56, 204, 20);
		contentPane.add(pemilikField);
		pemilikField.setColumns(10);
		
		namaZooField = new JTextField();
		namaZooField.setBounds(150, 88, 203, 20);
		contentPane.add(namaZooField);
		namaZooField.setColumns(10);
		
		btnBuild = new JButton("Build");
		btnBuild.setBounds(107, 143, 89, 23);
		contentPane.add(btnBuild);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setBounds(234, 143, 89, 23);
		contentPane.add(btnCancel);
	}
	
	public JButton getBtnBuild(){
		return btnBuild;
	}
	
	public JButton getBtnCancel(){
		return btnCancel;
	}
	
	public JTextField getPemilikField(){
		return pemilikField;
	}
	
	public JTextField getNamaZooField(){
		return namaZooField;
	}
	
	public void addAllListener(ActionListener listen){
		btnBuild.addActionListener(listen);
		btnCancel.addActionListener(listen);
	}
}
