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
		Company company = (Company) this.viewDatas.get(CURRENTUSER);
		
			for(int i=0;i<company.getPosts().size();i++) {
				((MatchingView) getView()).getComboBoxPosts().addItem(company.getPosts().get(i));	
		}
			
		((MatchingView) getView()).getComboBoxPosts().setRenderer(
				new ListCellPostRender());
	
		((MatchingView) getView()).getMenuBar().getNavigationBar().setupEvents();

		((MatchingView) getView())
				.getMenuBar()
				.getButtonProfil()
				.setText(
						company.getCompany_name());
	
	}
	
	public void setupDatas() {
		this.viewDatas.put(CURRENTPOST, post);
	}
}
	
