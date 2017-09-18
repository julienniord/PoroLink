package poroLink.views.usercontrols;

import javax.swing.JPanel;

import poroLink.views.BaseView;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;

public class MenuBar extends BaseView {

	private JLabel lblWelcome;
	private JLabel buttonProfil;
	private NavigationBar navigationBar;

	/**
	 * @return the lblWelcome
	 */
	public JLabel getLblWelcome() {
		return lblWelcome;
	}

	/**
	 * @param lblWelcome the lblWelcome to set
	 */
	public void setLblWelcome(JLabel lblWelcome) {
		this.lblWelcome = lblWelcome;
	}

	/**
	 * @return the lblUserlastname
	 */
	public JLabel getButtonProfil() {
		return buttonProfil;
	}

	/**
	 * @param lblUserlastname the lblUserlastname to set
	 */
	public void setButtonProfil(JLabel buttonProfil) {
		this.buttonProfil = buttonProfil;
	}

	/**
	 * @return the navigationBar
	 */
	public NavigationBar getNavigationBar() {
		return navigationBar;
	}

	/**
	 * @param navigationBar the navigationBar to set
	 */
	public void setNavigationBar(NavigationBar navigationBar) {
		this.navigationBar = navigationBar;
	}

	/**
	 * Create the frame.
	 */
	public MenuBar() {
		super.pageName = "MenuBar";
		JPanel panel = new JPanel();
		super.contentPane = panel;
		panel.setBackground(new java.awt.Color(28, 85, 136));
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

		lblWelcome = new JLabel("Welcome");
		lblWelcome.setForeground(new java.awt.Color(245, 243, 245));
		panel.add(lblWelcome);

		buttonProfil = new JLabel("Profil");
		buttonProfil.setForeground(new java.awt.Color(245, 243, 245));
		panel.add(buttonProfil);

		
		navigationBar = new NavigationBar();
		panel.add(navigationBar.getContentPane());
	}
	

}
