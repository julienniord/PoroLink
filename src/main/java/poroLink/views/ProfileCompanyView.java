package poroLink.views;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import poroLink.entities.Post;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import poroLink.views.usercontrols.MenuBar;


public class ProfileCompanyView extends BaseView {

	private JTextField txtNomEntreprise;
	private JTextField txtTlphone;
	private JTextField txtAddress;
	private JTextField txtLienSiteEntreprise;
	private JTextField txtLienLinkedin;
	private JTextArea txtrDescription;
	private JLabel lblNewLabel;
	private JPanel panel_1;
	private JTextArea txtDescriptionPost;
	private JComboBox<Post> comboBox;
	private JLabel lblDescritpionDuPoste;
	private JLabel lblListeDeComptence;
	private JButton editLinkWebSite;
	private JButton editLinkedinLink;
	private JButton editName;
	private JButton editPhone;
	private JButton editAddress;
	private JButton editPost;
	private JButton editDescription;
	private JButton editSkillList;
	private JScrollPane scrollPane_1;
	private JScrollPane scrollPane_2;
	private JLabel label;
	private JScrollPane scrollPane_3;
	private JPanel panelBlock;
	private JPanel panel_2;
	private JTextArea txtRecruteurCoordonnee;
	private JPanel panel_3;
	private JTable table;
	private MenuBar menuBar;

	/**
	 * @return the contentPane
	 */
	public JPanel getContentPane() {
		return contentPane;
	}

	/**
	 * @param contentPane
	 *            the contentPane to set
	 */
	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	/**
	 * @return the txtNomEntreprise
	 */
	public JTextField getTxtNomEntreprise() {
		return txtNomEntreprise;
	}

	/**
	 * @param txtNomEntreprise
	 *            the txtNomEntreprise to set
	 */
	public void setTxtNomEntreprise(JTextField txtNomEntreprise) {
		this.txtNomEntreprise = txtNomEntreprise;
	}

	/**
	 * @return the txtTlphone
	 */
	public JTextField getTxtTlphone() {
		return txtTlphone;
	}

	/**
	 * @param txtTlphone
	 *            the txtTlphone to set
	 */
	public void setTxtTlphone(JTextField txtTlphone) {
		this.txtTlphone = txtTlphone;
	}

	/**
	 * @return the txtAddress
	 */
	public JTextField getTxtAddress() {
		return txtAddress;
	}

	/**
	 * @param txtAddress
	 *            the txtAddress to set
	 */
	public void setTxtAddress(JTextField txtAddress) {
		this.txtAddress = txtAddress;
	}

	/**
	 * @return the txtLienSiteEntreprise
	 */
	public JTextField getTxtLienSiteEntreprise() {
		return txtLienSiteEntreprise;
	}

	/**
	 * @param txtLienSiteEntreprise
	 *            the txtLienSiteEntreprise to set
	 */
	public void setTxtLienSiteEntreprise(JTextField txtLienSiteEntreprise) {
		this.txtLienSiteEntreprise = txtLienSiteEntreprise;
	}

	/**
	 * @return the txtLienLinkedin
	 */
	public JTextField getTxtLienLinkedin() {
		return txtLienLinkedin;
	}

	/**
	 * @param txtLienLinkedin
	 *            the txtLienLinkedin to set
	 */
	public void setTxtLienLinkedin(JTextField txtLienLinkedin) {
		this.txtLienLinkedin = txtLienLinkedin;
	}

	/**
	 * @return the txtrDescription
	 */
	public JTextArea getTxtrDescription() {
		return txtrDescription;
	}

	/**
	 * @param txtrDescription
	 *            the txtrDescription to set
	 */
	public void setTxtrDescription(JTextArea txtrDescription) {
		this.txtrDescription = txtrDescription;
	}

	/**
	 * @return the lblNewLabel
	 */
	public JLabel getLblNewLabel() {
		return lblNewLabel;
	}

