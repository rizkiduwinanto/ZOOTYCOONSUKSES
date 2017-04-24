package menu.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public MenuPanel() {
		setBackground(new Color(0, 128, 0));
		
		JButton btnBuild = new JButton("Build");
		btnBuild.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnGuest = new JButton("Guest");
		
		JButton btnProfile = new JButton("Profile");
		
		JButton btnCreator = new JButton("Creator");
		SpringLayout springLayout = new SpringLayout();
		springLayout.putConstraint(SpringLayout.NORTH, btnGuest, 215, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.NORTH, btnBuild, 215, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnCreator, -76, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.EAST, btnGuest, -228, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.EAST, btnProfile, -155, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.EAST, btnBuild, -10, SpringLayout.WEST, btnGuest);
		setLayout(springLayout);
		add(btnBuild);
		add(btnGuest);
		add(btnProfile);
		add(btnCreator);
		
		JLabel lblZoo = new JLabel("ZOO");
		springLayout.putConstraint(SpringLayout.NORTH, btnCreator, 24, SpringLayout.SOUTH, lblZoo);
		springLayout.putConstraint(SpringLayout.NORTH, btnProfile, 24, SpringLayout.SOUTH, lblZoo);
		springLayout.putConstraint(SpringLayout.NORTH, lblZoo, 76, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblZoo, 61, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblZoo, -24, SpringLayout.NORTH, btnBuild);
		springLayout.putConstraint(SpringLayout.EAST, lblZoo, -64, SpringLayout.EAST, this);
		lblZoo.setHorizontalAlignment(SwingConstants.CENTER);
		lblZoo.setFont(new Font("Tahoma", Font.PLAIN, 95));
		add(lblZoo);

	}
}
