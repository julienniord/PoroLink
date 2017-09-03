package poroLink.controllers;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JFrame;

import poroLink.managers.ViewsManager;
import poroLink.views.ForgottenPwdView;
import poroLink.views.HomeView;

public class ForgottenPwdController extends BaseController {

	private JFrame frame;
	private ForgottenPwdView view;

	public ForgottenPwdController(JFrame frame) {
		
		super.frame = frame;
		super.view = new ForgottenPwdView(this.frame);
		
	}

	@Override
	public void initEvent() {
		ForgottenPwdView view = (ForgottenPwdView) super.view;
		
		view.getBtnValidate().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (Pattern.matches("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)+$", view.getMailText().getText())){
					ViewsManager.getInstance().next(new ConnectionController(frame));
				} else{
					view.getFailLabel().setVisible(true);
					view.getContentPane().repaint();
				}
			}
		});
	}
}
