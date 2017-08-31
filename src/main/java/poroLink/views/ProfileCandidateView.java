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
import java.awt.Dimension;
import javax.swing.border.LineBorder;



import java.awt.Panel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JFormattedTextField;

public class ProfileCandidateView extends BaseView{


	private JTextField txtListeDeComptences;
	private JList skillList;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

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
	 * @return the txtListeDeComptences
	 */
	public JTextField getTxtListeDeComptences() {
		return txtListeDeComptences;
	}


	/**
	 * @param txtListeDeComptences the txtListeDeComptences to set
	 */
	public void setTxtListeDeComptences(JTextField txtListeDeComptences) {
		this.txtListeDeComptences = txtListeDeComptences;
	}


	/**
	 * @return the skillList
	 */
	public JList getSkillList() {
		return skillList;
	}


	/**
	 * @param skillList the skillList to set
	 */
	public void setSkillList(JList skillList) {
		this.skillList = skillList;
	}


	/**
	 * @return the textField
	 */
	public JTextField getTextField() {
		return textField;
	}


	/**
	 * @param textField the textField to set
	 */
	public void setTextField(JTextField textField) {
		this.textField = textField;
	}


	/**
	 * @return the textField_1
	 */
	public JTextField getTextField_1() {
		return textField_1;
	}


