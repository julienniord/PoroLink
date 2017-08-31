package poroLink.controllers;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import poroLink.entities.AppUser;
import poroLink.entities.Candidate;
import poroLink.managers.ViewsManager;
import poroLink.views.LoginView;

public class LoginController extends BaseController {

	private AppUser user;

	public LoginController(JFrame frame) {
		super.frame = frame;
		user = new Candidate(666,"ludo","fagot");
		super.view = new LoginView(this.frame);
	}

	@Override
	public void initEvent() {

		LoginView view = (LoginView) super.view;
		view.getBtnValidate().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				user.setMail(view.getLoginTextField().getText());
				user.setPassword(new String(view.getPasswordField()
						.getPassword()));

				//if (user.getLogin().equals("toto")
				//		&& user.getPassword().equals("pwd")) {
					user.setMail("toto");
					//user.setLastname("el");
					ViewsManager.getInstance().next(new MatchingController(frame));
				//}
			}
		});
	}

	@Override
	public void setupDatas() {
		this.viewDatas.put("currentUser", user);
	}
}