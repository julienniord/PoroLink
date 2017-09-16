package poroLink.controllers;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;

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
		Candidate candidat = (Candidate) this.viewDatas.get(CURRENTUSER);

		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Compétences");
		model.addColumn("Niveau");

		/*
		 * for (int i = 0 ; i <= user.getSkills().size() - 1; i++) { model.addRow( new
		 * Object[]{( (Candidate)
		 * this.viewDatas.get(CURRENTUSER)).getSkills().get(i).getSkill_name(),
		 * ((Candidate) this.viewDatas.get(CURRENTUSER)).getSkills().get(i).getOwns()
		 * }); } view.getTableSkill().setModel(model);
		 * 
		 * 
		 * ViewUtils.showTable(view, view.getTableCertificates(), certificates);
		 */


		ImplementProfile(view.getTextFieldName(), candidat.getFirstname()+candidat.getLastname());
		ViewUtils.editText(view, view.getEditTxtName(), view.getTextFieldName());

		ImplementProfile(view.getTextFieldLinkWebSite(), candidat.getLinks());
		ViewUtils.editText(view, view.getEdittxtLinkWebSite(),
		view.getTextFieldLinkWebSite());

		ImplementProfile(view.getTextFieldPhone(), candidat.getPhone());
		ViewUtils.editText(view, view.getEditTxtPhone(), view.getTextFieldPhone());

		ImplementProfile(view.getTxtrPresentation(), candidat.getPresentation());
		ViewUtils.editText(view, view.getEditPresentation(),
		view.getTxtrPresentation());

		ImplementProfile(view.getTextFieldAddress(), candidat.getMail());
		ViewUtils.editText(view, view.getEditTxtAddress(),
		view.getTextFieldAddress());

		ImplementProfile(view.getTextFieldLinkLinkedin(), candidat.getLinks());
		 ViewUtils.editText(view, view.getEditTxtLinkLinkedin() , view.getTextFieldLinkLinkedin());


	}

	public void ImplementProfile(JTextComponent component, String string) {
		if (!string.equals("")) {
			component.setText(string);
		} else {
			component.setText("BITE");
		}
	}
}
