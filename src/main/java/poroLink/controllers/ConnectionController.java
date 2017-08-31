package poroLink.controllers;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import poroLink.entities.AppUser;
import poroLink.entities.Candidate;
import poroLink.managers.ViewsManager;
import poroLink.views.ConnectionView;


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
				//new ForgottenPwdController(frame);
				ViewsManager.getInstance().next(new ProfileCompanyController(frame));
			}
			
			
		});
		view.getBtnRegistration().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.getBtnRegistration().setContentAreaFilled(false);
				//new RegistrationController(frame);
				user.setMail("toto");
				ViewsManager.getInstance().next(new MatchingController(frame));
			}
		});	
	}
	@Override
	public void setupDatas() {
		this.viewDatas.put("currentUser", user);
	}
}
