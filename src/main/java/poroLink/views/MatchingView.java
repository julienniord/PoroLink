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

public class MatchingView extends BaseView {
	private JPanel contentPane;
	private JComboBox comboBoxPosts;
	private JLabel lblHello;
	private JTextField textField;
	private JButton btnValide;
	
	/**
	 * @return the btnValide
	 */
	public JButton getBtnValide() {
		return btnValide;
	}


	/**
	 * @param btnValide the btnValide to set
	 */
	public void setBtnValide(JButton btnValide) {
		this.btnValide = btnValide;
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
		return lblHello;
	}


	/**
	 * @param lblHello the lblHello to set
	 */
	public void setLblHello(JLabel lblHello) {
		this.lblHello = lblHello;
	}
	
	public MatchingView(JFrame frame)  {
		super.pageName = "Matching";
		contentPane = new JPanel();


		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 4;
		gbc_textField.gridy = 1;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		textField.setText("dsd");
		
		lblHello = new JLabel();
		GridBagConstraints gbc_lblHello = new GridBagConstraints();
		gbc_lblHello.anchor = GridBagConstraints.EAST;
		gbc_lblHello.insets = new Insets(0, 0, 5, 5);
		gbc_lblHello.gridx = 3;
		gbc_lblHello.gridy = 2;
		contentPane.add(lblHello, gbc_lblHello);
		lblHello.setText("eee");
		
		comboBoxPosts = new JComboBox();
		GridBagConstraints gbc_comboBoxPosts = new GridBagConstraints();
		gbc_comboBoxPosts.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxPosts.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxPosts.gridx = 4;
		gbc_comboBoxPosts.gridy = 2;
		contentPane.add(comboBoxPosts, gbc_comboBoxPosts);
		
		btnValide = new JButton("Rechercher Les candidats");

		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 5;
		gbc_btnNewButton.gridy = 2;
		contentPane.add(btnValide, gbc_btnNewButton);
		
	}
}
