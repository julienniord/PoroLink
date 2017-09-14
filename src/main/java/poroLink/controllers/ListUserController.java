package poroLink.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import poroLink.entities.AppUser;
import poroLink.managers.ViewsManager;
import poroLink.views.HomeView;
import poroLink.views.ListUserView;
import poroLink.views.LoginView;
import poroLink.views.MatchingView;

public class ListUserController extends BaseController {

	public ListUserController(JFrame frame){
		super();
		super.frame = frame;
		super.view = new ListUserView(this.frame);
	}

	@Override
	public void initEvent() {
		ListUserView view = (ListUserView) super.view;

	}

	
	@Override
	public void initView() {
	
		
	}
}
