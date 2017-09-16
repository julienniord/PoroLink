package poroLink.controllers;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

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

	@Override
	public void initEvent() {
		view = (ProfileCandidateView) super.view;
		

		
		DefaultTableModel model = new DefaultTableModel(); 	
		model.addColumn("Compétences");
		model.addColumn("Niveau");
		
		/*for (int i = 0 ; i <= user.getSkills().size() - 1; i++) {
			model.addRow(
					new Object[]{(
							(Candidate) this.viewDatas.get(CURRENTUSER)).getSkills().get(i).getSkill_name(), 
							((Candidate) this.viewDatas.get(CURRENTUSER)).getSkills().get(i).getOwns()
							});
		}
		view.getTableSkill().setModel(model);

		
		ViewUtils.showTable(view, view.getTableCertificates(), certificates);
		*/
		
		if((((Candidate)this.viewDatas.get(CURRENTUSER)).getLastname()!=null) && (((Candidate)this.viewDatas.get(CURRENTUSER)).getFirstname()!=null)){
			view.getTextFieldName().setText(((Candidate)this.viewDatas.get(CURRENTUSER)).getFirstname() + " " + ((Candidate)this.viewDatas.get(CURRENTUSER)).getLastname());
			}else {
				view.getTextFieldName().setText("Prénom nom");
			}
		ViewUtils.editText(view, view.getEditTxtName(), view.getTextFieldName());
		
		if((((Candidate)this.viewDatas.get(CURRENTUSER)).getLinks()!=null)){
			view.getTextFieldLinkWebSite().setText(((Candidate)this.viewDatas.get(CURRENTUSER)).getLinks());
			}else {
				view.getTextFieldLinkWebSite().setText("Site Internet");
			}
		ViewUtils.editText(view, view.getEdittxtLinkWebSite(), view.getTextFieldLinkWebSite());
		
		if((((Candidate)this.viewDatas.get(CURRENTUSER)).getPhone()!=null)){
			view.getTextFieldPhone().setText(((Candidate)this.viewDatas.get(CURRENTUSER)).getPhone());
			}else {
				view.getTextFieldPhone().setText("Telephone");
			}
		ViewUtils.editText(view, view.getEditTxtPhone(), view.getTextFieldPhone());
		
		if((((Candidate)this.viewDatas.get(CURRENTUSER)).getPresentation()!=null)){
			view.getTxtrPresentation().setText(((Candidate)this.viewDatas.get(CURRENTUSER)).getPresentation());
			}else {
				view.getTxtrPresentation().setText("Presentation");
			}
		ViewUtils.editText(view, view.getEditPresentation(), view.getTxtrPresentation());
		
		if((((Candidate)this.viewDatas.get(CURRENTUSER)).getLinks()!=null)){
			view.getTextFieldLinkLinkedin().setText(((Candidate)this.viewDatas.get(CURRENTUSER)).getLinks());
			}else {
				view.getTextFieldPhone().setText("Lien Linkedin");
			}
		ViewUtils.editText(view, view.getEditTxtLinkLinkedin(), view.getTextFieldLinkLinkedin());
		/*
		 TODO;
		if((((Candidate)this.viewDatas.get(CURRENTUSER)).getPhone()!=null)){
			view.getTextFieldPhone().setText(((Candidate)this.viewDatas.get(CURRENTUSER)).getPhone());
			}else {
				view.getTextFieldPhone().setText("Telephone");
			}
		ViewUtils.editTable(view, view.getEditSkillList(), view.getTableSkill());
		*/
		/*
		 TODO
		 
		if((((Candidate)this.viewDatas.get(CURRENTUSER)).getPhone()!=null)){
			view.getTextFieldPhone().setText(((Candidate)this.viewDatas.get(CURRENTUSER)).getPhone());
			}else {
				view.getTextFieldPhone().setText("Telephone");
			}
		ViewUtils.editTable(view, view.getEditTxtCertificates(), view.getTableCertificates());
		*/
		
		if((((Candidate)this.viewDatas.get(CURRENTUSER)).getCertificate_in_progress()!=null)){
			view.getTxtCertificatesInProgress().setText(((Candidate)this.viewDatas.get(CURRENTUSER)).getCertificate_in_progress());
			}else {
				view.getTextFieldPhone().setText("Diplome en cours");
			}
		ViewUtils.editText(view, view.getEditTxtCertificates(), view.getTxtCertificatesInProgress());
		
	}
	

}
