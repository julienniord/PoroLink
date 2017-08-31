package poroLink.views;

import javax.swing.JFrame;
import javax.swing.JPanel;

import poroLink.utils.views.ViewUtils;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;

public class RegistrationView  extends BaseView{


	private JPanel registrationPanel;
	private JLabel mailLabel;
	private JTextField mailText;
	private JLabel pwdLabel;
	private JLabel validPwdLabel;
	private JButton btnRegistration;
	private ButtonGroup group;
	private JRadioButton candidateRadioButton;
	private JRadioButton companyRadioButton;
	private JLabel siretLabel;
	private JTextField siretText;
	private JPanel panelBlock;
	private JPasswordField pwdText;
	private JPasswordField validPwdText;
	private JTextArea failAlert;

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public JPanel getRegistrationPanel() {
		return registrationPanel;
	}

	public void setRegistrationPanel(JPanel registrationPanel) {
		this.registrationPanel = registrationPanel;
	}

	public JLabel getMailLabel() {
		return mailLabel;
	}

	public void setMailLabel(JLabel mailLabel) {
		this.mailLabel = mailLabel;
	}

	public JTextField getMailText() {
		return mailText;
	}

	public void setMailText(JTextField mailText) {
		this.mailText = mailText;
	}

	public JLabel getPwdLabel() {
		return pwdLabel;
	}

	public void setPwdLabel(JLabel pwdLabel) {
		this.pwdLabel = pwdLabel;
	}

	public JPasswordField getPwdText() {
		return pwdText;
	}

	public void setPwdText(JPasswordField pwdText) {
		this.pwdText = pwdText;
	}

	public JLabel getValidPwdLabel() {
		return validPwdLabel;
	}

	public void setValidPwdLabel(JLabel validPwdLabel) {
		this.validPwdLabel = validPwdLabel;
	}

	public JPasswordField getValidPwdText() {
		return validPwdText;
	}

	public void setValidPwdText(JPasswordField validPwdText) {
		this.validPwdText = validPwdText;
	}

	public JButton getBtnRegistration() {
		return btnRegistration;
	}

	public void setBtnRegistration(JButton btnRegistration) {
		this.btnRegistration = btnRegistration;
	}

	public JTextArea getFailLabel() {
		return failAlert;
	}

	public void setFailLabel( JTextArea failLabel) {
		this.failAlert = failLabel;
	}

	public JRadioButton getCandidateRadioButton() {
		return candidateRadioButton;
	}

	public void setCandidateRadioButton(JRadioButton candidateRadioButton) {
		this.candidateRadioButton = candidateRadioButton;
	}

	public JRadioButton getCompanyRadioButton() {
		return companyRadioButton;
	}

	public void setCompanyRadioButton(JRadioButton companyRadioButton) {
		this.companyRadioButton = companyRadioButton;
	}

	public JLabel getSiretLabel() {
		return siretLabel;
	}

	public void setSiretLabel(JLabel siretLabel) {
		this.siretLabel = siretLabel;
	}

	public JTextField getSiretText() {
		return siretText;
	}

	public void setSiretText(JTextField siretText) {
		this.siretText = siretText;
	}

