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
		
		
		
//		for (int i = 0 ; i < post.size(); i++) {
//			view.getComboBox().addItem(post.get(i)
//					);
//		}
//		view.getComboBox().setSelectedIndex(0);
//		
//		
//		Company company1 = new Company("Ma comp");
//		company1.setPosts(post);
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
