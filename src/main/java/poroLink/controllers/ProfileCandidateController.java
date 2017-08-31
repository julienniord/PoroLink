package poroLink.controllers;

import java.awt.EventQueue;

import javax.swing.JFrame;

import poroLink.entities.Candidate;
import poroLink.views.ProfileCandidateView;
import poroLink.views.ProfileCompanyView;


/**
 * @author kai_g
 *
 */
public class ProfileCandidateController extends BaseController{
	private ProfileCandidateView view;
	private Candidate user;
	private JFrame frame;

	public ProfileCandidateController(JFrame frame) {
		this.frame = frame;


		/**
		 * Launch the application.
		 */
		/*
		EventQueue.invokeLater(new Runnable() { // EventQueue.invokeLater permet

			public void run() { // dans le thread principal (dispatch thread)
				try {
					view = new ProfileCandidateView(ProfileCandidateController.this.frame);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		*/
		//view.getSkillList().set
		super.frame = frame;
		super.view = new ProfileCandidateView(this.frame);

	}

	@Override
	public void initEvent() {
		// TODO Auto-generated method stub
		
	}
}