	/**
	 * @param textField_1 the textField_1 to set
	 */
	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}


	/**
	 * @return the textField_2
	 */
	public JTextField getTextField_2() {
		return textField_2;
	}


	/**
	 * @param textField_2 the textField_2 to set
	 */
	public void setTextField_2(JTextField textField_2) {
		this.textField_2 = textField_2;
	}


	/**
	 * @return the textField_3
	 */
	public JTextField getTextField_3() {
		return textField_3;
	}


	/**
	 * @param textField_3 the textField_3 to set
	 */
	public void setTextField_3(JTextField textField_3) {
		this.textField_3 = textField_3;
	}


	/**
	 * @return the textField_4
	 */
	public JTextField getTextField_4() {
		return textField_4;
	}


	/**
	 * @param textField_4 the textField_4 to set
	 */
	public void setTextField_4(JTextField textField_4) {
		this.textField_4 = textField_4;
	}


	public ProfileCandidateView(JFrame frame) {
		super.pageName = "Candidats";
		JPanel panel = new JPanel();
		super.contentPane = panel;
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{32, 205, 38, 42, 36, 0};
		gbl_contentPane.rowHeights = new int[]{80, 260, 37, 109, 109, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_contentPane);
		
		JPanel panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridwidth = 5;
		gbc_panel_3.insets = new Insets(0, 0, 5, 0);
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 0;
		panel.add(panel_3, gbc_panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{32, 205, 67, 38, 36, 42, 195, 36, 0};
		gbl_panel_3.rowHeights = new int[]{80, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JLabel lblNewLabel = new JLabel("");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel_3.add(lblNewLabel, gbc_lblNewLabel);
		lblNewLabel.setBorder(new LineBorder(new Color(51, 102, 153), 1, true));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Minet\\Downloads\\20864450_10214162450926257_2019830956_n.png"));
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridwidth = 6;
		gbc_panel_2.insets = new Insets(0, 0, 0, 5);
		gbc_panel_2.gridx = 2;
		gbc_panel_2.gridy = 0;
		panel_3.add(panel_2, gbc_panel_2);
		panel_2.setBackground(new Color(245, 243, 245, 150));
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{267, 71, 39, 71, 267, 0};
		gbl_panel_2.rowHeights = new int[]{46, 26, 40, 23, 41, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		textField = new JTextField();
		textField.setText("Nom Entreprise");
		textField.setForeground(Color.BLACK);
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(Color.WHITE);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 0;
		panel_2.add(textField, gbc_textField);
		
		JButton button = new JButton("Modifier");
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(87, 108, 168));
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 1;
		gbc_button.gridy = 0;
		panel_2.add(button, gbc_button);
		
		JButton button_1 = new JButton("Modifier");
		button_1.setForeground(Color.WHITE);
		button_1.setBackground(new Color(87, 108, 168));
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.insets = new Insets(0, 0, 5, 5);
		gbc_button_1.gridx = 3;
		gbc_button_1.gridy = 0;
		panel_2.add(button_1, gbc_button_1);
		
		textField_1 = new JTextField();
		textField_1.setText("Lien site entreprise");
		textField_1.setForeground(Color.BLACK);
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(Color.WHITE);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.gridx = 4;
		gbc_textField_1.gridy = 0;
		panel_2.add(textField_1, gbc_textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("T\u00E9l\u00E9phone");
		textField_2.setForeground(Color.BLACK);
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBackground(Color.WHITE);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.gridx = 0;
		gbc_textField_2.gridy = 2;
		panel_2.add(textField_2, gbc_textField_2);
		
		JButton button_4 = new JButton("Modifier");
		button_4.setForeground(Color.WHITE);
		button_4.setBackground(new Color(87, 108, 168));
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.insets = new Insets(0, 0, 5, 5);
		gbc_button_4.gridx = 1;
		gbc_button_4.gridy = 2;
		panel_2.add(button_4, gbc_button_4);
		
		JButton button_6 = new JButton("Modifier");
		button_6.setForeground(Color.WHITE);
		button_6.setBackground(new Color(87, 108, 168));
		GridBagConstraints gbc_button_6 = new GridBagConstraints();
		gbc_button_6.insets = new Insets(0, 0, 5, 5);
		gbc_button_6.gridx = 3;
		gbc_button_6.gridy = 2;
		panel_2.add(button_6, gbc_button_6);
		
		textField_4 = new JTextField();
		textField_4.setText("Lien linkedin");
		textField_4.setForeground(Color.BLACK);
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBackground(Color.WHITE);
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 0);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 4;
		gbc_textField_4.gridy = 2;
		panel_2.add(textField_4, gbc_textField_4);
		
		textField_3 = new JTextField();
		textField_3.setText("Adresse");
		textField_3.setForeground(Color.BLACK);
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBackground(Color.WHITE);
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.insets = new Insets(0, 0, 0, 5);
		gbc_textField_3.gridx = 0;
		gbc_textField_3.gridy = 4;
		panel_2.add(textField_3, gbc_textField_3);
		
		JButton button_5 = new JButton("Modifier");
		button_5.setForeground(Color.WHITE);
		button_5.setBackground(new Color(87, 108, 168));
		GridBagConstraints gbc_button_5 = new GridBagConstraints();
		gbc_button_5.insets = new Insets(0, 0, 0, 5);
		gbc_button_5.gridx = 1;
		gbc_button_5.gridy = 4;
		panel_2.add(button_5, gbc_button_5);
		
		JTextArea txtrDescription = new JTextArea();
		txtrDescription.setBorder(new LineBorder(new Color(51, 102, 153), 1, true));
		txtrDescription.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtrDescription.setText("Description");
		GridBagConstraints gbc_txtrDescription = new GridBagConstraints();
		gbc_txtrDescription.gridwidth = 4;
		gbc_txtrDescription.insets = new Insets(0, 0, 5, 5);
		gbc_txtrDescription.fill = GridBagConstraints.BOTH;
		gbc_txtrDescription.gridx = 1;
		gbc_txtrDescription.gridy = 1;
		panel.add(txtrDescription, gbc_txtrDescription);
		
		JPanel panelBlock = new JPanel();
		panelBlock.setBorder(new LineBorder(new Color(51, 102, 153), 1, true));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridheight = 2;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 3;
		panel.add(panelBlock, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {311, 0};
		gbl_panel.rowHeights = new int[] {3, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		panelBlock.setLayout(gbl_panel);
		
		txtListeDeComptences = new JTextField();
		txtListeDeComptences.setEditable(false);
		txtListeDeComptences.setBorder(new LineBorder(new Color(51, 102, 153), 1, true));
		txtListeDeComptences.setText("Liste de comp\u00E9tences");
		GridBagConstraints gbc_txtListeDeComptences = new GridBagConstraints();
		gbc_txtListeDeComptences.insets = new Insets(0, 0, 5, 0);
		gbc_txtListeDeComptences.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtListeDeComptences.gridx = 0;
		gbc_txtListeDeComptences.gridy = 0;
		panelBlock.add(txtListeDeComptences, gbc_txtListeDeComptences);
		txtListeDeComptences.setColumns(10);
		
		skillList = new JList();
		skillList.setBorder(new LineBorder(new Color(51, 102, 153), 1, true));
		skillList.setVisibleRowCount(7);
		skillList.setModel(new AbstractListModel() {
			String[] values = new String[] {"Comp\u00E9tence 1", "Comp\u00E9tence 2", "Comp\u00E9tence 3", "Comp\u00E9tence 4", "Comp\u00E9tence 5", "Comp\u00E9tence 6", "Comp\u00E9tence 7", ""};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		skillList.setToolTipText("");
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 0;
		gbc_list.gridy = 1;
		panelBlock.add(skillList, gbc_list);
		
		JButton button_3 = new JButton("Modifi\u00E9");
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.insets = new Insets(0, 0, 5, 5);
		gbc_button_3.gridx = 2;
		gbc_button_3.gridy = 3;
		panel.add(button_3, gbc_button_3);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridheight = 2;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 3;
		gbc_panel_1.gridy = 3;
		panel.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{125, 140, 0};
		gbl_panel_1.rowHeights = new int[]{33, 51, 0, 55, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Dipl\u00F4me en cours");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 0;
		panel_1.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JList list_1 = new JList();
		list_1.setModel(new AbstractListModel() {
			String[] values = new String[] {"Concepteur logiciel"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		GridBagConstraints gbc_list_1 = new GridBagConstraints();
		gbc_list_1.gridwidth = 2;
		gbc_list_1.insets = new Insets(0, 0, 5, 0);
		gbc_list_1.fill = GridBagConstraints.BOTH;
		gbc_list_1.gridx = 0;
		gbc_list_1.gridy = 1;
		panel_1.add(list_1, gbc_list_1);
		
		JLabel lblNewLabel_2 = new JLabel("Dipl\u00F4mes");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		panel_1.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JList list_2 = new JList();
		list_2.setModel(new AbstractListModel() {
			String[] values = new String[] {"BAC", "Licence de glandouille", "BAFA"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		GridBagConstraints gbc_list_2 = new GridBagConstraints();
		gbc_list_2.gridwidth = 2;
		gbc_list_2.insets = new Insets(0, 0, 0, 5);
		gbc_list_2.fill = GridBagConstraints.BOTH;
		gbc_list_2.gridx = 0;
		gbc_list_2.gridy = 3;
		panel_1.add(list_2, gbc_list_2);
		
		JButton button_2 = new JButton("Modifi\u00E9");
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.insets = new Insets(0, 0, 5, 0);
		gbc_button_2.gridx = 4;
		gbc_button_2.gridy = 3;
		panel.add(button_2, gbc_button_2);
	}

}
