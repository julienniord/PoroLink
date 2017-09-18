package poroLink.controllers;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import javax.swing.DefaultListCellRenderer;
import javax.swing.JFrame;
import javax.swing.JList;
import poroLink.database.CompanyDAO;
import poroLink.database.PostDAO;
import poroLink.entities.Candidate;
import poroLink.entities.Company;
import poroLink.entities.Post;
import poroLink.utils.views.ViewUtils;
import poroLink.views.ConnectionView;
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
	CompanyDAO dao = new CompanyDAO();
	PostDAO postDAO = new PostDAO();
	
	@Override
	public void initEvent() {
		
		view = (ProfileCompanyView) super.view;
		Company company = (Company) this.viewDatas.get(CURRENTUSER);
		
		company = dao.getPosts(company);
		
		
		
		List <Post> postList = company.getPosts();

		
		for (int i = 0 ; i < postList.size(); i++) {
			 postList.set(i, postDAO.getSkills(company.getPosts().get(i)));
			view.getComboBox().addItem(postList.get(i));
		}
		view.getComboBox().setSelectedIndex(0);
		

		view.getTxtNomEntreprise().setText(company.getCompany_name());
		ViewUtils.ImplementProfile(view.getTxtAddress(), company.getAddress());
		ViewUtils.editText(view, view.getEditAddress(), view.getTxtAddress());
		ViewUtils.ImplementProfile(view.getTxtNomEntreprise(), company.getCompany_name());
		ViewUtils.editText(view, view.getEditName(), view.getTxtNomEntreprise());
		ViewUtils.ImplementProfile(view.getTxtLienSiteEntreprise(), company.getLinkWebsite());
		ViewUtils.editText(view, view.getEditLinkWebSite(), view.getTxtLienSiteEntreprise());
		ViewUtils.ImplementProfile(view.getTxtTlphone(), company.getPhone());
		ViewUtils.editText(view, view.getEditPhone(), view.getTxtTlphone());
		ViewUtils.ImplementProfile(view.getTxtrDescription(), company.getDescription());
		ViewUtils.editText(view, view.getEditDescription(), view.getTxtrDescription());
		ViewUtils.ImplementProfile(view.getTxtLienLinkedin(), company.getLinkLinkedin());
		ViewUtils.editText(view, view.getEditLinkedinLink(), view.getTxtLienLinkedin());
		//ViewUtils.ImplementProfile(view.getTxtRecruteurCoordonnee(), view.getComboBox().getSelectedIndex());
		ViewUtils.editText(view, view.getEditPost(), view.getTxtRecruteurCoordonnee());
		ViewUtils.editText(view, view.getEditPost(), view.getTxtDescriptionPost());
		ViewUtils.showPost(view, view.getComboBox(), view.getTxtDescriptionPost(), view.getTxtRecruteurCoordonnee(), view.getTable());
		ViewUtils.editTable(view, view.getEditSkillList(), view.getTable());
//		ViewUtils.showTable(view, view.getTable(), skill);
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
	
	@Override
	public void initView () {
		Company company = (Company) this.viewDatas.get(CURRENTUSER);
		((ProfileCompanyView) getView()).getMenuBar().getNavigationBar().setupEvents();

		((ProfileCompanyView) getView())
				.getMenuBar()
				.getButtonProfil()
				.setText(
						company.getCompany_name());
		
		((ProfileCompanyView) getView())
		.getMenuBar()
		.getNavigationBar()
		.getBtnProfil()
		.setVisible(false);

	}
	
	public void updateUser() {
		Company company = (Company) this.viewDatas.get(CURRENTUSER);
		company.setAddress(view.getTxtAddress().getText());
		company.setCompany_name(view.getTxtNomEntreprise().getText());
		company.setDescription(view.getTxtrDescription().getText());
		company.setLinkLinkedin(view.getTxtLienLinkedin().getText());
		company.setLinkWebsite(view.getTxtLienSiteEntreprise().getText());
		company.setPhone(view.getTxtTlphone().getText());
		dao.update(company);
	}

	
//	@Override
//	public void set() {
//		EventQueue.invokeLater(new Runnable() {
//		public void run() {
//			try {
//				
////				company.setPosts(view.getComboBox().getModel());
//				dao.update(company);
//				System.out.println(company.toString());
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//	});
//		
//	}
	
	public void setupDatas() {
		ProfileCompanyView view = (ProfileCompanyView) super.view;
		view.getMenuBar().getNavigationBar().getBtnHome().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				updateUser();
			}
		});
		view.getMenuBar().getNavigationBar().getBtnDeconnection().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				updateUser();
			}
		});
	}
}
