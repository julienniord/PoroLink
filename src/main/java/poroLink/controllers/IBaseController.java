package poroLink.controllers;

import javax.swing.JFrame;

public interface IBaseController {
	public BaseController loadController(JFrame frame);
	public void initEvent();
	public void initView();
	public void setupDatas();
}
