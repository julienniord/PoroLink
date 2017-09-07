package poroLink.controllers;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

import poroLink.entities.Candidate;
import poroLink.entities.Certificate;
import poroLink.entities.Post;
import poroLink.entities.Skill;
import poroLink.utils.views.ViewUtils;
import poroLink.views.ConnectionView;
import poroLink.views.MatchingResultView;
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
		view = (ProfileCandidateView) super.view;
		

		
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
		*/
		
		if((((Candidate)this.viewDatas.get("currentUser")).getLastname()!=null) && (((Candidate)this.viewDatas.get("currentUser")).getFirstname()!=null)){
			view.getTextFieldName().setText(((Candidate)this.viewDatas.get("currentUser")).getFirstname() + " " + ((Candidate)this.viewDatas.get("currentUser")).getLastname());
			}else {
				view.getTextFieldName().setText("Prénom nom");
			}
		ViewUtils.editText(view, view.getEditTxtName(), view.getTextFieldName());
		
		if((((Candidate)this.viewDatas.get("currentUser")).getLinks()!=null)){
			view.getTextFieldLinkWebSite().setText(((Candidate)this.viewDatas.get("currentUser")).getLinks());
			}else {
				view.getTextFieldLinkWebSite().setText("Site Internet");
			}
		ViewUtils.editText(view, view.getEdittxtLinkWebSite(), view.getTextFieldLinkWebSite());
		
		if((((Candidate)this.viewDatas.get("currentUser")).getPhone()!=null)){
			view.getTextFieldPhone().setText(((Candidate)this.viewDatas.get("currentUser")).getPhone());
			}else {
				view.getTextFieldPhone().setText("Telephone");
			}
		ViewUtils.editText(view, view.getEditTxtPhone(), view.getTextFieldPhone());
		
		if((((Candidate)this.viewDatas.get("currentUser")).getPresentation()!=null)){
			view.getTxtrPresentation().setText(((Candidate)this.viewDatas.get("currentUser")).getPresentation());
			}else {
				view.getTxtrPresentation().setText("Presentation");
			}
		ViewUtils.editText(view, view.getEditPresentation(), view.getTxtrPresentation());
		
		if((((Candidate)this.viewDatas.get("currentUser")).getLinks()!=null)){
			view.getTextFieldLinkLinkedin().setText(((Candidate)this.viewDatas.get("currentUser")).getLinks());
			}else {
				view.getTextFieldPhone().setText("Lien Linkedin");
			}
		ViewUtils.editText(view, view.getEditTxtLinkLinkedin(), view.getTextFieldLinkLinkedin());
		/*
		 TODO;
		if((((Candidate)this.viewDatas.get("currentUser")).getPhone()!=null)){
			view.getTextFieldPhone().setText(((Candidate)this.viewDatas.get("currentUser")).getPhone());
			}else {
				view.getTextFieldPhone().setText("Telephone");
			}
		ViewUtils.editTable(view, view.getEditSkillList(), view.getTableSkill());
		*/
		/*
		 TODO
		 
		if((((Candidate)this.viewDatas.get("currentUser")).getPhone()!=null)){
			view.getTextFieldPhone().setText(((Candidate)this.viewDatas.get("currentUser")).getPhone());
			}else {
				view.getTextFieldPhone().setText("Telephone");
			}
		ViewUtils.editTable(view, view.getEditTxtCertificates(), view.getTableCertificates());
		*/
		
		if((((Candidate)this.viewDatas.get("currentUser")).getCertificate_in_progress()!=null)){
			view.getTxtCertificatesInProgress().setText(((Candidate)this.viewDatas.get("currentUser")).getCertificate_in_progress());
			}else {
				view.getTextFieldPhone().setText("Diplome en cours");
			}
		ViewUtils.editText(view, view.getEditTxtCertificates(), view.getTxtCertificatesInProgress());
		
	}
	

}