	/**
	 * @param lblNewLabel
	 *            the lblNewLabel to set
	 */
	public void setLblNewLabel(JLabel lblNewLabel) {
		this.lblNewLabel = lblNewLabel;
	}

	/**
	 * @return the panel_1
	 */
	public JPanel getPanel_1() {
		return panel_1;
	}

	/**
	 * @param panel_1
	 *            the panel_1 to set
	 */
	public void setPanel_1(JPanel panel_1) {
		this.panel_1 = panel_1;
	}

	/**
	 * @return the list
	 */

	/**
	 * @return the txtDescriptionPost
	 */
	public JTextArea getTxtDescriptionPost() {
		return txtDescriptionPost;
	}

	/**
	 * @param txtDescriptionPost
	 *            the txtDescriptionPost to set
	 */
	public void setTxtDescriptionPost(JTextArea txtDescriptionPost) {
		this.txtDescriptionPost = txtDescriptionPost;
	}

	/**
	 * @return the comboBox
	 */
	public JComboBox<Post> getComboBox() {
		return comboBox;
	}

	/**
	 * @param comboBox
	 *            the comboBox to set
	 */
	public void setComboBox(JComboBox<Post> comboBox) {
		this.comboBox = comboBox;
	}

	/**
	 * @return the lblDescritpionDuPoste
	 */
	public JLabel getLblDescritpionDuPoste() {
		return lblDescritpionDuPoste;
	}

	/**
	 * @param lblDescritpionDuPoste
	 *            the lblDescritpionDuPoste to set
	 */
	public void setLblDescritpionDuPoste(JLabel lblDescritpionDuPoste) {
		this.lblDescritpionDuPoste = lblDescritpionDuPoste;
	}

	/**
	 * @return the list_1
	 */

	/**
	 * @return the lblListeDeComptence
	 */
	public JLabel getLblListeDeComptence() {
		return lblListeDeComptence;
	}

	/**
	 * @param lblListeDeComptence
	 *            the lblListeDeComptence to set
	 */
	public void setLblListeDeComptence(JLabel lblListeDeComptence) {
		this.lblListeDeComptence = lblListeDeComptence;
	}

	/**
	 * @return the editLinkWebSite
	 */
	public JButton getEditLinkWebSite() {
		return editLinkWebSite;
	}

	/**
	 * @param editLinkWebSite
	 *            the editLinkWebSite to set
	 */
	public void setEditLinkWebSite(JButton editLinkWebSite) {
		this.editLinkWebSite = editLinkWebSite;
	}

	/**
	 * @return the editLinkedinLink
	 */
	public JButton getEditLinkedinLink() {
		return editLinkedinLink;
	}

	/**
	 * @param editLinkedinLink
	 *            the editLinkedinLink to set
	 */
	public void setEditLinkedinLink(JButton editLinkedinLink) {
		this.editLinkedinLink = editLinkedinLink;
	}

	/**
	 * @return the editName
	 */
	public JButton getEditName() {
		return editName;
	}

	/**
	 * @param editName
	 *            the editName to set
	 */
	public void setEditName(JButton editName) {
		this.editName = editName;
	}

	/**
	 * @return the editPhone
	 */
	public JButton getEditPhone() {
		return editPhone;
	}

	/**
	 * @param editPhone
	 *            the editPhone to set
	 */
	public void setEditPhone(JButton editPhone) {
		this.editPhone = editPhone;
	}

	/**
	 * @return the editAddress
	 */
	public JButton getEditAddress() {
		return editAddress;
	}

	/**
	 * @param editAddress
	 *            the editAddress to set
	 */
	public void setEditAddress(JButton editAddress) {
		this.editAddress = editAddress;
	}

	/**
	 * @return the editList
	 */
	public JButton getEditPost() {
		return editPost;
	}

	/**
	 * @param editList
	 *            the editList to set
	 */
	public void setEditPost(JButton editPost) {
		this.editPost = editPost;
	}

	/**
	 * @return the editDescription
	 */
	public JButton getEditDescription() {
		return editDescription;
	}

