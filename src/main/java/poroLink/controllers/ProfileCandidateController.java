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
		

		
		DefaultTableModel model = new DefaultTableModel(); 	
		model.addColumn("Compétences");
		model.addColumn("Niveau");
		/*for (int i = 0 ; i <= user.getSkills().size() - 1; i++) {
			model.addRow(
					new Object[]{(
							(Candidate) this.viewDatas.get("currentUser")).getSkills().get(i).getSkill_name(), 
							((Candidate) this.viewDatas.get("currentUser")).getSkills().get(i).getOwns()
							});
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
		*/
	}
	
	public void setupDatas() {
		this.viewDatas.put("currentUser",this.viewDatas.get("currentUser"));
	}
}
