package poroLink.controllers;

import javax.swing.JFrame;

public interface IBaseController {
	public BaseController loadController(JFrame frame);
	
	/**
	 * THis function initializes the event of the current controller. It serves to do
	 * the same schema of action i all controllers. All the action code of the controller is in.
	 */
	public void initEvent();
	public void initView();
	public void setupDatas();
	public void onExit();
}