	/**
	 * @param editDescription
	 *            the editDescription to set
	 */
	public void setEditDescription(JButton editDescription) {
		this.editDescription = editDescription;
	}

	/**
	 * @return the editSkillList
	 */
	public JButton getEditSkillList() {
		return editSkillList;
	}

	/**
	 * @param editSkillList
	 *            the editSkillList to set
	 */
	public void setEditSkillList(JButton editSkillList) {
		this.editSkillList = editSkillList;
	}

	/**
	 * @return the txtrHfghgjPghjZpjfpzjf
	 */
	public JTextArea getTxtRecruteurCoordonnee() {
		return txtRecruteurCoordonnee;
	}

	/**
	 * 
	 * @param txtRecruteurCoordonnee
	 */
	public void setTxtRecruteurCoordonnee(JTextArea txtRecruteurCoordonnee) {
		this.txtRecruteurCoordonnee = txtRecruteurCoordonnee;
	}

	/**
	 * 
	 * @return table
	 */
	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
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
	public ProfileCompanyView(JFrame frame) {

		super.pageName = "Entreprise";
		JPanel panel = new JPanel();
		super.contentPane = panel;

		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 91, 83, 158, 265, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 50, 291, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE };
		panel.setLayout(gbl_contentPane);
		;
		
		menuBar = new MenuBar();
		GridBagConstraints gbc_menuBar = new GridBagConstraints();
		gbc_menuBar.fill = GridBagConstraints.HORIZONTAL;
		gbc_menuBar.gridx = 0;
		gbc_menuBar.gridy = 0;
		gbc_menuBar.gridwidth = 10;
		panel.add(menuBar.getContentPane(), gbc_menuBar);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(null);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		lblNewLabel.setIcon(new ImageIcon("Pictures/logoImie.png"));
		panel.add(lblNewLabel, gbc_lblNewLabel);

