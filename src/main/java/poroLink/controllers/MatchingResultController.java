package poroLink.controllers;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import poroLink.entities.Candidate;
import poroLink.entities.Post;
import poroLink.entities.Skill;
import poroLink.views.MatchingResultView;

public class MatchingResultController extends BaseController {
	
	private JFrame frame;
	private  MatchingResultView view;

	//public TreeMap<Integer,Integer> tmCandidate = new TreeMap<>();
	//List<String> list = new ArrayList<String>();
	//private ArrayList<Candidate> candidatlist;
	
	public  MatchingResultController(JFrame frame){
		super();
		super.frame = frame;
		super.view = new MatchingResultView(this.frame);
	}
	
	List<Candidate> candidatlist = new ArrayList<Candidate>();
	Candidate candidat = new Candidate();

	/**
	 * @return the candidat
	 */
	public Candidate getCandidat() {
		return candidat;
	}

	/**
	 * @param candidat the candidat to set
	 */
	public void setCandidat(Candidate candidat) {
		this.candidat = candidat;
	}

	/**
	 * @param candidatlist the candidatlist to set
	 */
	public void setCandidatlist(ArrayList<Candidate> candidatlist) {
		this.candidatlist = candidatlist;
	}

	private Object getTmCandidate;
	
	

	@Override
	public void initEvent() {
		view = (MatchingResultView) super.view;
		/*
		view.getBtnValidate().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
					//ViewsManager.getInstance().next(new MatchingResultController(frame));	
			}
		});
		*/
	}

	
	@Override
	public void initView() {
		//((MatchingResultView)getView()).getTextField().setText(((Post)this.viewDatas.get("currentPost")).getPost_name());	
		((MatchingResultView)getView()).getLblRsultatDeLa().setText("R\u00E9sultat de la recherche pour le poste : " + ((Post)this.viewDatas.get("currentPost")).getPost_name());
		
		//affichage des skills
		for(int i=0;i<((Post) this.viewDatas.get("currentPost")).getSkills().size();i++) {
			((MatchingResultView)getView()).getTextAreaSkills().setText(((MatchingResultView)getView()).getTextAreaSkills().getText()+ "\n" +((Post)this.viewDatas.get("currentPost")).getSkills().get(i).getSkill_name() + " niveau "+ ((Post)this.viewDatas.get("currentPost")).getSkills().get(i).getNeeds());
		}
		// recherche des besoins en pourcentage
		//setpurcentageneeds();
		
		
		// affichage des canditats
		for (Candidate postulant : generateCandidate()) {
			for(int i=0;i<postulant.getSkills().size();i++) {
				((MatchingResultView)getView()).getTextAreaCanditate().setText(((MatchingResultView)getView()).getTextAreaCanditate().getText()+ "\n" +(postulant.getFirstname()+" compétences : "+ postulant.getSkills().get(i).getSkill_name()+ " niveau" +postulant.getSkills().get(i).getOwns()));
				
			}
			// recherche des pourcentages des canditats
				
			candidatlist.add(compatibilite(postulant));
			
		}
		//return StudentName1.compareTo(StudentName2);
		//Collections.sort(candidatlist, getPurcentcompatibility());
		//candidatlist.sort(null);
		System.out.println(candidat.FirstCandidate(candidatlist).getFirstname());
		candidatlist.remove(candidat.FirstCandidate(candidatlist));
		System.out.println(candidat.FirstCandidate(candidatlist).getFirstname());
		/*
		for(int i=0;i<candidatlist.size();i++) {
			System.out.println(candidatlist.get(i).getPurcentcompatibility());
		}
		*/
	}	
	public Candidate compatibilite(Candidate candidate) {
		
		int purcentagecomatibility=0;
		int purcentagebesoin=0;
		int sommebesoin=0;
		
		for(int i=0;i<candidate.getSkills().size();i++) {
			purcentagecomatibility=0;
			for(int j=0;j<((Post) this.viewDatas.get("currentPost")).getSkills().size();j++) {
				sommebesoin=0;
				for(int k=0;k<((Post) this.viewDatas.get("currentPost")).getSkills().size();k++) {
						sommebesoin+=((Post)this.viewDatas.get("currentPost")).getSkills().get(k).getNeeds();	
				}
				
				purcentagebesoin=((Post)this.viewDatas.get("currentPost")).getSkills().get(j).getNeeds()*(100/sommebesoin);
				
				if(candidate.getSkills().get(i).getId()==((Post) this.viewDatas.get("currentPost")).getSkills().get(j).getId()) {
							
					switch (candidate.getSkills().get(i).getOwns()) {
					case 1:
						purcentagecomatibility+=purcentagebesoin*30/100;
					break;
					case 2:
						purcentagecomatibility+=purcentagebesoin*50/100;
					break;
					case 3:
						purcentagecomatibility+=purcentagebesoin*65/100;
					break;
					case 4:
						purcentagecomatibility+=purcentagebesoin*75/100;
					break;
					case 5:
						purcentagecomatibility+=purcentagebesoin*100/100;

					break;
					}	
				}
			}
		}
		((MatchingResultView)getView()).getTextAreaCanditate().setText(((MatchingResultView)getView()).getTextAreaCanditate().getText()+ "\n" +candidate.getFirstname()+" "+ purcentagecomatibility + " %");
			//this.tmCandidate.put(candidate.getAppuser_id(), purcentagecomatibility);
		candidate.setPurcentcompatibility(purcentagecomatibility);
		
		return candidate;
	}
	
	/**
	 * @return the tmCandidate
	 */
	

	public List<Candidate> generateCandidate() {
		
		List<Candidate> result = new ArrayList<Candidate>();
		List<Skill> skills1 = new ArrayList<Skill>();
		List<Skill> skills2 = new ArrayList<Skill>();
		
		Skill s1 = new Skill("JAVA",0,5);
		Skill s2 = new Skill("C",0,5);
		Skill s3 = new Skill("C++",0,5);
		Skill s4 = new Skill("html",0,5);
		Skill s5 = new Skill("css",0,5);
		Skill s6 = new Skill("css",0,5);
		Skill s7 = new Skill("C",0,1);
		
		skills1.add(s1);
		skills1.add(s2);
		skills1.add(s3);
		skills1.add(s6);

		skills2.add(s1);
		//skills2.add(s5);
		//skills2.add(s7);
		
		//Candidate c1 = new Candidate(1,"Jean louis","on");
		//c1.setSkills(skills1);
		
		Candidate c2 = new Candidate(2,"Carl Eric","ongh");
		c2.setSkills(skills2);
		result.add(c2);
		//result.add(c1);
		
		return result;

	}
}