package poroLink.utils.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.text.View;

import poroLink.entities.Post;
import poroLink.views.BaseView;
import poroLink.views.ProfileCompanyView;

public class ViewUtils {

	/**
	 * Allow to configure all screen of application with default size values.
	 * And Frame will be set to center of screen.
	 * @param contentPane
	 * @param jFrame
	 *
	 */
	public static void configureJFrame(JFrame jFrame, JPanel contentPane) {
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		jFrame.setMinimumSize(new Dimension (800, 600));
		
		contentPane.setBackground(new Color(28, 85, 136));
		jFrame.setContentPane(contentPane);
	}

	public static void configureFirstJFrame(JFrame jFrame){
		int frameWidth = 800;
		int frameHeight = 600;
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth = (int) screenSize.getWidth();
		int screenHeight = (int) screenSize.getHeight();

		int screenMiddleWidth = (screenWidth / 2) - (frameWidth / 2);
		int screenMiddleHeight = (screenHeight / 2) - (frameHeight / 2);

		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setBounds(screenMiddleWidth, screenMiddleHeight, frameWidth, frameHeight);
	}
	
	public static void Edit(BaseView view, JButton JButton, JTextComponent JTextComponent) {

		JButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (JTextComponent.isEditable() == true) {

					JButton.setText("Modifier");
					JTextComponent.setEditable(false);
				} else {
					JButton.setText("Valider");
					JTextComponent.setEditable(true);
				}
				view.getContentPane().repaint();

			}
		});

	}

	public static void ShowPost(BaseView view, JComboBox JComboBox, JTextArea JTextArea, JTextArea JTextArea2) {

		JComboBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				Post post = (Post) JComboBox.getSelectedItem();
				JTextArea.setText(post.getPresentation());
				JTextArea2.setText(post.getFirstname_agent() + post.getLastname_agent() + "\n" + post.getMail_agent());
				view.getContentPane().repaint();

			}
		});

	}
	
}
