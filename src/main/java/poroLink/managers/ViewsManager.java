package poroLink.managers;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import poroLink.controllers.BaseController;
import poroLink.controllers.ConnectionController;
import poroLink.controllers.HomeController;
import poroLink.controllers.ListUserController;
import poroLink.entities.AppUser;
import poroLink.utils.views.ViewUtils;
import poroLink.views.ConnectionView;
import poroLink.views.LoginView;

public class ViewsManager {

	private static ViewsManager instance = null;

	protected ViewsManager() {
		this.frame = new JFrame();
		controllers = new ArrayList<BaseController>();
		currentControllerIndex = 0;
	}

	public static ViewsManager getInstance() {
		if (instance == null) {
			instance = new ViewsManager();
		}
		return instance;
	}

	private JFrame frame;
	private List<BaseController> controllers;
	private int currentControllerIndex;
	private BaseController currentController;

	public void start(){
		ViewUtils.configureFirstJFrame(frame);
		currentController = new ConnectionController(frame);
		controllers.add(currentController);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					controllers.get(currentControllerIndex).loadController(frame);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ViewsManager add(BaseController controller) {
		this.controllers.add(controller);
		return this;
	}

	public ViewsManager next(BaseController controller) {
		controller.setViewDatas(controllers.get(currentControllerIndex).getViewDatas());
		currentController = controller;
		this.controllers.add(currentController);
		currentControllerIndex++;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					controllers.get(currentControllerIndex).loadController(frame);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		return this;
	}
	
	public void goHome () {
		ViewsManager.getInstance().next(new HomeController(frame));
		currentController.onExit();
	}
	
	public void goUserList () {
		ViewsManager.getInstance().next(new ListUserController(frame));
		currentController.onExit();
	}
	
	public void deconnection () {
		ViewsManager.getInstance().next(new ConnectionController(frame));
		currentController.onExit();
	}
}
