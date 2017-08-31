package poroLink.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import poroLink.entities.AppUser;
import poroLink.managers.ViewsManager;
import poroLink.views.HomeView;
import poroLink.views.LoginView;
import poroLink.views.MatchingView;

public class HomeController extends BaseController {

	public HomeController(JFrame frame){
		super.frame = frame;
		super.view = new HomeView(this.frame);
	}

	@Override
	public void initEvent() {
		HomeView view = (HomeView) super.view;
		view.getBtnValidate().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					ViewsManager.getInstance().next(new MatchingController(frame));
			}
		});
	}

	
	@Override
	public void initView() {
		
		//((HomeView)getView()).getMenuBar().getLblUserfirstname().setText(((AppUser)this.viewDatas.get("currentUser")).getMail());
		((HomeView)getView()).getTextField().setText(((AppUser)this.viewDatas.get("currentUser")).getMail());
		
		
	}
}
