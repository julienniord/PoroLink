package poroLink.controllers;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;

import poroLink.database.CandidateDAO;
import poroLink.database.CertificateDAO;
import poroLink.entities.Candidate;
import poroLink.entities.Company;
import poroLink.entities.Post;
import poroLink.utils.views.ViewUtils;
import poroLink.views.ProfileCandidateView;
import poroLink.views.ProfileCompanyView;

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

	@Override
	public void initEvent() {
		view = (ProfileCandidateView) super.view;
		CandidateDAO candidateDAO = new CandidateDAO();
		
		Candidate candidate = (Candidate) this.viewDatas.get(CURRENTUSER);
		
		candidate = candidateDAO.getSkills(candidate);
		candidate = candidateDAO.getCertificate(candidate);
	
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Compétences");
		model.addColumn("Niveau");
		DefaultTableModel model2 = new DefaultTableModel();
		model2.addColumn("Diplômes");
		
		
		for (int i = 0 ; i <= candidate.getSkills().size() - 1; i++) {
			model.addRow(new Object[]{candidate.getSkills().get(i).getSkill_name(), candidate.getSkills().get(i).getOwn()});
		}
		view.getTableSkill().setModel(model);
		
		
//		for (int i = 0 ; i <= candidate.getCertificates().size() - 1; i++) {
//			model2.addRow(new Object[]{candidate.getCertificates().get(i).getCertificate()});
//		}
//		view.getTableSkill().setModel(model);
		

		ViewUtils.ImplementProfile(view.getTextFieldName(), candidate.getFirstname()+candidate.getLastname());
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

	
}
