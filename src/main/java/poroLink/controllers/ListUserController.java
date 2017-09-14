package poroLink.controllers;

import javax.swing.JFrame;

import poroLink.views.ListUserView;

public class ListUserController extends BaseController {

	public ListUserController(JFrame frame){
		super();
		super.frame = frame;
		super.view = new ListUserView(this.frame);
	}

	@Override
	public void initEvent() {
		this.view = (ListUserView) super.view;

	}

	
	@Override
	public void initView() {
	
		
	}
}
