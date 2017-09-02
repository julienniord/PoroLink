package poroLink.controllers;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;

import javax.swing.JFrame;

import poroLink.entities.AppUser;
import poroLink.entities.Candidate;
import poroLink.managers.ViewsManager;
import poroLink.views.ConnectionView;
//import porolink.database.AppUserDAO;


public class ConnectionController extends BaseController {
	
	private AppUser user;
	
	private JFrame frame;
	private ConnectionView view;
	public ConnectionController(JFrame frame) {
		super.frame = frame;
		user = new Candidate(666,"ludo","fagot");
		super.view = new ConnectionView(this.frame);
		
	}
	
	@Override
	public void initEvent() {
		
		ConnectionView view = (ConnectionView) super.view;
		
		view.getBtnConnection().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				AppUserDAO dao = new AppUserDAO();
				ResultSet rs = dao.executeRequest("SELECT * FROM AppUser WHERE mail = '" + view.getMailText().getText() + "'");
				
				if (rs != null) {
					if (view.getMailText().getText()==rs.getString(MAIL) && new String((view.getPwd()).getPassword()).equals(rs.getString(PASSWORD))){
						ViewsManager.getInstance().next(new HomeController(frame));
					}else {
						view.getFailLabel().setText("Informations incorrectes !");
						view.getFailLabel().setVisible(true);
					}
				}else {
					view.getFailLabel().setText("Cet utilisateur n'existe pas !");
					view.getFailLabel().setVisible(true);
				}
				
			}
			
			
		}) ;
		view.getBtnRegistration().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.getBtnRegistration().setContentAreaFilled(false);
				ViewsManager.getInstance().next(new RegistrationController(frame));
				//ViewsManager.getInstance().next(new MatchingController(frame));
				user.setMail("toto");
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
		this.viewDatas.put("currentUser", user);
	}
}
