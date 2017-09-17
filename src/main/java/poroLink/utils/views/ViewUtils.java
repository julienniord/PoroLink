package poroLink.utils.views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;

import poroLink.database.CompanyDAO;
import poroLink.entities.Post;
import poroLink.entities.base.BaseEntity;
import poroLink.views.BaseView;

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
	
	public static void editText(BaseView view, JButton JButton, JTextComponent JTextComponent) {

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

	public static void showPost(BaseView view, JComboBox jComboBox, JTextArea jTextArea, JTextArea jTextArea2, JTable jTable) {

		jComboBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) { 
				Post post = (Post) jComboBox.getSelectedItem();
				jTextArea.setText(post.getPresentation());
				jTextArea2.setText(post.getFirstname_agent() + post.getLastname_agent() + "\n" + post.getMail_agent());
				view.getContentPane().repaint();
				DefaultTableModel model = new DefaultTableModel(); 	
				model.addColumn("Compétences");
				model.addColumn("Niveau");
				for (int i = 0 ; i <= post.getSkills().size() - 1; i++) {
					model.addRow(new Object[]{post.getSkills().get(i).getSkill_name(), post.getSkills().get(i).getNeed()});
					
					}
				jTable.setModel(model);

			}
		});

	}
	
	public static void showTable (BaseView view, JTable jTable, List List) {
		
		DefaultTableModel model = new DefaultTableModel(); 	
		model.addColumn(" ");
		for (int i = 0 ; i <= List.size() - 1; i++) {
			model.addRow(new Object[]{List.get(i)});
			
			}
		jTable.setModel(model);

	}
	
	
	public static void editTable (BaseView view, JButton jButton, JTable jTable) {
		
		jButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (jTable.isEnabled() == true) {
					jButton.setText("Modifier");
					jTable.setEnabled(false);
				} else {
					jButton.setText("Valider");
					jTable.setEnabled(true);
				}
				view.getContentPane().repaint();

			}

		});
		
	}
	
	public static String SqlTest (String string) {
		String result = (string == null ? "" : string);
		return result;
		
	}
}
