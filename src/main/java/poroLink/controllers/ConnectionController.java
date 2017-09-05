package poroLink.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;

import poroLink.database.AppUserDAO;
import poroLink.entities.AppUser;
import poroLink.entities.Candidate;
import poroLink.entities.Role;
import poroLink.managers.ViewsManager;
import poroLink.views.ConnectionView;
//import porolink.database.AppUserDAO;


public class ConnectionController extends BaseController {
	
	private JFrame frame;
	public ConnectionController(JFrame frame) {
		super.frame = frame;
		super.view = new ConnectionView(frame);
	}
	
	AppUserDAO dao = new AppUserDAO();
	
	@Override
	public void initEvent() {
		
		ConnectionView view = (ConnectionView) super.view;
		
		view.getBtnConnection().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				
				ResultSet rs = dao.executeRequest("SELECT * FROM AppUser WHERE mail = '" + view.getMailText().getText() + "'");
				
				try {
					if (rs.next()) {
						if (view.getMailText().getText().equals(rs.getString(AppUserDAO.MAIL)) && new String((view.getPwd()).getPassword()).equals(rs.getString(AppUserDAO.PASSWORD))){
							if (rs.getString(AppUserDAO.ROLE_APPUSER).equals("CANDIDATE")) {
								ViewsManager.getInstance().next(new ProfileCandidateController(frame));
							}else if (rs.getString(AppUserDAO.ROLE_APPUSER).equals("COMPANY")) {
								ViewsManager.getInstance().next(new ProfileCompanyController(frame));
							}
						}else {
							view.getFailLabel().setText("Mot de passe incorrect !");
							view.getFailLabel().setVisible(true);
							view.getContentPane().repaint();
						}
					}else {
						view.getFailLabel().setText("Cet utilisateur n'existe pas !");
						view.getFailLabel().setVisible(true);
						view.getContentPane().repaint();
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
			
			
		}) ;
		view.getBtnRegistration().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.getBtnRegistration().setContentAreaFilled(false);
				ViewsManager.getInstance().next(new RegistrationController(frame));
			}
		});
		
		view.getForgottenPwdLabel().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	ViewsManager.getInstance().next(new ForgottenPwdController(frame));
            }

        });
		
		
		
	}
	@Override
	public void setupDatas() {
		ConnectionView view = (ConnectionView) super.view;
		this.viewDatas.put("currentUser", dao.getFromConnexion(view.getMailText().getText(), new String((view.getPwd()).getPassword())));
	}
}