	/**
	 * Create the frame.
	 */
	public RegistrationView(JFrame frame) {
		
		super.pageName = "Registration";
		JPanel panel = new JPanel();
		super.contentPane = panel;
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{30};
		gbl_contentPane.rowHeights = new int[]{30};
		panel.setLayout(gbl_contentPane);
		
		panelBlock = new JPanel();
		panelBlock.setOpaque(false);
		GridBagConstraints gbc_panelBlock = new GridBagConstraints();
		gbc_panelBlock.fill = GridBagConstraints.BOTH;
		gbc_panelBlock.gridx = 0;
		gbc_panelBlock.gridy = 0;
		panel.add(panelBlock, gbc_panelBlock);
		GridBagLayout gbl_panelBlock = new GridBagLayout();
		gbl_panelBlock.columnWidths = new int[]{30, 30, 65, 0};
		gbl_panelBlock.rowHeights = new int[]{30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30};
		gbl_panelBlock.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelBlock.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		panelBlock.setLayout(gbl_panelBlock);
		
		registrationPanel = new JPanel();
		GridBagConstraints gbc_registrationPanel = new GridBagConstraints();
		gbc_registrationPanel.fill = GridBagConstraints.BOTH;
		gbc_registrationPanel.gridheight = 9;
		gbc_registrationPanel.gridwidth = 3;
		gbc_registrationPanel.insets = new Insets(0, 0, 5, 0);
		gbc_registrationPanel.gridx = 0;
		gbc_registrationPanel.gridy = 0;
		panelBlock.add(registrationPanel, gbc_registrationPanel);
		registrationPanel.setBackground(new java.awt.Color(245, 243, 245, 150));
		GridBagLayout gbl_registrationPanel = new GridBagLayout();
		gbl_registrationPanel.columnWidths = new int[]{0, 213, 160, 30};
		gbl_registrationPanel.rowHeights = new int[]{30, 30, 30, 30, 30, 30, 30, 30, 30};
		gbl_registrationPanel.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0};
		gbl_registrationPanel.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		registrationPanel.setLayout(gbl_registrationPanel);
		
		failAlert = new JTextArea();
		failAlert.setFont(new Font("Arial", Font.PLAIN, 18));
		failAlert.setForeground(Color.RED);
		failAlert.setOpaque(false);
		failAlert.setVisible(false);
		failAlert.setEditable(false);
		GridBagConstraints gbc_failAlert = new GridBagConstraints();
		gbc_failAlert.gridheight = 2;
		gbc_failAlert.gridwidth = 2;
		gbc_failAlert.insets = new Insets(0, 0, 5, 5);
		gbc_failAlert.gridx = 1;
		gbc_failAlert.gridy = 0;
		registrationPanel.add(failAlert, gbc_failAlert);
		
		mailLabel = new JLabel("Adresse mail :");
		mailLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		GridBagConstraints gbc_mailLabel = new GridBagConstraints();
		gbc_mailLabel.anchor = GridBagConstraints.EAST;
		gbc_mailLabel.insets = new Insets(0, 0, 5, 5);
		gbc_mailLabel.gridx = 1;
		gbc_mailLabel.gridy = 2;
		registrationPanel.add(mailLabel, gbc_mailLabel);
		
		mailText = new JTextField();
		mailText.setFont(new Font("Arial", Font.PLAIN, 18));
		GridBagConstraints gbc_mailText = new GridBagConstraints();
		gbc_mailText.insets = new Insets(0, 0, 5, 5);
		gbc_mailText.fill = GridBagConstraints.HORIZONTAL;
		gbc_mailText.gridx = 2;
		gbc_mailText.gridy = 2;
		registrationPanel.add(mailText, gbc_mailText);
		mailText.setColumns(10);
		
		pwdLabel = new JLabel("Mot de passe :");
		pwdLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		GridBagConstraints gbc_pwdLabel = new GridBagConstraints();
		gbc_pwdLabel.insets = new Insets(0, 0, 5, 5);
		gbc_pwdLabel.anchor = GridBagConstraints.EAST;
		gbc_pwdLabel.gridx = 1;
		gbc_pwdLabel.gridy = 3;
		registrationPanel.add(pwdLabel, gbc_pwdLabel);
		
		pwdText = new JPasswordField();
		pwdText.setFont(new Font("Arial", Font.PLAIN, 18));
		GridBagConstraints gbc_pwdText = new GridBagConstraints();
		gbc_pwdText.insets = new Insets(0, 0, 5, 5);
		gbc_pwdText.fill = GridBagConstraints.HORIZONTAL;
		gbc_pwdText.gridx = 2;
		gbc_pwdText.gridy = 3;
		registrationPanel.add(pwdText, gbc_pwdText);
		
