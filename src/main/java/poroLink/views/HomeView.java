package poroLink.views;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.GridBagLayout;

import javax.swing.JTextField;

import poroLink.views.usercontrols.MenuBar;

import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class HomeView extends BaseView {
	private JButton btnValidate;
	private MenuBar menuBar;
	
	
	
	/**
	 * @return the btnValidate
	 */
	public JButton getBtnValidate() {
		return btnValidate;
	}

	/**
	 * @param btnValidate the btnValidate to set
	 */
	public void setBtnValidate(JButton btnValidate) {
		this.btnValidate = btnValidate;
	}


	/**
	 * @return the menuBar
	 */
	public MenuBar getMenuBar() {
		return menuBar;
	}

	/**
	 * @param menuBar the menuBar to set
	 */
	public void setMenuBar(MenuBar menuBar) {
		this.menuBar = menuBar;
	}

	/**
	 * Create the frame.
	 */
	public HomeView(JFrame frame) {
		super.pageName = "Accueil";
		JPanel panel = new JPanel();
		super.contentPane = panel;

		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);

		menuBar = new MenuBar();
		GridBagConstraints gbc_menuBar = new GridBagConstraints();
		gbc_menuBar.fill = GridBagConstraints.HORIZONTAL;
		gbc_menuBar.gridx = 0;
		gbc_menuBar.gridy = 0;
		gbc_menuBar.gridwidth = 10;
		panel.add(menuBar.getContentPane(), gbc_menuBar);
		
		btnValidate = new JButton("Recherche de candidats");
		
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("Pictures/logoBienvenue.png"));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 2;
		panel.add(label, gbc_label);
		
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 3;
		panel.add(btnValidate, gbc_btnNewButton);
	}
}
