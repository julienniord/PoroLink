package poroLink.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;

import poroLink.database.AppUserDAO;
import poroLink.entities.Candidate;
import poroLink.entities.Company;
import poroLink.managers.ViewsManager;
import poroLink.views.ConnectionView;

public class ConnectionController extends BaseController {

	private JFrame frame;

	public ConnectionController(JFrame frame) {
		super();
		super.frame = frame;
		super.view = new ConnectionView(frame);
	}

	private AppUserDAO dao = new AppUserDAO();

	/*
	 * (non-Javadoc)
	 * 
	 * @see poroLink.controllers.IBaseController#initEvent()
	 */
	@Override
	public void initEvent() {

		ConnectionView view = (ConnectionView) super.view;

		view.getBtnConnection().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				ResultSet rs = dao.executeRequest("SELECT * FROM AppUser WHERE mail = '" + view.getMailText().getText() + "'");
				try {
					if (rs.next()) {
						checkPassword(rs, view);
					} else {
						view.getFailLabel().setText("Cet utilisateur n'existe pas !");
						view.getFailLabel().setVisible(true);
						view.getContentPane().repaint();
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}

		});
		view.getBtnRegistration().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				view.getBtnRegistration().setContentAreaFilled(false);
				ViewsManager.getInstance().next(new RegistrationController(frame));
			}
		});

		view.getForgottenPwdLabel().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ViewsManager.getInstance().next(new ForgottenPwdController(frame));
			}

		});

	}

	/**
	 * This function select the next view in function of the role of the current
	 * user after his registration
	 * 
	 * @param rs,
	 *            this is the result of a SQL request who select the user with
	 *            his mail and password
	 * @throws SQLException
	 */
	private void nextView(ResultSet rs, JFrame frame) throws SQLException {
		if (rs.getString(dao.ROLE_APPUSER).equals("CANDIDATE")) {
			ViewsManager.getInstance().next(new ProfileCandidateController(frame));
		} else if (rs.getString(dao.ROLE_APPUSER).equals("COMPANY")) {
			ViewsManager.getInstance().next(new ProfileCompanyController(frame));

		}
	}

	/**
	 * This function check if the password enter by the current user
	 * corresponding to the password attached to this mail address in the
	 * database.
	 * 
	 * @param rs,
	 *            this is the result of a SQL request who select the user with
	 *            his mail and password
	 * @param view
	 *            Corresponding to the current view. Use to catch the password
	 *            enter by the current user
	 * @throws SQLException
	 */
	private void checkPassword(ResultSet rs, ConnectionView view) throws SQLException {
		if (new String(view.getPwd().getPassword()).equals(rs.getString(dao.PASSWORD))) {
			nextView(rs, this.frame);
		} else {
			view.getFailLabel().setText("Mot de passe incorrect !");
			view.getFailLabel().setVisible(true);
			view.getContentPane().repaint();
		}

	}

	@Override
	public void setupDatas() {
		ConnectionView view = (ConnectionView) super.view;
		view.getBtnConnection().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Candidate reset = new Candidate();
				viewDatas.put(CURRENTUSER, reset);
				ResultSet rs = dao
						.executeRequest("SELECT * FROM AppUser WHERE mail = '" + view.getMailText().getText() + "'");
				try {
					if (rs.next()) {
						if (rs.getString(dao.ROLE_APPUSER).equals("CANDIDATE")) {
							Candidate user = (Candidate) dao.getFromConnexion(view.getMailText().getText(),
									new String(view.getPwd().getPassword()));
							viewDatas.put(CURRENTUSER, user);
						}
						if (rs.getString(dao.ROLE_APPUSER).equals("COMPANY")) {
							Company user = (Company) dao.getFromConnexion(view.getMailText().getText(),
									new String(view.getPwd().getPassword()));
							viewDatas.put(CURRENTUSER, user);
						}
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
	}
}
