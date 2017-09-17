package poroLink.views.usercontrols;

import javax.swing.JPanel;

import poroLink.views.BaseView;

import java.awt.FlowLayout;
import javax.swing.JLabel;

public class MenuBar extends BaseView {

	private JLabel lblWelcome;
	private JLabel lblUserlastname;
	private JLabel lblUserfirstname;
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
	public JLabel getLblUserlastname() {
		return lblUserlastname;
	}

	/**
	 * @param lblUserlastname the lblUserlastname to set
	 */
	public void setLblUserlastname(JLabel lblUserlastname) {
		this.lblUserlastname = lblUserlastname;
	}

	/**
	 * @return the lblUserfirstname
	 */
	public JLabel getLblUserfirstname() {
		return lblUserfirstname;
	}

	/**
	 * @param lblUserfirstname the lblUserfirstname to set
	 */
	public void setLblUserfirstname(JLabel lblUserfirstname) {
		this.lblUserfirstname = lblUserfirstname;
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
		panel.setBackground(new java.awt.Color(87, 108, 168));
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

		lblWelcome = new JLabel("Welcome");
		panel.add(lblWelcome);

		lblUserlastname = new JLabel("UserLastname");
		panel.add(lblUserlastname);

		lblUserfirstname = new JLabel("UserFirstname");
		panel.add(lblUserfirstname);
		
		navigationBar = new NavigationBar();
		panel.add(navigationBar.getContentPane());
	}
}
