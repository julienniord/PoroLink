package poroLink.views.usercontrols;

import javax.swing.JPanel;
import javax.swing.JSeparator;

import poroLink.controllers.ListUserController;
import poroLink.managers.ViewsManager;
import poroLink.views.BaseView;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class NavigationBar extends BaseView {

	private JButton btnHome;
	private JButton btnProfil;
	private JButton btnDeconnection;
	private ActionListener HomeListener;
	private ActionListener UserListener;
	private ActionListener DeconnectionListener;
	private JSeparator separator;



	/**
	 * @return the btnHome
	 */
	public JButton getBtnHome() {
		return btnHome;
	}

	/**
	 * @return the btnUserList
	 */
	public JButton getBtnProfil() {
		return btnProfil;
	}

	/**
	 * @return the btnDeconnection
	 */
	public JButton getBtnDeconnection() {
		return btnDeconnection;
	}

	/**
	 * @return the homeListener
	 */
	public ActionListener getHomeListener() {
		return HomeListener;
	}

	/**
	 * @return the userListener
	 */
	public ActionListener getUserListener() {
		return UserListener;
	}

	/**
	 * @return the backListener
	 */
	public ActionListener getDeconnectionListener() {
		return DeconnectionListener;
	}


	public NavigationBar() {
		super.pageName = "NavigationBar";
		JPanel panel = new JPanel();
		panel.setBackground(new java.awt.Color(28, 85, 136));
		super.contentPane = panel;
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{62, 83, 71, 113, 66, 97, 0};
		gbl_panel.rowHeights = new int[]{23, 0};
		gbl_panel.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
				
						btnHome = new JButton("Home");
						GridBagConstraints gbc_btnHome = new GridBagConstraints();
						gbc_btnHome.anchor = GridBagConstraints.NORTHWEST;
						gbc_btnHome.insets = new Insets(0, 0, 0, 5);
						gbc_btnHome.gridx = 1;
						gbc_btnHome.gridy = 0;
						panel.add(btnHome, gbc_btnHome);
		
				btnProfil = new JButton("Profil");
				GridBagConstraints gbc_btnUserList = new GridBagConstraints();
				gbc_btnUserList.anchor = GridBagConstraints.NORTHWEST;
				gbc_btnUserList.insets = new Insets(0, 0, 0, 5);
				gbc_btnUserList.gridx = 3;
				gbc_btnUserList.gridy = 0;
				panel.add(btnProfil, gbc_btnUserList);
		
		btnDeconnection = new JButton("Déconnexion");
		GridBagConstraints gbc_btnDeconnection = new GridBagConstraints();
		gbc_btnDeconnection.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnDeconnection.gridx = 5;
		gbc_btnDeconnection.gridy = 0;
		panel.add(btnDeconnection, gbc_btnDeconnection);
	}

	public void setupEvents() {
		

		HomeListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ViewsManager.getInstance().goHome();
			}
		};
		this.btnHome.addActionListener(HomeListener);

		UserListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ViewsManager.getInstance().goProfil();
			}
		};
		this.btnProfil.addActionListener(UserListener);
		
		DeconnectionListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ViewsManager.getInstance().deconnection();
			}
		};
		this.btnDeconnection.addActionListener(DeconnectionListener);
	}
	
	

	public void resetEvents() {
		this.btnHome.removeActionListener(HomeListener);
		this.btnProfil.removeActionListener(UserListener);
		this.btnDeconnection.removeActionListener(DeconnectionListener);
	}
}