		panelBlock = new JPanel();
		panelBlock.setBackground(new java.awt.Color(245, 243, 245, 150));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 2;
		gbc_panel.gridy = 1;
		panel.add(panelBlock, gbc_panel);
		GridBagLayout gbl_panelBlock = new GridBagLayout();
		gbl_panelBlock.columnWidths = new int[]{178, 71, 94, 71, 225, 0};
		gbl_panelBlock.rowHeights = new int[]{43, 55, 42, 0};
		gbl_panelBlock.columnWeights = new double[]{1.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelBlock.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		panelBlock.setLayout(gbl_panelBlock);
						
								txtNomEntreprise = new JTextField();
								txtNomEntreprise.setForeground(Color.BLACK);
								txtNomEntreprise.setBackground(Color.WHITE);
								txtNomEntreprise.setEditable(false);
								txtNomEntreprise.setText("Nom Entreprise");
								GridBagConstraints gbc_txtNomEntreprise = new GridBagConstraints();
								gbc_txtNomEntreprise.fill = GridBagConstraints.HORIZONTAL;
								gbc_txtNomEntreprise.insets = new Insets(0, 0, 5, 5);
								gbc_txtNomEntreprise.gridx = 0;
								gbc_txtNomEntreprise.gridy = 0;
								panelBlock.add(txtNomEntreprise, gbc_txtNomEntreprise);
								txtNomEntreprise.setColumns(10);
				
						editName = new JButton("Modifier");
						editName.setForeground(Color.WHITE);
						editName.setBackground(new Color(87, 108, 168));
						GridBagConstraints gbc_editName = new GridBagConstraints();
						gbc_editName.insets = new Insets(0, 0, 5, 5);
						gbc_editName.gridx = 1;
						gbc_editName.gridy = 0;
						panelBlock.add(editName, gbc_editName);
				
						editLinkWebSite = new JButton("Modifier");
						editLinkWebSite.setForeground(Color.WHITE);
						editLinkWebSite.setBackground(new Color(87, 108, 168));
						GridBagConstraints gbc_editLinkWebSite = new GridBagConstraints();
						gbc_editLinkWebSite.insets = new Insets(0, 0, 5, 5);
						gbc_editLinkWebSite.gridx = 3;
						gbc_editLinkWebSite.gridy = 0;
						panelBlock.add(editLinkWebSite, gbc_editLinkWebSite);
				
						txtLienSiteEntreprise = new JTextField();
						txtLienSiteEntreprise.setForeground(Color.BLACK);
						txtLienSiteEntreprise.setBackground(Color.WHITE);
						txtLienSiteEntreprise.setEditable(false);
						txtLienSiteEntreprise.setText("Lien site entreprise");
						GridBagConstraints gbc_txtLienSiteEntreprise = new GridBagConstraints();
						gbc_txtLienSiteEntreprise.fill = GridBagConstraints.HORIZONTAL;
						gbc_txtLienSiteEntreprise.insets = new Insets(0, 0, 5, 0);
						gbc_txtLienSiteEntreprise.gridx = 4;
						gbc_txtLienSiteEntreprise.gridy = 0;
						panelBlock.add(txtLienSiteEntreprise, gbc_txtLienSiteEntreprise);
						txtLienSiteEntreprise.setColumns(10);
		
				txtTlphone = new JTextField();
				txtTlphone.setForeground(Color.BLACK);
				txtTlphone.setBackground(Color.WHITE);
				txtTlphone.setEditable(false);
				txtTlphone.setText("T\u00E9l\u00E9phone");
				GridBagConstraints gbc_txtTlphone = new GridBagConstraints();
				gbc_txtTlphone.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtTlphone.insets = new Insets(0, 0, 5, 5);
				gbc_txtTlphone.gridx = 0;
				gbc_txtTlphone.gridy = 1;
				panelBlock.add(txtTlphone, gbc_txtTlphone);
				txtTlphone.setColumns(10);
						
								editPhone = new JButton("Modifier");
								editPhone.setForeground(Color.WHITE);
								editPhone.setBackground(new Color(87, 108, 168));
								GridBagConstraints gbc_editPhone = new GridBagConstraints();
								gbc_editPhone.insets = new Insets(0, 0, 5, 5);
								gbc_editPhone.gridx = 1;
								gbc_editPhone.gridy = 1;
								panelBlock.add(editPhone, gbc_editPhone);
				
						txtAddress = new JTextField();
						txtAddress.setForeground(Color.BLACK);
						txtAddress.setBackground(Color.WHITE);
						txtAddress.setEditable(false);
						txtAddress.setText("Adresse");
						GridBagConstraints gbc_txtAddress = new GridBagConstraints();
						gbc_txtAddress.fill = GridBagConstraints.HORIZONTAL;
						gbc_txtAddress.insets = new Insets(0, 0, 0, 5);
						gbc_txtAddress.gridx = 0;
						gbc_txtAddress.gridy = 2;
						panelBlock.add(txtAddress, gbc_txtAddress);
						txtAddress.setColumns(10);
		
				editAddress = new JButton("Modifier");
				editAddress.setForeground(Color.WHITE);
				editAddress.setBackground(new Color(87, 108, 168));
				GridBagConstraints gbc_editAddress = new GridBagConstraints();
				gbc_editAddress.insets = new Insets(0, 0, 0, 5);
				gbc_editAddress.gridx = 1;
				gbc_editAddress.gridy = 2;
				panelBlock.add(editAddress, gbc_editAddress);
		
				editLinkedinLink = new JButton("Modifier");
				editLinkedinLink.setForeground(Color.WHITE);
				editLinkedinLink.setBackground(new Color(87, 108, 168));
				GridBagConstraints gbc_editLinkedinLink = new GridBagConstraints();
				gbc_editLinkedinLink.insets = new Insets(0, 0, 0, 5);
				gbc_editLinkedinLink.gridx = 3;
				gbc_editLinkedinLink.gridy = 2;
				panelBlock.add(editLinkedinLink, gbc_editLinkedinLink);
		
				txtLienLinkedin = new JTextField();
				txtLienLinkedin.setBackground(Color.WHITE);
				txtLienLinkedin.setForeground(Color.BLACK);
				txtLienLinkedin.setEditable(false);
				txtLienLinkedin.setText("Lien linkedin");
				GridBagConstraints gbc_txtLienLinkedin = new GridBagConstraints();
				gbc_txtLienLinkedin.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtLienLinkedin.gridx = 4;
				gbc_txtLienLinkedin.gridy = 2;
				panelBlock.add(txtLienLinkedin, gbc_txtLienLinkedin);
				txtLienLinkedin.setColumns(10);
		
		panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridwidth = 4;
		gbc_panel_3.insets = new Insets(0, 0, 5, 0);
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 2;
		panel.add(panel_3, gbc_panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{804, 0};
		gbl_panel_3.rowHeights = new int[]{23, 124, 0};
		gbl_panel_3.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
				editDescription = new JButton("Modifier");
				GridBagConstraints gbc_editDescription = new GridBagConstraints();
				gbc_editDescription.anchor = GridBagConstraints.EAST;
				gbc_editDescription.insets = new Insets(0, 0, 5, 0);
				gbc_editDescription.gridx = 0;
				gbc_editDescription.gridy = 0;
				panel_3.add(editDescription, gbc_editDescription);
				editDescription.setForeground(Color.WHITE);
				editDescription.setBackground(new Color(87, 108, 168));
		
				scrollPane_1 = new JScrollPane();
				GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
				gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
				gbc_scrollPane_1.gridx = 0;
				gbc_scrollPane_1.gridy = 1;
				panel_3.add(scrollPane_1, gbc_scrollPane_1);
				
						txtrDescription = new JTextArea();
						scrollPane_1.setViewportView(txtrDescription);
						txtrDescription.setForeground(Color.BLACK);
						txtrDescription.setBackground(Color.WHITE);
						txtrDescription.setEditable(false);
						txtrDescription.setText("Description");

		panel_1 = new JPanel();
		panel_1.setOpaque(false);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridwidth = 3;
		gbc_panel_1.insets = new Insets(0, 0, 0, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 3;
		panel.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{98, 127, 71, 0};
		gbl_panel_1.rowHeights = new int[]{23, 14, 85, 14, 114, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
				
						comboBox = new JComboBox<Post>();
						comboBox.setIgnoreRepaint(true);
						comboBox.setMinimumSize(new Dimension(100, 20));
						GridBagConstraints gbc_comboBox = new GridBagConstraints();
						gbc_comboBox.anchor = GridBagConstraints.WEST;
						gbc_comboBox.insets = new Insets(0, 0, 5, 5);
						gbc_comboBox.gridwidth = 2;
						gbc_comboBox.gridx = 0;
						gbc_comboBox.gridy = 0;
						panel_1.add(comboBox, gbc_comboBox);
						
								editPost = new JButton("Modifier");
								editPost.setForeground(Color.WHITE);
								editPost.setBackground(new Color(87, 108, 168));
								GridBagConstraints gbc_editPost = new GridBagConstraints();
								gbc_editPost.anchor = GridBagConstraints.EAST;
								gbc_editPost.insets = new Insets(0, 0, 5, 0);
								gbc_editPost.gridx = 2;
								gbc_editPost.gridy = 0;
								panel_1.add(editPost, gbc_editPost);
				
						label = new JLabel("Coordonnees du recruteur");
						label.setForeground(new Color(245, 243, 245));
						GridBagConstraints gbc_label = new GridBagConstraints();
						gbc_label.anchor = GridBagConstraints.WEST;
						gbc_label.gridwidth = 2;
						gbc_label.insets = new Insets(0, 0, 5, 5);
						gbc_label.gridx = 0;
						gbc_label.gridy = 1;
						panel_1.add(label, gbc_label);
				
				txtRecruteurCoordonnee = new JTextArea();
				GridBagConstraints gbc_txtRecruteurCoordonnee = new GridBagConstraints();
				gbc_txtRecruteurCoordonnee.fill = GridBagConstraints.BOTH;
				gbc_txtRecruteurCoordonnee.insets = new Insets(0, 0, 5, 0);
				gbc_txtRecruteurCoordonnee.gridwidth = 3;
				gbc_txtRecruteurCoordonnee.gridx = 0;
				gbc_txtRecruteurCoordonnee.gridy = 2;
				panel_1.add(txtRecruteurCoordonnee, gbc_txtRecruteurCoordonnee);
				
						lblDescritpionDuPoste = new JLabel("Descritpion du poste");
						lblDescritpionDuPoste.setForeground(new Color(245, 243, 245));
						GridBagConstraints gbc_lblDescritpionDuPoste = new GridBagConstraints();
						gbc_lblDescritpionDuPoste.anchor = GridBagConstraints.WEST;
						gbc_lblDescritpionDuPoste.insets = new Insets(0, 0, 5, 5);
						gbc_lblDescritpionDuPoste.gridx = 0;
						gbc_lblDescritpionDuPoste.gridy = 3;
						panel_1.add(lblDescritpionDuPoste, gbc_lblDescritpionDuPoste);
		
				scrollPane_2 = new JScrollPane();
				GridBagConstraints gbc_scrollPane_2 = new GridBagConstraints();
				gbc_scrollPane_2.fill = GridBagConstraints.BOTH;
				gbc_scrollPane_2.gridwidth = 3;
				gbc_scrollPane_2.gridx = 0;
				gbc_scrollPane_2.gridy = 4;
				panel_1.add(scrollPane_2, gbc_scrollPane_2);
				
						txtDescriptionPost = new JTextArea();
						scrollPane_2.setViewportView(txtDescriptionPost);
						txtDescriptionPost.setBackground(Color.WHITE);
						txtDescriptionPost.setForeground(Color.BLACK);

		panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 3;
		gbc_panel_2.gridy = 3;
		panel.add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{98, 302, 71, 0};
		gbl_panel_2.rowHeights = new int[]{23, 256, 0};
		gbl_panel_2.columnWeights = new double[]{1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
				lblListeDeComptence = new JLabel("Liste de comp\u00E9tence");
				GridBagConstraints gbc_lblListeDeComptence = new GridBagConstraints();
				gbc_lblListeDeComptence.gridwidth = 2;
				gbc_lblListeDeComptence.anchor = GridBagConstraints.WEST;
				gbc_lblListeDeComptence.insets = new Insets(0, 0, 5, 5);
				gbc_lblListeDeComptence.gridx = 0;
				gbc_lblListeDeComptence.gridy = 0;
				panel_2.add(lblListeDeComptence, gbc_lblListeDeComptence);
				
						editSkillList = new JButton("Modifier");
						GridBagConstraints gbc_editSkillList = new GridBagConstraints();
						gbc_editSkillList.anchor = GridBagConstraints.EAST;
						gbc_editSkillList.insets = new Insets(0, 0, 5, 0);
						gbc_editSkillList.gridx = 2;
						gbc_editSkillList.gridy = 0;
						panel_2.add(editSkillList, gbc_editSkillList);
						editSkillList.setForeground(Color.WHITE);
						editSkillList.setBackground(new Color(87, 108, 168));
		
				scrollPane_3 = new JScrollPane();
				GridBagConstraints gbc_scrollPane_3 = new GridBagConstraints();
				gbc_scrollPane_3.fill = GridBagConstraints.BOTH;
				gbc_scrollPane_3.gridwidth = 3;
				gbc_scrollPane_3.gridx = 0;
				gbc_scrollPane_3.gridy = 1;
				panel_2.add(scrollPane_3, gbc_scrollPane_3);
				
				table = new JTable();
				table.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
						"Comp\u00E9tences", "Niveau"
					}
				));
				table.getColumnModel().getColumn(0).setPreferredWidth(498);
				table.getColumnModel().getColumn(1).setPreferredWidth(124);
				table.setAutoCreateRowSorter(true);
				table.setEditingRow(1);
				table.setEditingColumn(2);
				scrollPane_3.setViewportView(table);
	}

}
