package poroLink.controllers;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.text.JTextComponent;

import poroLink.entities.Company;
import poroLink.entities.Post;
import poroLink.entities.Skill;
import poroLink.utils.views.ViewUtils;
import poroLink.views.HomeView;
import poroLink.views.ProfileCompanyView;




/**
 * @author Minet
 *
 */
public class ProfileCompanyController extends BaseController{
	private ProfileCompanyView view;
	private Company user;
	private JFrame frame;

	public ProfileCompanyController(JFrame frame) {
		super.frame = frame;
		super.view = new ProfileCompanyView(this.frame);
		
		user = new Company("rrr");

		/**
		 * Launch the application.
		 */
	}

	@Override
	public void initEvent() {
		// TODO Auto-generated method stub
		view = (ProfileCompanyView) super.view;
		Post poste1 = new Post("dévellopeur java");
		Post poste2 = new Post("Chef de projet java");
		poste1.setFirstname_agent("Jean-Louieon");
		poste1.setLastname_agent("Dupond");
		poste1.setMail_agent("jeanlouieondupond@yahoo.fr");
		poste2.setFirstname_agent("Thérèson");
		poste2.setLastname_agent("Dupont");
		poste2.setMail_agent("theresondupont@yahoo.fr");
		

		Skill java = new Skill("java", 5, 0);
		Skill c = new Skill("C", 3, 0);
		Skill php = new Skill("PhP", 2, 0);
		Skill sql = new Skill("SQL", 4, 0);
		Skill git = new Skill("Git", 4, 0);
		ArrayList<Skill> skills1 = new ArrayList<Skill>();
		ArrayList<Skill> skills2 = new ArrayList<Skill>();
		skills1.add(c);
		skills1.add(sql);
		skills1.add(git);
		skills2.add(java);
		skills2.add(php);
		skills2.add(sql);

		poste1.setPresentation("Bla bla bla, bla bla bla, bli bla bli" + "/n" + "bla bli bla blo bla bli");
		poste1.setSkills(skills1);
		poste2.setPresentation("Je désire trouver une jeune femme blonde a forte poitrine pour le travail");
		poste2.setSkills(skills2);
		ArrayList<Post> post = new ArrayList<Post>();
		post.add(poste1);
		post.add(poste2);
		
		
		for (int i = 0 ; i < post.size(); i++) {
			view.getComboBox().addItem(post.get(i)
					);
		}
		view.getComboBox().setSelectedIndex(0);
		
		
		Company company1 = new Company("Ma comp");
		company1.setPosts(post);
		ViewUtils.editText(view, view.getEditAddress(), view.getTxtAddress());
		ViewUtils.editText(view, view.getEditName(), view.getTxtNomEntreprise());
		ViewUtils.editText(view, view.getEditLinkWebSite(), view.getTxtLienSiteEntreprise());
		ViewUtils.editText(view, view.getEditPhone(), view.getTxtTlphone());
		ViewUtils.editText(view, view.getEditDescription(), view.getTxtrDescription());
		ViewUtils.editText(view, view.getEditLinkedinLink(), view.getTxtLienLinkedin());
		ViewUtils.editText(view, view.getEditPost(), view.getTxtRecruteurCoordonnee());
		ViewUtils.editText(view, view.getEditPost(), view.getTxtDescriptionPost());
		ViewUtils.showPost(view, view.getComboBox(), view.getTxtDescriptionPost(), view.getTxtRecruteurCoordonnee(), view.getTable());
		ViewUtils.editTable(view, view.getEditSkillList(), view.getTable());
		view.getComboBox().setRenderer(new DefaultListCellRenderer() {
			public Component getListCellRendererComponent(JList<?> list, Object value,
					int index, boolean isSelected, boolean cellHasFocus) {
				super.getListCellRendererComponent(list, value, index, isSelected,
						cellHasFocus);
				Post post = (Post) value;
				setText(post.getPost_name());
				return this;
			}
		});
	}

}
