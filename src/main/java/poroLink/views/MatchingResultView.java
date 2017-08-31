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
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class MatchingResultView extends BaseView {
	private JTextField textField;
	private JButton btnValidate;
	
	private JTextArea textAreaSkills;
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

	private MenuBar menuBar;
	private JLabel lblSkillsDuPoste;
	private JLabel lblCanditatsEtSkills;
	private JTextArea textAreaCanditate;

	

	/**
	 * @return the textAreaSkills
	 */
	public JTextArea getTextAreaSkills() {
		return textAreaSkills;
	}

	/**
	 * @param textAreaSkills the textAreaSkills to set
	 */
	public void setTextAreaSkills(JTextArea textAreaSkills) {
		this.textAreaSkills = textAreaSkills;
	}

	/**
	 * @return the menuBar
	 */
	public MenuBar getMenuBar() {
		return menuBar;
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
	 * @param menuBar the menuBar to set
	 */
	public void setMenuBar(MenuBar menuBar) {
		this.menuBar = menuBar;
	}

	/**
	 * Create the frame.
	 */
	public MatchingResultView(JFrame frame) {
		super.pageName = "Résultat de la recherche";
		JPanel panel = new JPanel();
		super.contentPane = panel;

		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		/*
		menuBar = new MenuBar();
		GridBagConstraints gbc_menuBar = new GridBagConstraints();
		gbc_menuBar.fill = GridBagConstraints.HORIZONTAL;
		gbc_menuBar.gridx = 0;
		gbc_menuBar.gridy = 0;
		gbc_menuBar.gridwidth = 10;
		panel.add(menuBar.getContentPane(), gbc_menuBar);
		*/
				btnValidate = new JButton("RECHERCE");
				
				GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
				gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
				gbc_btnNewButton.gridx = 0;
				gbc_btnNewButton.gridy = 3;
				panel.add(btnValidate, gbc_btnNewButton);
		
				textField = new JTextField();
				GridBagConstraints gbc_textField = new GridBagConstraints();
				gbc_textField.insets = new Insets(0, 0, 5, 0);
				gbc_textField.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField.gridx = 6;
				gbc_textField.gridy = 3;
				panel.add(textField, gbc_textField);
				textField.setColumns(10);
		
		lblSkillsDuPoste = new JLabel("Skills du poste");
		GridBagConstraints gbc_lblSkillsDuPoste = new GridBagConstraints();
		gbc_lblSkillsDuPoste.insets = new Insets(0, 0, 5, 5);
		gbc_lblSkillsDuPoste.gridx = 1;
		gbc_lblSkillsDuPoste.gridy = 4;
		panel.add(lblSkillsDuPoste, gbc_lblSkillsDuPoste);
		
		lblCanditatsEtSkills = new JLabel("Canditats et skills");
		GridBagConstraints gbc_lblCanditatsEtSkills = new GridBagConstraints();
		gbc_lblCanditatsEtSkills.insets = new Insets(0, 0, 5, 5);
		gbc_lblCanditatsEtSkills.gridx = 3;
		gbc_lblCanditatsEtSkills.gridy = 4;
		panel.add(lblCanditatsEtSkills, gbc_lblCanditatsEtSkills);
		
		textAreaSkills = new JTextArea();
		GridBagConstraints gbc_textAreaSkills = new GridBagConstraints();
		gbc_textAreaSkills.insets = new Insets(0, 0, 0, 5);
		gbc_textAreaSkills.fill = GridBagConstraints.BOTH;
		gbc_textAreaSkills.gridx = 1;
		gbc_textAreaSkills.gridy = 5;
		panel.add(textAreaSkills, gbc_textAreaSkills);
		
		textAreaCanditate = new JTextArea();
		GridBagConstraints gbc_textAreaCanditate = new GridBagConstraints();
		gbc_textAreaCanditate.insets = new Insets(0, 0, 0, 5);
		gbc_textAreaCanditate.fill = GridBagConstraints.BOTH;
		gbc_textAreaCanditate.gridx = 3;
		gbc_textAreaCanditate.gridy = 5;
		panel.add(textAreaCanditate, gbc_textAreaCanditate);
	}

	/**
	 * @return the textAreaCanditate
	 */
	public JTextArea getTextAreaCanditate() {
		return textAreaCanditate;
	}

	/**
	 * @param textAreaCanditate the textAreaCanditate to set
	 */
	public void setTextAreaCanditate(JTextArea textAreaCanditate) {
		this.textAreaCanditate = textAreaCanditate;
	}
}
