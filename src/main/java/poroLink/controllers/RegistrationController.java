package poroLink.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.regex.Pattern;

import javax.swing.JFrame;

import poroLink.database.AppUserDAO;
import poroLink.database.CandidateDAO;
import poroLink.database.CompanyDAO;
import poroLink.entities.AppUser;
import poroLink.entities.Candidate;
import poroLink.entities.Company;
import poroLink.entities.Role;
import poroLink.managers.ViewsManager;
//import poroLink.database.AppUserDAO;
import poroLink.views.RegistrationView;

// daoUser.getFromConnexion(view.getMailText().getText(),new String((view.getPwdText()).getPassword()));


public class RegistrationController extends BaseController{
	
	private JFrame frame;
	private RegistrationView view;

	public RegistrationController(JFrame frame) {

		super.frame = frame;
		super.view = new RegistrationView(this.frame);
		
		
	}
	@Override
	public void initEvent() {
		view = (RegistrationView) super.view;
		
		view.getCompanyRadioButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.getSiretText().setVisible(true);
				view.getSiretLabel().setVisible(true);
			}
		});
		
		view.getCandidateRadioButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.getSiretText().setVisible(false);
				view.getSiretLabel().setVisible(false);
				view.getSiretText().setText("");
			}
		});
		
		view.getBtnRegistration().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (Pattern.matches("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)+$", view.getMailText().getText())){
					AppUserDAO dao = new AppUserDAO();
					ResultSet rs = dao.executeRequest("SELECT * FROM AppUser WHERE mail = '" + view.getMailText().getText() + "'");
					try {
						if(!(rs.next())) {
							if(Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&!+=])(?=\\S+$).{8,}$", new String((view.getPwdText()).getPassword()))){
								if(new String((view.getPwdText()).getPassword()).equals(new String((view.getValidPwdText()).getPassword()))){
									if(view.getCompanyRadioButton().isSelected()){
										if(view.getSiretText().getText().isEmpty() == false){
											if(view.getSiretText().getText().length()==14){
												Calendar currenttime = Calendar.getInstance();
												AppUserDAO daoUser = new AppUserDAO();
												AppUser company = new Company();
												company.setMail(view.getMailText().getText());
												company.setPassword(new String((view.getPwdText()).getPassword()));
												company.setCreated_at(currenttime.getTime());
												company.setUpdated_at(currenttime.getTime());
												company.setRole_appuser(Role.COMPANY);
												daoUser.insert(company);
												ViewsManager.getInstance().next(new ConnectionController(frame));
											}else {
												view.getFailLabel().setText("Le siret renseigné n'est pas valide !");
												view.getFailLabel().setVisible(true);
												view.getContentPane().repaint();
											}
										}else {
											view.getFailLabel().setText("Veuillez renseigner le siret de votre entreprise");
											view.getFailLabel().setVisible(true);
											view.getContentPane().repaint();
										}
									}else {
											if(view.getCandidateRadioButton().isSelected()){
												Calendar currenttime = Calendar.getInstance();
												AppUserDAO daoUser = new AppUserDAO();
												AppUser candidate = new Candidate();
												candidate.setMail(view.getMailText().getText());
												candidate.setPassword(new String((view.getPwdText()).getPassword()));
												candidate.setCreated_at(currenttime.getTime());
												candidate.setUpdated_at(currenttime.getTime());
												candidate.setRole_appuser(Role.CANDIDATE);
												daoUser.insert(candidate);
												ViewsManager.getInstance().next(new ConnectionController(frame));
											}else {
												view.getFailLabel().setText("Vous devez sélectionner un rôle !");
												view.getFailLabel().setVisible(true);
												view.getContentPane().repaint();
											}
									}
								} else {
									view.getFailLabel().setText("Les 2 mots de passe ne sont pas identiques !");
									view.getFailLabel().setVisible(true);
									view.getContentPane().repaint();
								}
							} else {
								view.getFailLabel().setText("Le mot de passe doit contenir au moins une minuscule, une majuscule,\n"
															+ " un chiffre, un caractère spécial et doit faire 8 caractères minimum.");
								view.getFailLabel().setVisible(true);
								view.getContentPane().repaint();
							}
						}
						else {
							view.getFailLabel().setText("Cette adresse mail est déjà connue !");
							view.getFailLabel().setVisible(true);
							view.getContentPane().repaint();
						}
					}
					catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
				else {
					view.getFailLabel().setText("Veuillez entrez une adresse mail valide !");
					view.getFailLabel().setVisible(true);
					view.getContentPane().repaint();
					
				}
			}
		});		
	}
}