		validPwdLabel = new JLabel("Valider le mot de passe :");
		validPwdLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		GridBagConstraints gbc_validPwdLabel = new GridBagConstraints();
		gbc_validPwdLabel.insets = new Insets(0, 0, 5, 5);
		gbc_validPwdLabel.anchor = GridBagConstraints.EAST;
		gbc_validPwdLabel.gridx = 1;
		gbc_validPwdLabel.gridy = 4;
		registrationPanel.add(validPwdLabel, gbc_validPwdLabel);
		
		validPwdText = new JPasswordField();
		validPwdText.setFont(new Font("Arial", Font.PLAIN, 18));
		GridBagConstraints gbc_validPwdText = new GridBagConstraints();
		gbc_validPwdText.insets = new Insets(0, 0, 5, 5);
		gbc_validPwdText.fill = GridBagConstraints.HORIZONTAL;
		gbc_validPwdText.gridx = 2;
		gbc_validPwdText.gridy = 4;
		registrationPanel.add(validPwdText, gbc_validPwdText);
		
		candidateRadioButton = new JRadioButton("Candidat");
		candidateRadioButton.setFont(new Font("Arial", Font.PLAIN, 18));
		candidateRadioButton.setOpaque(false);
		candidateRadioButton.setRolloverEnabled(false);
		GridBagConstraints gbc_candidateRadioButton = new GridBagConstraints();
		gbc_candidateRadioButton.anchor = GridBagConstraints.EAST;
		gbc_candidateRadioButton.insets = new Insets(0, 0, 5, 5);
		gbc_candidateRadioButton.gridx = 1;
		gbc_candidateRadioButton.gridy = 6;
		registrationPanel.add(candidateRadioButton, gbc_candidateRadioButton);
		
		companyRadioButton = new JRadioButton("Entreprise");
		companyRadioButton.setFont(new Font("Arial", Font.PLAIN, 18));
		companyRadioButton.setOpaque(false);
		companyRadioButton.setRolloverEnabled(false);
		GridBagConstraints gbc_companyRadioButton = new GridBagConstraints();
		gbc_companyRadioButton.anchor = GridBagConstraints.WEST;
		gbc_companyRadioButton.insets = new Insets(0, 0, 5, 5);
		gbc_companyRadioButton.gridx = 2;
		gbc_companyRadioButton.gridy = 6;
		registrationPanel.add(companyRadioButton, gbc_companyRadioButton);
		
		siretLabel = new JLabel("Siret :");
		siretLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		siretLabel.setVisible(false);
		GridBagConstraints gbc_siretLabel = new GridBagConstraints();
		gbc_siretLabel.anchor = GridBagConstraints.EAST;
		gbc_siretLabel.insets = new Insets(0, 0, 5, 5);
		gbc_siretLabel.gridx = 1;
		gbc_siretLabel.gridy = 7;
		registrationPanel.add(siretLabel, gbc_siretLabel);
		
		siretText = new JTextField();
		siretText.setFont(new Font("Arial", Font.PLAIN, 18));
		siretText.setVisible(false);
		GridBagConstraints gbc_siretText = new GridBagConstraints();
		gbc_siretText.insets = new Insets(0, 0, 5, 5);
		gbc_siretText.fill = GridBagConstraints.HORIZONTAL;
		gbc_siretText.gridx = 2;
		gbc_siretText.gridy = 7;
		registrationPanel.add(siretText, gbc_siretText);
		siretText.setColumns(10);
		
		btnRegistration = new JButton();
		GridBagConstraints gbc_btnRegistration = new GridBagConstraints();
		gbc_btnRegistration.gridwidth = 3;
		gbc_btnRegistration.gridx = 0;
		gbc_btnRegistration.gridy = 10;
		panelBlock.add(btnRegistration, gbc_btnRegistration);
		btnRegistration.setIcon(new ImageIcon("Pictures/registrationButton.png"));
		btnRegistration.setBorder(null);
		btnRegistration.setContentAreaFilled(false);
		btnRegistration.setRolloverEnabled(false);
		btnRegistration.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		group = new ButtonGroup();
		group.add(companyRadioButton);
		group.add(candidateRadioButton);
		
	
	}

}
