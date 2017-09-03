package poroLink.views;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.GridBagLayout;

import javax.swing.JTextField;

import poroLink.utils.views.ViewUtils;
import poroLink.views.usercontrols.MenuBar;

import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class MatchingView extends BaseView {
	private JPanel contentPane;
	private JComboBox comboBoxPosts;
	private JLabel lblRecherche;
	private JTextField textField;
	private JButton btnMatch;
	
	/**
	 * @return the btnValide
	 */
	public JButton getBtnValide() {
		return btnMatch;
	}


	/**
	 * @param btnValide the btnValide to set
	 */
	public void setBtnValide(JButton btnValide) {
		this.btnMatch = btnValide;
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
	 * @return the comboBoxPosts
	 */
	public JComboBox getComboBoxPosts() {
		return comboBoxPosts;
	}


	/**
	 * @param comboBoxPosts the comboBoxPosts to set
	 */
	public void setComboBoxPosts(JComboBox comboBoxPosts) {
		this.comboBoxPosts = comboBoxPosts;
	}

	
	
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
	 * @return the lblHello
	 */
	public JLabel getLblHello() {
		return lblRecherche;
	}


	/**
	 * @param lblHello the lblHello to set
	 */
	public void setLblHello(JLabel lblHello) {
		this.lblRecherche = lblHello;
	}
	
	public MatchingView(JFrame frame)  {
		super.pageName = "Matching";
		contentPane = new JPanel();


		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 18));
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 1;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		textField.setText("dsd");
		
		lblRecherche = new JLabel();
		lblRecherche.setFont(new Font("Arial", Font.PLAIN, 18));
		lblRecherche.setText("Recherche pour le poste :");
		lblRecherche.setForeground(new java.awt.Color(245,243,245));
		GridBagConstraints gbc_lblRecherche = new GridBagConstraints();
		gbc_lblRecherche.anchor = GridBagConstraints.EAST;
		gbc_lblRecherche.insets = new Insets(0, 0, 5, 5);
		gbc_lblRecherche.gridx = 1;
		gbc_lblRecherche.gridy = 2;
		contentPane.add(lblRecherche, gbc_lblRecherche);
		
		comboBoxPosts = new JComboBox();
		comboBoxPosts.setFont(new Font("Arial", Font.PLAIN, 18));
		GridBagConstraints gbc_comboBoxPosts = new GridBagConstraints();
		gbc_comboBoxPosts.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxPosts.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxPosts.gridx = 2;
		gbc_comboBoxPosts.gridy = 2;
		contentPane.add(comboBoxPosts, gbc_comboBoxPosts);
		
		btnMatch = new JButton("Match !");
		btnMatch.setFont(new Font("Arial", Font.PLAIN, 18));
		
				GridBagConstraints gbc_btnMatch = new GridBagConstraints();
				gbc_btnMatch.gridwidth = 3;
				gbc_btnMatch.insets = new Insets(0, 0, 5, 5);
				gbc_btnMatch.gridx = 1;
				gbc_btnMatch.gridy = 3;
				contentPane.add(btnMatch, gbc_btnMatch);
		
	}
}
