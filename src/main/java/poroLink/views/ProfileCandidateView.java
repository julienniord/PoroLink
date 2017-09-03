package poroLink.views;


import java.awt.EventQueue;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JMenuBar;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Point;
import java.awt.Insets;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Rectangle;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Dimension;
import javax.swing.border.LineBorder;



import java.awt.Panel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;

public class ProfileCandidateView extends BaseView{
	private JTextField textFieldName;
	private JTextField textFieldLinkWebSite;
	private JTextField textFieldPhone;
	private JTextField textFieldAddress;
	private JTextField textFieldLinkLinkedin;
	private JButton editSkillList;
	private JButton editTxtCertificates;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_1;
	private JPanel panel_1;
	private JPanel panelBlock;
	private JTextArea txtrDescription;
	private JButton editTxtAddress;
	private JButton editTxtLinkLinkedin;
	private JButton editTxtPhone;
	private JButton edittxtLinkWebSite;
	private JButton editTxtName;
	private JPanel panel_2;
	private JLabel lblNewLabel;
	private JPanel panel_3;
	private JTextField txtCertificatesInProgress;
	private JTable tableCertificates;
	private JTable tableSkill;
	private JButton editDescription;
	private JLabel lblListeDesComptences;
	private JLabel lblNiveau;

	/**
	 * @return the contentPane
	 */
	public JPanel getContentPane() {
		return contentPane;
	}


