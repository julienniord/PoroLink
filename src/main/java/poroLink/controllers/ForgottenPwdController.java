package poroLink.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Pattern;

import javax.swing.JFrame;

import poroLink.database.AppUserDAO;
import poroLink.managers.ViewsManager;
import poroLink.views.ForgottenPwdView;

public class ForgottenPwdController extends BaseController {

	private JFrame frame;
	private ForgottenPwdView view;

	public ForgottenPwdController(JFrame frame) {
		super();
		super.frame = frame;
		super.view = new ForgottenPwdView(this.frame);
		
	}

	@Override
	public void initEvent() {
		ForgottenPwdView view = (ForgottenPwdView) super.view;
		
		view.getBtnValidate().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				AppUserDAO dao = new AppUserDAO();
				ResultSet rs = dao.executeRequest("SELECT * FROM AppUser WHERE mail = '" + view.getMailText().getText() + "'");
				
				if (Pattern.matches("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)+$", view.getMailText().getText())){
					try {
						if (rs.next()) {
						ViewsManager.getInstance().next(new ConnectionController(frame));
						}else {
							view.getFailLabel().setText("Cette adresse mail est inconnue.");
							view.getFailLabel().setVisible(true);
							view.getContentPane().repaint();
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else{
					view.getFailLabel().setText("Adresse mail non valide.");
					view.getFailLabel().setVisible(true);
					view.getContentPane().repaint();
				}
			}
		});
	}
}
