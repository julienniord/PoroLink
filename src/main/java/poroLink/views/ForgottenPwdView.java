package poroLink.views;

import javax.swing.JFrame;
import javax.swing.JPanel;

import poroLink.utils.views.ViewUtils;

import java.awt.GridBagLayout;
import javax.swing.JTextArea;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;

public class ForgottenPwdView extends BaseView {


	private JTextArea indicationsTextArea;
	private JPanel returnPwdPanel;
	private JLabel mailLabel;
	private JTextField mailText;
	private JButton btnValidate;
	private JLabel failLabel;
	private JPanel panel;
	private JPanel panelBlock;

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public JTextArea getIndicationsTextArea() {
		return indicationsTextArea;
	}

	public void setIndicationsTextArea(JTextArea indicationsTextArea) {
		this.indicationsTextArea = indicationsTextArea;
	}

	public JPanel getReturnPwdPanel() {
		return returnPwdPanel;
	}

	public void setReturnPwdPanel(JPanel returnPwdPanel) {
		this.returnPwdPanel = returnPwdPanel;
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

	public JButton getBtnValidate() {
		return btnValidate;
	}

	public void setBtnValidate(JButton btnValidate) {
		this.btnValidate = btnValidate;
	}

	public JLabel getFailLabel() {
		return failLabel;
	}

	public void setFailLabel(JLabel failLabel) {
		this.failLabel = failLabel;
	}

	/**
	 * Create the frame.
	 */
	public ForgottenPwdView(JFrame frame) {
		
		super.pageName = "Mot passe oublié";
		JPanel panel = new JPanel();
		super.contentPane = panel;
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, 1.0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0};
		gbl_contentPane.columnWidths = new int[]{0, 30, 0};
		gbl_contentPane.rowHeights = new int[]{0, 30, 0};
		panel.setLayout(gbl_contentPane);
		
		panelBlock = new JPanel();
		panelBlock.setOpaque(false);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 1;
		panel.add(panelBlock, gbc_panel);
		GridBagLayout gbl_panelBlock = new GridBagLayout();
		gbl_panelBlock.columnWidths = new int[]{0, 30, 0};
		gbl_panelBlock.rowHeights = new int[]{30, 30, 82, 30, 30, 30};
		gbl_panelBlock.columnWeights = new double[]{1.0, 1.0, 1.0};
		gbl_panelBlock.rowWeights = new double[]{1.0, 0.0, 1.0, 1.0, 1.0, 1.0};
		panelBlock.setLayout(gbl_panelBlock);
		
		indicationsTextArea = new JTextArea();
		GridBagConstraints gbc_indicationsTextArea = new GridBagConstraints();
		gbc_indicationsTextArea.fill = GridBagConstraints.VERTICAL;
		gbc_indicationsTextArea.insets = new Insets(0, 0, 5, 5);
		gbc_indicationsTextArea.gridx = 1;
		gbc_indicationsTextArea.gridy = 0;
		panelBlock.add(indicationsTextArea, gbc_indicationsTextArea);
		indicationsTextArea.setForeground(new java.awt.Color(245, 243, 245));
		indicationsTextArea.setOpaque(false);
		indicationsTextArea.setFont(new Font("Arial", Font.PLAIN, 18));
		indicationsTextArea.setText("Veuillez renseigner votre adresse mail,\r\nun nouveau mot de passe vous sera envoy\u00E9.");
		
		returnPwdPanel = new JPanel();
		GridBagConstraints gbc_returnPwdPanel = new GridBagConstraints();
		gbc_returnPwdPanel.fill = GridBagConstraints.BOTH;
		gbc_returnPwdPanel.insets = new Insets(0, 0, 5, 5);
		gbc_returnPwdPanel.gridx = 1;
		gbc_returnPwdPanel.gridy = 2;
		panelBlock.add(returnPwdPanel, gbc_returnPwdPanel);
		returnPwdPanel.setBackground(new java.awt.Color(245, 243, 245, 150));
		GridBagLayout gbl_returnPwdPanel = new GridBagLayout();
		gbl_returnPwdPanel.columnWidths = new int[]{30, 30, 129, 30};
		gbl_returnPwdPanel.rowHeights = new int[]{30, 30, 30};
		gbl_returnPwdPanel.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0};
		gbl_returnPwdPanel.rowWeights = new double[]{1.0, 1.0, 1.0};
		returnPwdPanel.setLayout(gbl_returnPwdPanel);
		
		failLabel = new JLabel("Cette adresse mail est inconnue !");
		GridBagConstraints gbc_failLabel = new GridBagConstraints();
		gbc_failLabel.gridwidth = 4;
		gbc_failLabel.insets = new Insets(0, 0, 5, 0);
		gbc_failLabel.gridx = 0;
		gbc_failLabel.gridy = 0;
		returnPwdPanel.add(failLabel, gbc_failLabel);
		failLabel.setForeground(Color.RED);
		failLabel.setVisible(false);
		failLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		
		mailLabel = new JLabel("Adresse mail :");
		mailLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		GridBagConstraints gbc_mailLabel = new GridBagConstraints();
		gbc_mailLabel.anchor = GridBagConstraints.EAST;
		gbc_mailLabel.insets = new Insets(0, 0, 5, 5);
		gbc_mailLabel.gridx = 1;
		gbc_mailLabel.gridy = 1;
		returnPwdPanel.add(mailLabel, gbc_mailLabel);
		
		mailText = new JTextField();
		mailText.setFont(new Font("Arial", Font.PLAIN, 18));
		GridBagConstraints gbc_mailText = new GridBagConstraints();
		gbc_mailText.insets = new Insets(0, 0, 5, 5);
		gbc_mailText.fill = GridBagConstraints.HORIZONTAL;
		gbc_mailText.gridx = 2;
		gbc_mailText.gridy = 1;
		returnPwdPanel.add(mailText, gbc_mailText);
		mailText.setColumns(10);
		
		btnValidate = new JButton("Valider");
		GridBagConstraints gbc_btnValidate = new GridBagConstraints();
		gbc_btnValidate.insets = new Insets(0, 0, 5, 5);
		gbc_btnValidate.gridx = 1;
		gbc_btnValidate.gridy = 3;
		panelBlock.add(btnValidate, gbc_btnValidate);
	}

}
