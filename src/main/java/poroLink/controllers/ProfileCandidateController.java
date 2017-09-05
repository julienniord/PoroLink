package poroLink.controllers;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

import poroLink.entities.Candidate;
import poroLink.entities.Certificate;
import poroLink.entities.Skill;
import poroLink.utils.views.ViewUtils;
import poroLink.views.ProfileCandidateView;
import poroLink.views.ProfileCompanyView;


/**
 * @author kai_g
 *
 */
public class ProfileCandidateController extends BaseController {
	private ProfileCandidateView view;
	private Candidate user;
	private JFrame frame;

	public ProfileCandidateController(JFrame frame) {
		this.frame = frame;
		super.frame = frame;
		super.view = new ProfileCandidateView(this.frame);

	}

	@Override
	public void initEvent() {
		
		user = new Candidate();
		view = (ProfileCandidateView) super.view;
		Skill java = new Skill("java", 5, 0);
		Skill c = new Skill("C", 3, 4);
		Skill php = new Skill("PhP", 2, 0);
		Skill sql = new Skill("SQL", 4, 2);
		Skill git = new Skill("Git", 4, 3);
		ArrayList<Skill> skills1 = new ArrayList<Skill>();
		skills1.add(c);
		skills1.add(sql);
		skills1.add(git);
		String bac = "BAC";
		String licence = "Licence de Psychologie";
		ArrayList<Certificate> certificates = new ArrayList<Certificate>();
		//TODO update
//		certificates.add(bac);
//		certificates.add(licence);
		user.setSkills(skills1);
		user.setCertificates(certificates);
		
		DefaultTableModel model = new DefaultTableModel(); 	
		model.addColumn("Compétences");
		model.addColumn("Niveau");
		for (int i = 0 ; i <= user.getSkills().size() - 1; i++) {
			model.addRow(new Object[]{user.getSkills().get(i).getSkill_name(), user.getSkills().get(i).getOwns()});
			
			}
		view.getTableSkill().setModel(model);

		
		ViewUtils.showTable(view, view.getTableCertificates(), certificates);
		ViewUtils.editText(view, view.getEditTxtAddress(), view.getTextFieldAddress());
		ViewUtils.editText(view, view.getEditTxtName(), view.getTextFieldName());
		ViewUtils.editText(view, view.getEdittxtLinkWebSite(), view.getTextFieldLinkWebSite());
		ViewUtils.editText(view, view.getEditTxtPhone(), view.getTextFieldPhone());
		ViewUtils.editText(view, view.getEditDescription(), view.getTxtrDescription());
		ViewUtils.editText(view, view.getEditTxtLinkLinkedin(), view.getTextFieldLinkLinkedin());
		ViewUtils.editTable(view, view.getEditSkillList(), view.getTableSkill());
		ViewUtils.editTable(view, view.getEditTxtCertificates(), view.getTableCertificates());
		ViewUtils.editText(view, view.getEditTxtCertificates(), view.getTxtCertificatesInProgress());
		
	}
}
