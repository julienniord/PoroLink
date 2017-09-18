package poroLink.controllers;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

import poroLink.database.CandidateDAO;
import poroLink.entities.Candidate;
import poroLink.entities.Company;
import poroLink.entities.Post;
import poroLink.entities.Skill;
import poroLink.entities.base.BaseEntity;
import poroLink.views.HomeView;
import poroLink.views.MatchingResultView;

public class MatchingResultController extends BaseController {

	private JFrame frame;

	public MatchingResultController(JFrame frame) {
		super();
		super.frame = frame;
		super.view = new MatchingResultView(this.frame);
	}

	private List<Candidate> candidatlist = new ArrayList<Candidate>();
	private Candidate candidat = new Candidate();

	/**
	 * @return the candidat
	 */
	public Candidate getCandidat() {
		return candidat;
	}

	/**
	 * @param candidat
	 *            the candidat to set
	 */
	public void setCandidat(Candidate candidat) {
		this.candidat = candidat;
	}

	/**
	 * @param candidatlist
	 *            the candidatlist to set
	 */
	public void setCandidatlist(ArrayList<Candidate> candidatlist) {
		this.candidatlist = candidatlist;
	}

	CandidateDAO dao = new CandidateDAO();

	@Override
	public void initEvent() {

	}

	@Override
	public void initView() {
		Company company = (Company) this.viewDatas.get(CURRENTUSER);
		((MatchingResultView) getView()).getMenuBar().getNavigationBar().setupEvents();

		((MatchingResultView) getView()).getMenuBar().getButtonProfil().setText(company.getCompany_name());

		// ((MatchingResultView)getView()).getTextField().setText(((Post)this.viewDatas.get(CURRENTPOST)).getPost_name());
		((MatchingResultView) getView()).getLblRsultatDeLa().setText(
				"Resultat de la recherche pour le poste : " + ((Post) this.viewDatas.get(CURRENTPOST)).getPost_name());

		// affichage des skills
		for (int i = 0; i < ((Post) this.viewDatas.get(CURRENTPOST)).getSkills().size(); i++) {
			((MatchingResultView) getView()).getTextAreaSkills()
					.setText(((MatchingResultView) getView()).getTextAreaSkills().getText() + "\n"
							+ ((Post) this.viewDatas.get(CURRENTPOST)).getSkills().get(i).getSkill_name() + " niveau "
							+ ((Post) this.viewDatas.get(CURRENTPOST)).getSkills().get(i).getNeed());
		}
		// recherche des besoins en pourcentage
		// setpurcentageneeds();

		ArrayList<Candidate> candidates = new ArrayList<Candidate>();
		List<BaseEntity> postulant = dao.get();
		for (int i = 0; i < postulant.size(); i++) {
			candidates.add(dao.getSkills((Candidate) postulant.get(i)));
		}

		// affichage des canditats

		for (int i = 0; i < candidates.size(); i++) {
			for (int j = 0; j < candidates.get(i).getSkills().size(); j++) {
				((MatchingResultView) getView()).getTextAreaCanditate()
						.setText(((MatchingResultView) getView()).getTextAreaCanditate().getText() + "\n"
								+ (candidates.get(i).getFirstname() + " compétences : "
										+ candidates.get(i).getSkills().get(j).getSkill_name() + " niveau"
										+ candidates.get(i).getSkills().get(j).getOwn()));

			}
		}
		// recherche des pourcentages des canditats
		for (int i = 0; i < candidates.size(); i++) {
			candidatlist.add(compatibilite(candidates.get(i)));
		}

	}

	public Candidate compatibilite(Candidate candidate) {

		int purcentagecomatibility = 0;
		int purcentagebesoin = 0;
		int sommebesoin = 0;

		for (int i = 0; i < candidate.getSkills().size(); i++) {
			for (int j = 0; j < ((Post) this.viewDatas.get(CURRENTPOST)).getSkills().size(); j++) {
				sommebesoin = 0;
				for (int k = 0; k < ((Post) this.viewDatas.get(CURRENTPOST)).getSkills().size(); k++) {
					sommebesoin += ((Post) this.viewDatas.get(CURRENTPOST)).getSkills().get(k).getNeed();
				}
				purcentagebesoin = ((Post) this.viewDatas.get(CURRENTPOST)).getSkills().get(j).getNeed()
						* (100 / sommebesoin);
				if (candidate.getSkills().get(i).getId() == ((Post) this.viewDatas.get(CURRENTPOST)).getSkills().get(j)
						.getId()) {

					switch (candidate.getSkills().get(i).getOwn()) {
					case 1:
						purcentagecomatibility +=( purcentagebesoin * 30 / 100);
						break;
					case 2:
						purcentagecomatibility += (purcentagebesoin * 50 / 100);
						break;
					case 3:
						purcentagecomatibility +=( purcentagebesoin * 65 / 100);
						break;
					case 4:
						purcentagecomatibility += (purcentagebesoin * 75 / 100);
						break;
					case 5:
						purcentagecomatibility += (purcentagebesoin * 100 / 100);

						break;
					}
				}
			}
		}
		((MatchingResultView) getView()).getTextAreaCanditate()
				.setText(((MatchingResultView) getView()).getTextAreaCanditate().getText() + "\n"
						+ candidate.getFirstname() + " " + purcentagecomatibility + " %");
		candidate.setPurcentcompatibility(purcentagecomatibility);

		return candidate;
	}
}