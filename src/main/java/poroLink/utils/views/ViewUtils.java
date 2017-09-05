package poroLink.utils.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;
import javax.swing.text.View;

import com.mysql.fabric.xmlrpc.base.Array;

import poroLink.controllers.HomeController;
import poroLink.controllers.ListUserController;
import poroLink.controllers.MatchingController;
import poroLink.controllers.ProfileCandidateController;
import poroLink.controllers.ProfileCompanyController;
import poroLink.entities.AppUser;
import poroLink.entities.Post;
import poroLink.entities.Role;
import poroLink.managers.ViewsManager;
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
		JPanel menuBar = new JPanel();
		GridBagConstraints gbc_menuBar = new GridBagConstraints();
		gbc_menuBar.gridwidth = 7;
		gbc_menuBar.insets = new Insets(0, 0, 5, 5);
		gbc_menuBar.fill = GridBagConstraints.BOTH;
		gbc_menuBar.gridx = 0;
		gbc_menuBar.gridy = 0;
		contentPane.add(menuBar, gbc_menuBar);
		menuBar.setBackground(new Color(28, 85, 136));
		GridBagLayout gbl_menuBar = new GridBagLayout();
		gbl_menuBar.columnWidths = new int[]{0, 20, 0, 0, 0, 0,50, 0, 0, 0, 50, 0, 0, 50, 0, 0, 0,50, 0, 0, 20};
		gbl_menuBar.rowHeights = new int[]{150, 0};
		gbl_menuBar.columnWeights = new double[]{1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_menuBar.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		menuBar.setLayout(gbl_menuBar);
		
		JButton btnHome = new JButton("");
		GridBagConstraints gbc_btnHome = new GridBagConstraints();
		gbc_btnHome.insets = new Insets(0, 0, 0, 5);
		gbc_btnHome.gridx = 0;
		gbc_btnHome.gridy = 0;
		btnHome.setIcon(new ImageIcon("Pictures/logomini.png"));
		btnHome.setBackground(new Color(87, 108, 168));
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ViewsManager.getInstance().next(new HomeController(jFrame));
			}
		});
		menuBar.add(btnHome, gbc_btnHome);
		
		JButton btnProfil = new JButton("Profil");
		btnProfil.setForeground(Color.WHITE);
		GridBagConstraints gbc_btnProfil = new GridBagConstraints();
		gbc_btnProfil.insets = new Insets(0, 0, 0, 5);
		gbc_btnProfil.gridx = 2;
		gbc_btnProfil.gridy = 0;
		btnProfil.setBackground(new Color(87, 108, 168));
		menuBar.add(btnProfil, gbc_btnProfil);
		
		
		JButton btnListeDesUtilisateurs = new JButton("Liste des Utilisateurs");
		btnListeDesUtilisateurs.setForeground(Color.WHITE);
		GridBagConstraints gbc_btnListeDesUtilisateurs = new GridBagConstraints();
		gbc_btnListeDesUtilisateurs.insets = new Insets(0, 0, 0, 5);
		gbc_btnListeDesUtilisateurs.gridx = 11;
		gbc_btnListeDesUtilisateurs.gridy = 0;
		btnListeDesUtilisateurs.setBackground(new Color(87, 108, 168));
		btnListeDesUtilisateurs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ViewsManager.getInstance().next(new ListUserController(jFrame));
			}
		});
		menuBar.add(btnListeDesUtilisateurs, gbc_btnListeDesUtilisateurs);
		
		JButton btnDeconnexion = new JButton("D\u00E9connexion");
		btnDeconnexion.setForeground(Color.WHITE);
		GridBagConstraints gbc_btnDeconnexion = new GridBagConstraints();
		gbc_btnDeconnexion.gridx = 19;
		gbc_btnDeconnexion.gridy = 0;
		btnDeconnexion.setBackground(new Color(87, 108, 168));
		menuBar.add(btnDeconnexion, gbc_btnDeconnexion);
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
					model.addRow(new Object[]{post.getSkills().get(i).getSkill_name(), post.getSkills().get(i).getNeeds()});
					
					}
				jTable.setModel(model);

			}
		});

	}
	
	public static void showTable (BaseView view, JTable jTable, ArrayList arrayList) {
		
		DefaultTableModel model = new DefaultTableModel(); 	
		model.addColumn(" ");
		for (int i = 0 ; i <= arrayList.size() - 1; i++) {
			model.addRow(new Object[]{arrayList.get(i)});
			
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
	
	public static void selectProfil (AppUser user, JFrame jFrame) {
		if (user.getRole_appuser() == Role.CANDIDATE) {
			ViewsManager.getInstance().next(new ProfileCandidateController(jFrame));
		} else {
			ViewsManager.getInstance().next(new ProfileCompanyController(jFrame));
		}
	}
	
}
