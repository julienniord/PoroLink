package poroLink.views;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JTextField;

import poroLink.utils.views.ViewUtils;

import javax.swing.JButton;
import javax.swing.JPasswordField;

public class LoginView extends BaseView {

	private JTextField loginTextField;
	private JPasswordField passwordField;
	private GridBagLayout gridBagLayout;
	private JLabel lblLogin;
	private JLabel lblLoginPage;
	private JLabel lblPassword;
	private JButton btnValidate;

	/**
	 * @return the passwordField
	 */
	public JPasswordField getPasswordField() {
		return passwordField;
	}

	/**
	 * @param passwordField the passwordField to set
	 */
	public void setPasswordField(JPasswordField passwordField) {
		this.passwordField = passwordField;
	}

	/**
	 * @return the gridBagLayout
	 */
	public GridBagLayout getGridBagLayout() {
		return gridBagLayout;
	}

	/**
	 * @param gridBagLayout the gridBagLayout to set
	 */
	public void setGridBagLayout(GridBagLayout gridBagLayout) {
		this.gridBagLayout = gridBagLayout;
	}

	/**
	 * @return the lblLogin
	 */
	public JLabel getLblLogin() {
		return lblLogin;
	}

	/**
	 * @param lblLogin the lblLogin to set
	 */
	public void setLblLogin(JLabel lblLogin) {
		this.lblLogin = lblLogin;
	}

	/**
	 * @return the lblLoginPage
	 */
	public JLabel getLblLoginPage() {
		return lblLoginPage;
	}

	/**
	 * @param lblLoginPage the lblLoginPage to set
	 */
	public void setLblLoginPage(JLabel lblLoginPage) {
		this.lblLoginPage = lblLoginPage;
	}

	/**
	 * @return the lblPassword
	 */
	public JLabel getLblPassword() {
		return lblPassword;
	}

	/**
	 * @param lblPassword the lblPassword to set
	 */
	public void setLblPassword(JLabel lblPassword) {
		this.lblPassword = lblPassword;
	}

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

	public JTextField getLoginTextField() {
		return loginTextField;
	}

	public void setLoginTextField(JTextField loginTextField) {
		this.loginTextField = loginTextField;
	}

	/**
	 * Create the frame.
	 */
	public LoginView(JFrame frame) {
		super.pageName = "Login";
		super.contentPane = new JPanel();

		gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{200, 0, 0, 0, 0, 0, 200};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);

		lblLoginPage = new JLabel("Login Page");
		GridBagConstraints gbc_lblLoginPage = new GridBagConstraints();
		gbc_lblLoginPage.insets = new Insets(0, 0, 5, 0);
		gbc_lblLoginPage.gridx = 5;
		gbc_lblLoginPage.gridy = 2;
		getContentPane().add(lblLoginPage, gbc_lblLoginPage);

		lblLogin = new JLabel("Login");
		GridBagConstraints gbc_lblLogin = new GridBagConstraints();
		gbc_lblLogin.insets = new Insets(0, 0, 5, 5);
		gbc_lblLogin.gridx = 3;
		gbc_lblLogin.gridy = 4;
		getContentPane().add(lblLogin, gbc_lblLogin);

		loginTextField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 5;
		gbc_textField.gridy = 4;
		getContentPane().add(loginTextField, gbc_textField);
		loginTextField.setColumns(10);

		lblPassword = new JLabel("Password");
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.gridx = 3;
		gbc_lblPassword.gridy = 6;
		getContentPane().add(lblPassword, gbc_lblPassword);

		passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(0, 0, 5, 0);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 5;
		gbc_passwordField.gridy = 6;
		getContentPane().add(passwordField, gbc_passwordField);

		btnValidate = new JButton("Validate");
		GridBagConstraints gbc_btnValidate = new GridBagConstraints();
		gbc_btnValidate.gridx = 5;
		gbc_btnValidate.gridy = 8;
		getContentPane().add(btnValidate, gbc_btnValidate);
	}
}