	/**
	 * @param contentPane the contentPane to set
	 */
	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}


	/**
	 * @return the textField
	 */
	public JTextField getTextField() {
		return textFieldName;
	}


	/**
	 * @param textField the textField to set
	 */
	public void setTextField(JTextField textField) {
		this.textFieldName = textField;
	}


	/**
	 * @return the textField_1
	 */
	public JTextField getTextField_1() {
		return textFieldLinkWebSite;
	}


	/**
	 * @param textField_1 the textField_1 to set
	 */
	public void setTextField_1(JTextField textField_1) {
		this.textFieldLinkWebSite = textField_1;
	}


	/**
	 * @return the textField_2
	 */
	public JTextField getTextField_2() {
		return textFieldPhone;
	}


	/**
	 * @param textField_2 the textField_2 to set
	 */
	public void setTextField_2(JTextField textField_2) {
		this.textFieldPhone = textField_2;
	}


	/**
	 * @return the textField_3
	 */
	public JTextField getTextField_3() {
		return textFieldAddress;
	}


	/**
	 * @param textField_3 the textField_3 to set
	 */
	public void setTextField_3(JTextField textField_3) {
		this.textFieldAddress = textField_3;
	}


	/**
	 * @return the textField_4
	 */
	public JTextField getTextField_4() {
		return textFieldLinkLinkedin;
	}


	/**
	 * @param textField_4 the textField_4 to set
	 */
	public void setTextField_4(JTextField textField_4) {
		this.textFieldLinkLinkedin = textField_4;
	}


	public ProfileCandidateView(JFrame frame) {
		super.pageName = "Candidats";
		JPanel panel = new JPanel();
		super.contentPane = panel;
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{20, 262, 157, 105, 36, 46, 20, 0};
		gbl_contentPane.rowHeights = new int[]{152, 49, 101, 56, 56, 112, 50, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_contentPane);
		
		panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridwidth = 7;
		gbc_panel_3.insets = new Insets(0, 0, 5, 0);
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 0;
		panel.add(panel_3, gbc_panel_3);
		panel_3.setBackground(new Color(245, 243, 245, 150));
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{32, 205, 67, 38, 36, 42, 198, 11, 0};
		gbl_panel_3.rowHeights = new int[]{80, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		lblNewLabel = new JLabel("");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		panel_3.add(lblNewLabel, gbc_lblNewLabel);
		lblNewLabel.setBorder(new LineBorder(new Color(51, 102, 153), 1, true));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Minet\\Downloads\\20864450_10214162450926257_2019830956_n.png"));
		
		panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridwidth = 6;
		gbc_panel_2.insets = new Insets(0, 0, 0, 5);
		gbc_panel_2.gridx = 1;
		gbc_panel_2.gridy = 0;
		panel_3.add(panel_2, gbc_panel_2);
		panel_2.setBackground(new Color(245, 243, 245, 150));
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{139, 100, 27, 62, 137, 0};
		gbl_panel_2.rowHeights = new int[]{34, 26, 29, 21, 41, 0};
		gbl_panel_2.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		textFieldName = new JTextField();
		textFieldName.setEditable(false);
		textFieldName.setText("Nom Entreprise");
		textFieldName.setForeground(Color.BLACK);
		textFieldName.setColumns(10);
		textFieldName.setBackground(Color.WHITE);
		GridBagConstraints gbc_textFieldName = new GridBagConstraints();
		gbc_textFieldName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldName.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldName.gridx = 0;
		gbc_textFieldName.gridy = 0;
		panel_2.add(textFieldName, gbc_textFieldName);
		
		editTxtName = new JButton("Modifier");
		editTxtName.setForeground(Color.WHITE);
		editTxtName.setBackground(new Color(87, 108, 168));
		GridBagConstraints gbc_editTxtName = new GridBagConstraints();
		gbc_editTxtName.insets = new Insets(0, 0, 5, 5);
		gbc_editTxtName.gridx = 1;
		gbc_editTxtName.gridy = 0;
		panel_2.add(editTxtName, gbc_editTxtName);
		
		edittxtLinkWebSite = new JButton("Modifier");
		edittxtLinkWebSite.setForeground(Color.WHITE);
		edittxtLinkWebSite.setBackground(new Color(87, 108, 168));
		GridBagConstraints gbc_edittxtLinkWebSite = new GridBagConstraints();
		gbc_edittxtLinkWebSite.insets = new Insets(0, 0, 5, 5);
		gbc_edittxtLinkWebSite.gridx = 3;
		gbc_edittxtLinkWebSite.gridy = 0;
		panel_2.add(edittxtLinkWebSite, gbc_edittxtLinkWebSite);
		
		textFieldLinkWebSite = new JTextField();
		textFieldLinkWebSite.setEditable(false);
		textFieldLinkWebSite.setText("Lien site entreprise");
		textFieldLinkWebSite.setForeground(Color.BLACK);
		textFieldLinkWebSite.setColumns(10);
		textFieldLinkWebSite.setBackground(Color.WHITE);
		GridBagConstraints gbc_textFieldLinkWebSite = new GridBagConstraints();
		gbc_textFieldLinkWebSite.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldLinkWebSite.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldLinkWebSite.gridx = 4;
		gbc_textFieldLinkWebSite.gridy = 0;
		panel_2.add(textFieldLinkWebSite, gbc_textFieldLinkWebSite);
		
		textFieldPhone = new JTextField();
		textFieldPhone.setEditable(false);
		textFieldPhone.setText("T\u00E9l\u00E9phone");
		textFieldPhone.setForeground(Color.BLACK);
		textFieldPhone.setColumns(10);
		textFieldPhone.setBackground(Color.WHITE);
		GridBagConstraints gbc_textFieldPhone = new GridBagConstraints();
		gbc_textFieldPhone.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldPhone.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldPhone.gridx = 0;
		gbc_textFieldPhone.gridy = 2;
		panel_2.add(textFieldPhone, gbc_textFieldPhone);
		
		editTxtPhone = new JButton("Modifier");
		editTxtPhone.setForeground(Color.WHITE);
		editTxtPhone.setBackground(new Color(87, 108, 168));
		GridBagConstraints gbc_editTxtPhone = new GridBagConstraints();
		gbc_editTxtPhone.insets = new Insets(0, 0, 5, 5);
		gbc_editTxtPhone.gridx = 1;
		gbc_editTxtPhone.gridy = 2;
		panel_2.add(editTxtPhone, gbc_editTxtPhone);
		
		editTxtLinkLinkedin = new JButton("Modifier");
		editTxtLinkLinkedin.setForeground(Color.WHITE);
		editTxtLinkLinkedin.setBackground(new Color(87, 108, 168));
		GridBagConstraints gbc_editTxtLinkLinkedin = new GridBagConstraints();
		gbc_editTxtLinkLinkedin.insets = new Insets(0, 0, 5, 5);
		gbc_editTxtLinkLinkedin.gridx = 3;
		gbc_editTxtLinkLinkedin.gridy = 2;
		panel_2.add(editTxtLinkLinkedin, gbc_editTxtLinkLinkedin);
		
		textFieldLinkLinkedin = new JTextField();
		textFieldLinkLinkedin.setEditable(false);
		textFieldLinkLinkedin.setText("Lien linkedin");
		textFieldLinkLinkedin.setForeground(Color.BLACK);
		textFieldLinkLinkedin.setColumns(10);
		textFieldLinkLinkedin.setBackground(Color.WHITE);
		GridBagConstraints gbc_textFieldLinkLinkedin = new GridBagConstraints();
		gbc_textFieldLinkLinkedin.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldLinkLinkedin.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldLinkLinkedin.gridx = 4;
		gbc_textFieldLinkLinkedin.gridy = 2;
		panel_2.add(textFieldLinkLinkedin, gbc_textFieldLinkLinkedin);
		
		textFieldAddress = new JTextField();
		textFieldAddress.setEditable(false);
		textFieldAddress.setText("Adresse");
		textFieldAddress.setForeground(Color.BLACK);
		textFieldAddress.setColumns(10);
		textFieldAddress.setBackground(Color.WHITE);
		GridBagConstraints gbc_textFieldAddress = new GridBagConstraints();
		gbc_textFieldAddress.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldAddress.insets = new Insets(0, 0, 0, 5);
		gbc_textFieldAddress.gridx = 0;
		gbc_textFieldAddress.gridy = 4;
		panel_2.add(textFieldAddress, gbc_textFieldAddress);
		
		editTxtAddress = new JButton("Modifier");
		editTxtAddress.setForeground(Color.WHITE);
		editTxtAddress.setBackground(new Color(87, 108, 168));
		GridBagConstraints gbc_editTxtAddress = new GridBagConstraints();
		gbc_editTxtAddress.insets = new Insets(0, 0, 0, 5);
		gbc_editTxtAddress.gridx = 1;
		gbc_editTxtAddress.gridy = 4;
		panel_2.add(editTxtAddress, gbc_editTxtAddress);
		
		editDescription = new JButton("Modifier");
		GridBagConstraints gbc_editDescription = new GridBagConstraints();
		gbc_editDescription.anchor = GridBagConstraints.SOUTHEAST;
		gbc_editDescription.gridwidth = 2;
		gbc_editDescription.insets = new Insets(0, 0, 5, 5);
		editDescription.setBackground(new Color(87, 108, 168));
		gbc_editDescription.gridx = 4;
		gbc_editDescription.gridy = 1;
		panel.add(editDescription, gbc_editDescription);
		
		txtrDescription = new JTextArea();
		txtrDescription.setEditable(false);
		txtrDescription.setBorder(new LineBorder(new Color(51, 102, 153), 1, true));
		txtrDescription.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtrDescription.setText("Description");
		GridBagConstraints gbc_txtrDescription = new GridBagConstraints();
		gbc_txtrDescription.gridheight = 2;
		gbc_txtrDescription.gridwidth = 5;
		gbc_txtrDescription.insets = new Insets(0, 0, 5, 5);
		gbc_txtrDescription.fill = GridBagConstraints.BOTH;
		gbc_txtrDescription.gridx = 1;
		gbc_txtrDescription.gridy = 2;
		panel.add(txtrDescription, gbc_txtrDescription);
		
		panelBlock = new JPanel();
		panelBlock.setBorder(new LineBorder(new Color(51, 102, 153), 1, true));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridheight = 2;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 5;
		panel.add(panelBlock, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {204, 88, 0};
		gbl_panel.rowHeights = new int[] {3, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		panelBlock.setLayout(gbl_panel);
		
		lblListeDesComptences = new JLabel("Liste des comp\u00E9tences");
		GridBagConstraints gbc_lblListeDesComptences = new GridBagConstraints();
		gbc_lblListeDesComptences.anchor = GridBagConstraints.WEST;
		gbc_lblListeDesComptences.insets = new Insets(0, 0, 5, 5);
		gbc_lblListeDesComptences.gridx = 0;
		gbc_lblListeDesComptences.gridy = 0;
		panelBlock.add(lblListeDesComptences, gbc_lblListeDesComptences);
		
		lblNiveau = new JLabel("Niveau");
		GridBagConstraints gbc_lblNiveau = new GridBagConstraints();
		gbc_lblNiveau.anchor = GridBagConstraints.WEST;
		gbc_lblNiveau.insets = new Insets(0, 0, 5, 0);
		gbc_lblNiveau.gridx = 1;
		gbc_lblNiveau.gridy = 0;
		panelBlock.add(lblNiveau, gbc_lblNiveau);
		
		tableSkill = new JTable();
		tableSkill.setEnabled(false);
		GridBagConstraints gbc_tableSkill = new GridBagConstraints();
		gbc_tableSkill.gridwidth = 2;
		gbc_tableSkill.fill = GridBagConstraints.BOTH;
		gbc_tableSkill.gridx = 0;
		gbc_tableSkill.gridy = 1;
		panelBlock.add(tableSkill, gbc_tableSkill);
		
		editSkillList = new JButton("Modifier");
		GridBagConstraints gbc_editSkillList = new GridBagConstraints();
		gbc_editSkillList.anchor = GridBagConstraints.NORTHWEST;
		editSkillList.setBackground(new Color(87, 108, 168));
		gbc_editSkillList.insets = new Insets(0, 0, 5, 5);
		gbc_editSkillList.gridx = 2;
		gbc_editSkillList.gridy = 5;
		panel.add(editSkillList, gbc_editSkillList);
		
		panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridwidth = 3;
		gbc_panel_1.insets = new Insets(0, 0, 0, 5);
		gbc_panel_1.gridheight = 2;
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 3;
		gbc_panel_1.gridy = 5;
		panel.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{125, 140, 0};
		gbl_panel_1.rowHeights = new int[]{33, 36, 19, 55, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		lblNewLabel_1 = new JLabel("Dipl\u00F4me en cours");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 0;
		panel_1.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		editTxtCertificates = new JButton("Modifier");
		editTxtCertificates.setForeground(Color.WHITE);
		editTxtCertificates.setBackground(new Color(87, 108, 168));
		GridBagConstraints gbc_editTxtCertificates = new GridBagConstraints();
		gbc_editTxtCertificates.anchor = GridBagConstraints.EAST;
		gbc_editTxtCertificates.insets = new Insets(0, 0, 5, 0);
		gbc_editTxtCertificates.gridx = 1;
		gbc_editTxtCertificates.gridy = 0;
		panel_1.add(editTxtCertificates, gbc_editTxtCertificates);
		
		txtCertificatesInProgress = new JTextField();
		txtCertificatesInProgress.setEditable(false);
		txtCertificatesInProgress.setMargin(new Insets(0, 0, 0, 0));
		GridBagConstraints gbc_txtCertificatesInProgress = new GridBagConstraints();
		gbc_txtCertificatesInProgress.gridwidth = 2;
		gbc_txtCertificatesInProgress.insets = new Insets(0, 0, 5, 0);
		gbc_txtCertificatesInProgress.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCertificatesInProgress.gridx = 0;
		gbc_txtCertificatesInProgress.gridy = 1;
		panel_1.add(txtCertificatesInProgress, gbc_txtCertificatesInProgress);
		txtCertificatesInProgress.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Dipl\u00F4mes");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		panel_1.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		tableCertificates = new JTable();
		tableCertificates.setEnabled(false);
		GridBagConstraints gbc_tableCertificates = new GridBagConstraints();
		gbc_tableCertificates.gridwidth = 2;
		gbc_tableCertificates.insets = new Insets(0, 0, 0, 5);
		gbc_tableCertificates.fill = GridBagConstraints.BOTH;
		gbc_tableCertificates.gridx = 0;
		gbc_tableCertificates.gridy = 3;
		panel_1.add(tableCertificates, gbc_tableCertificates);
	}


	/**
	 * @return the textFieldName
	 */
	public JTextField getTextFieldName() {
		return textFieldName;
	}


	/**
	 * @param textFieldName the textFieldName to set
	 */
	public void setTextFieldName(JTextField textFieldName) {
		this.textFieldName = textFieldName;
	}


	/**
	 * @return the textFieldLinkWebSite
	 */
	public JTextField getTextFieldLinkWebSite() {
		return textFieldLinkWebSite;
	}


	/**
	 * @param textFieldLinkWebSite the textFieldLinkWebSite to set
	 */
	public void setTextFieldLinkWebSite(JTextField textFieldLinkWebSite) {
		this.textFieldLinkWebSite = textFieldLinkWebSite;
	}


	/**
	 * @return the textFieldPhone
	 */
	public JTextField getTextFieldPhone() {
		return textFieldPhone;
	}


	/**
	 * @param textFieldPhone the textFieldPhone to set
	 */
	public void setTextFieldPhone(JTextField textFieldPhone) {
		this.textFieldPhone = textFieldPhone;
	}


	/**
	 * @return the textFieldAddress
	 */
	public JTextField getTextFieldAddress() {
		return textFieldAddress;
	}


	/**
	 * @param textFieldAddress the textFieldAddress to set
	 */
	public void setTextFieldAddress(JTextField textFieldAddress) {
		this.textFieldAddress = textFieldAddress;
	}


	/**
	 * @return the textFieldLinkLinkedin
	 */
	public JTextField getTextFieldLinkLinkedin() {
		return textFieldLinkLinkedin;
	}


	/**
	 * @param textFieldLinkLinkedin the textFieldLinkLinkedin to set
	 */
	public void setTextFieldLinkLinkedin(JTextField textFieldLinkLinkedin) {
		this.textFieldLinkLinkedin = textFieldLinkLinkedin;
	}


	/**
	 * @return the editSkillList
	 */
	public JButton getEditSkillList() {
		return editSkillList;
	}


	/**
	 * @param editSkillList the editSkillList to set
	 */
	public void setEditSkillList(JButton editSkillList) {
		this.editSkillList = editSkillList;
	}


	/**
	 * @return the editTxtCertificates
	 */
	public JButton getEditTxtCertificates() {
		return editTxtCertificates;
	}


	/**
	 * @param editTxtCertificates the editTxtCertificates to set
	 */
	public void setEditTxtCertificates(JButton editTxtCertificates) {
		this.editTxtCertificates = editTxtCertificates;
	}


	/**
	 * @return the txtrDescription
	 */
	public JTextArea getTxtrDescription() {
		return txtrDescription;
	}


	/**
	 * @param txtrDescription the txtrDescription to set
	 */
	public void setTxtrDescription(JTextArea txtrDescription) {
		this.txtrDescription = txtrDescription;
	}


	/**
	 * @return the editTxtAddress
	 */
	public JButton getEditTxtAddress() {
		return editTxtAddress;
	}


	/**
	 * @param editTxtAddress the editTxtAddress to set
	 */
	public void setEditTxtAddress(JButton editTxtAddress) {
		this.editTxtAddress = editTxtAddress;
	}


	/**
	 * @return the editTxtLinkLinkedin
	 */
	public JButton getEditTxtLinkLinkedin() {
		return editTxtLinkLinkedin;
	}


	/**
	 * @param editTxtLinkLinkedin the editTxtLinkLinkedin to set
	 */
	public void setEditTxtLinkLinkedin(JButton editTxtLinkLinkedin) {
		this.editTxtLinkLinkedin = editTxtLinkLinkedin;
	}


	/**
	 * @return the editTxtPhone
	 */
	public JButton getEditTxtPhone() {
		return editTxtPhone;
	}


	/**
	 * @param editTxtPhone the editTxtPhone to set
	 */
	public void setEditTxtPhone(JButton editTxtPhone) {
		this.editTxtPhone = editTxtPhone;
	}


	/**
	 * @return the edittxtLinkWebSite
	 */
	public JButton getEdittxtLinkWebSite() {
		return edittxtLinkWebSite;
	}


	/**
	 * @param edittxtLinkWebSite the edittxtLinkWebSite to set
	 */
	public void setEdittxtLinkWebSite(JButton edittxtLinkWebSite) {
		this.edittxtLinkWebSite = edittxtLinkWebSite;
	}


	/**
	 * @return the editTxtName
	 */
	public JButton getEditTxtName() {
		return editTxtName;
	}


	/**
	 * @param editTxtName the editTxtName to set
	 */
	public void setEditTxtName(JButton editTxtName) {
		this.editTxtName = editTxtName;
	}


	/**
	 * @return the txtCertificatesInProgress
	 */
	public JTextField getTxtCertificatesInProgress() {
		return txtCertificatesInProgress;
	}


	/**
	 * @param txtCertificatesInProgress the txtCertificatesInProgress to set
	 */
	public void setTxtCertificatesInProgress(JTextField txtCertificatesInProgress) {
		this.txtCertificatesInProgress = txtCertificatesInProgress;
	}


	/**
	 * @return the tableCertificates
	 */
	public JTable getTableCertificates() {
		return tableCertificates;
	}


	/**
	 * @param tableCertificates the tableCertificates to set
	 */
	public void setTableCertificates(JTable tableCertificates) {
		this.tableCertificates = tableCertificates;
	}


	/**
	 * @return the tableSkill
	 */
	public JTable getTableSkill() {
		return tableSkill;
	}


	/**
	 * @param tableSkill the tableSkill to set
	 */
	public void setTableSkill(JTable tableSkill) {
		this.tableSkill = tableSkill;
	}


	/**
	 * @return the editDescription
	 */
	public JButton getEditDescription() {
		return editDescription;
	}


	/**
	 * @param editDescription the editDescription to set
	 */
	public void setEditDescription(JButton editDescription) {
		this.editDescription = editDescription;
	}

}
