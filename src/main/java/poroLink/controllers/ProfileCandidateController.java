package poroLink.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import poroLink.database.CandidateDAO;
import poroLink.entities.Candidate;
import poroLink.utils.views.ViewUtils;
import poroLink.views.ProfileCandidateView;

/**
 * @author kai_g
 *
 */
public class ProfileCandidateController extends BaseController {
	private ProfileCandidateView view;
	private JFrame frame;

	public ProfileCandidateController(JFrame frame) {
		super();
		this.frame = frame;
		super.frame = frame;
		super.view = new ProfileCandidateView(this.frame);

	}

	CandidateDAO candidateDAO = new CandidateDAO();
	@Override
	public void initEvent() {
		view = (ProfileCandidateView) super.view;
		
		Candidate candidate = (Candidate) this.viewDatas.get(CURRENTUSER);
		
		candidate = candidateDAO.getSkills(candidate);
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Compétences");
		model.addColumn("Niveau");
		
		
		for (int i = 0 ; i <= candidate.getSkills().size() - 1; i++) {
			model.addRow(new Object[]{candidate.getSkills().get(i).getSkill_name(), candidate.getSkills().get(i).getOwn()});
		}
		view.getTableSkill().setModel(model);
		
		candidate = candidateDAO.getCertificates(candidate);
		
		DefaultTableModel model2 = new DefaultTableModel();
		model2.addColumn("Diplomes");
		
		for (int i = 0 ; i < candidate.getCertificates().size() ; i++) {
			model2.addRow(new Object[] {candidate.getCertificates().get(i).getCertificate()});
		}
		view.getTableCertificates().setModel(model2);
		


		ViewUtils.ImplementProfile(view.getTextFieldName(), candidate.getFirstname() + " " + candidate.getLastname());
		ViewUtils.editText(view, view.getEditTxtName(), view.getTextFieldName());

		ViewUtils.ImplementProfile(view.getTextFieldLinkWebSite(), candidate.getLinkGitHub());
		ViewUtils.editText(view, view.getEdittxtLinkWebSite(),
		view.getTextFieldLinkWebSite());

		ViewUtils.ImplementProfile(view.getTextFieldPhone(), candidate.getPhone());
		ViewUtils.editText(view, view.getEditTxtPhone(), view.getTextFieldPhone());

		ViewUtils.ImplementProfile(view.getTxtrPresentation(), candidate.getPresentation());
		ViewUtils.editText(view, view.getEditPresentation(),
		view.getTxtrPresentation());

		ViewUtils.ImplementProfile(view.getTextFieldAddress(), candidate.getMail());
		ViewUtils.editText(view, view.getEditTxtAddress(),
		view.getTextFieldAddress());

		ViewUtils.ImplementProfile(view.getTextFieldLinkLinkedin(), candidate.getLinkLinkedin());
		ViewUtils.editText(view, view.getEditTxtLinkLinkedin() , view.getTextFieldLinkLinkedin());
		 
		ViewUtils.ImplementProfile(view.getTxtCertificatesInProgress(), candidate.getCertificate_in_progress());
		ViewUtils.editText(view, view.getEditTxtCertificates(), view.getTxtCertificatesInProgress());	

	}
	
	@Override
	public void initView () {
		Candidate candidate = (Candidate) this.viewDatas.get(CURRENTUSER);
		((ProfileCandidateView) getView()).getMenuBar().getNavigationBar().setupEvents();

		((ProfileCandidateView) getView())
				.getMenuBar()
				.getButtonProfil()
				.setText(
						candidate.getFirstname() + " " + candidate.getLastname());

		((ProfileCandidateView) getView()).getMenuBar()
				.getNavigationBar()
				.getBtnHome()
				.setVisible(false);
		((ProfileCandidateView) getView()).getMenuBar()
				.getNavigationBar()
				.getBtnProfil()
				.setVisible(false);
	}
	
	public void updateUser() {
		Candidate candidate = (Candidate) this.viewDatas.get(CURRENTUSER);
		//candidate.setFirstname(view.getTxtAddress().getText());
		//candidate.setLastname(view.getTxtNomEntreprise().getText());
		candidate.setPhone(view.getTextFieldPhone().getText());
		candidate.setLinkLinkedin(view.getTextFieldLinkLinkedin().getText());
		candidate.setLinkGitHub(view.getTextFieldLinkWebSite().getText());
		candidate.setCertificate_in_progress(view.getTxtCertificatesInProgress().getText());
		candidateDAO.update(candidate);
	}
	
	public void setupDatas() {
		ProfileCandidateView view = (ProfileCandidateView) super.view;
		view.getMenuBar().getNavigationBar().getBtnHome().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				updateUser();
			}
		});
		view.getMenuBar().getNavigationBar().getBtnDeconnection().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				updateUser();
			}
		});
	}

	
}
