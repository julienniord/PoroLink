package poroLink.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import poroLink.entities.AppUser;
import poroLink.entities.Candidate;
import poroLink.entities.Company;
import poroLink.entities.Role;
import poroLink.managers.ViewsManager;
import poroLink.views.HomeView;
import poroLink.views.ProfileCandidateView;
import poroLink.views.ProfileCompanyView;

public class HomeController extends BaseController {

	public HomeController(JFrame frame) {
		super();
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
		Company company = (Company) this.viewDatas.get(CURRENTUSER);
		((HomeView) getView()).getMenuBar().getNavigationBar().setupEvents();

		((HomeView) getView())
				.getMenuBar()
				.getButtonProfil()
				.setText(
						company.getCompany_name());
		((HomeView) getView())
				.getMenuBar()
				.getNavigationBar()
				.getBtnHome()
				.setVisible(false);

	}
}
