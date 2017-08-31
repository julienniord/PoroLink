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

public class ListUserView extends BaseView {
	

	/**
	 * Create the frame.
	 */
	public ListUserView(JFrame frame) {
		super.pageName = "List utilisateurs";
		JPanel panel = new JPanel();
		super.contentPane = panel;
		
	}
}
