package poroLink.controllers;


import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JFrame;
import javax.swing.JList;
import poroLink.database.PostDAO;
import poroLink.entities.Company;
import poroLink.entities.Post;
import poroLink.utils.views.ViewUtils;
import poroLink.views.ProfileCompanyView;




/**
 * @author Minet
 *
 */
public class ProfileCompanyController extends BaseController{
	private ProfileCompanyView view;
	private JFrame frame;

	public ProfileCompanyController(JFrame frame) {
		super.frame = frame;
		super.view = new ProfileCompanyView(this.frame);

		/**
		 * Launch the application.
		 */
	}
	
	private PostDAO dao = new PostDAO();

	@Override
	public void initEvent() {

//		Company company = (Company) this.viewDatas.get(CURRENTUSER);
//		
//		for (int i = 0 ; i < company.getPosts().size(); i++) {
//			view.getComboBox().addItem(company.getPosts().get(i)
//					);
//		}
//		view.getComboBox().setSelectedIndex(0);
//		ViewUtils.editText(view, view.getEditAddress(), view.getTxtAddress());
//		ViewUtils.editText(view, view.getEditName(), view.getTxtNomEntreprise());
//		ViewUtils.editText(view, view.getEditLinkWebSite(), view.getTxtLienSiteEntreprise());
//		ViewUtils.editText(view, view.getEditPhone(), view.getTxtTlphone());
//		ViewUtils.editText(view, view.getEditDescription(), view.getTxtrDescription());
//		ViewUtils.editText(view, view.getEditLinkedinLink(), view.getTxtLienLinkedin());
//		ViewUtils.editText(view, view.getEditPost(), view.getTxtRecruteurCoordonnee());
//		ViewUtils.editText(view, view.getEditPost(), view.getTxtDescriptionPost());
//		ViewUtils.showPost(view, view.getComboBox(), view.getTxtDescriptionPost(), view.getTxtRecruteurCoordonnee(), view.getTable());
//		ViewUtils.editTable(view, view.getEditSkillList(), view.getTable());
//		view.getComboBox().setRenderer(new DefaultListCellRenderer() {
//			public Component getListCellRendererComponent(JList<?> list, Object value,
//					int index, boolean isSelected, boolean cellHasFocus) {
//				super.getListCellRendererComponent(list, value, index, isSelected,
//						cellHasFocus);
//				Post post = (Post) value;
//				setText(post.getPost_name());
//				return this;
//			}
//		});
	}
	

}
