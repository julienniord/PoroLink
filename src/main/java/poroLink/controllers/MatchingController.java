package poroLink.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import poroLink.views.customrenders.ListCellPostRender;
import poroLink.entities.Candidate;
import poroLink.entities.Company;
//import poroLink.entities.*;
import poroLink.entities.Post;
import poroLink.entities.Skill;
import poroLink.managers.ViewsManager;
import poroLink.views.HomeView;
import poroLink.views.MatchingView;

public class MatchingController extends BaseController {
	private ArrayList<Post> posts;
	
	private Post post;
	/**
	 * @return the post
	 */
	public Post getPost() {
		return post;
	}

	/**
	 * @param post the post to set
	 */
	public void setPost(Post post) {
		this.post = post;
	}

	public MatchingController(JFrame frame){
		super();
		super.frame = frame;
		super.view = new MatchingView(this.frame);
		
		
	}

	@Override
	public void initEvent() {
		MatchingView view = (MatchingView) super.view;
		view.getBtnValide().addActionListener(new ActionListener() {
			/*
			
			@Override
			public void actionPerformed(ActionEvent e) {
					ViewsManager.getInstance().next(new MatchingResultController(frame));
			}
			*/
			public void actionPerformed(ActionEvent e) {
				
					post = ((Post)
					((MatchingView) getView()).getComboBoxPosts().getSelectedItem()); 
					setupDatas();
					
					ViewsManager.getInstance().next(new MatchingResultController(frame));
			}
		});
	}

	@Override
	public void initView() {
		//((MatchingView)getView()).getTextField().setText(((AppUser)this.viewDatas.get("currentUser")).getMail());
		
		for (Company user : generateUsers()) {
			for(int i=0;i<user.getPosts().size();i++) {
				((MatchingView) getView()).getComboBoxPosts().addItem(user.getPosts().get(i));
			}
			
		}
		((MatchingView) getView()).getComboBoxPosts().setRenderer(
				new ListCellPostRender());

		Company company = (Company) this.viewDatas.get(CURRENTUSER);
		((MatchingView) getView()).getMenuBar().getNavigationBar().setupEvents();

		((MatchingView) getView())
				.getMenuBar()
				.getButtonProfil()
				.setText(
						company.getCompany_name());
	
	}
	
	@Override
	public void setupDatas() {
		this.viewDatas.put("currentPost", post);
	}
	public List<Company> generateUsers() {
		List<Company> result = new ArrayList<Company>();

		List<Skill> skills1 = new ArrayList<Skill>();
		List<Skill> skills2 = new ArrayList<Skill>();
		List<Skill> skills3 = new ArrayList<Skill>();

		Skill s1 = new Skill("JAVA",5,0);
		Skill s2 = new Skill("C",2,0);
		Skill s3 = new Skill("C++",3,0);
		Skill s4 = new Skill("html",2,0);
		Skill s5 = new Skill("css",5,0);
		
		skills1.add(s1);
		skills1.add(s2);
		skills1.add(s3);

		skills2.add(s4);
		skills2.add(s5);

		skills3.add(s3);
		skills3.add(s4);
		skills3.add(s5);

		Candidate c1 = new Candidate(1,"jl","on");
		c1.setSkills(skills1);
		
		Candidate c2 = new Candidate(2,"jjj","ongh");
		c2.setSkills(skills2);



		//Company comp1 = new Company("la comp1");


		Post j1 = new Post("le podte1");
		j1.setSkills(skills1);

		Post j2 = new Post("le podte2");
		j2.setSkills(skills2);
		
		
		List<Post> posts1 = new ArrayList<Post>();
		posts1.add(j1);
		posts1.add(j2);
		
		//comp1.setPosts(posts1);
		
		/*
		comp1.getPosts().add(j1);
		comp1.getPosts().add(j2);
		*/
		//result.add(c1);
		//result.add(c2);
		//result.add(comp1);

		return result;
	}
}