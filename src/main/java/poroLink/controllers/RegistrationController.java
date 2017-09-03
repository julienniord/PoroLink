package poroLink.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.Calendar;
import java.util.regex.Pattern;

import javax.swing.JFrame;

import poroLink.entities.AppUser;
import poroLink.entities.Candidate;
import poroLink.entities.Company;
import poroLink.entities.Role;
import poroLink.managers.ViewsManager;
//import poroLink.database.AppUserDAO;
import poroLink.views.RegistrationView;

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
					if(Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$", new String((view.getPwdText()).getPassword()))){
						if(new String((view.getPwdText()).getPassword()).equals(new String((view.getValidPwdText()).getPassword()))){
							if(view.getCompanyRadioButton().isSelected()){
								if(view.getSiretText().getText().isEmpty() == false){
									if(view.getSiretText().getText().length()==14){
										Calendar currenttime = Calendar.getInstance();
										AppUser user = new AppUser(view.getMailText().getText(),new String((view.getPwdText()).getPassword()),new Date((currenttime.getTime()).getTime()),new Date((currenttime.getTime()).getTime()),Role.CANDIDATE);
										Company company = new Company();
										//AppUserDAO dao = new AppUserDAO();
										//dao.insert(user);ViewsManager.getInstance().next(new ProfileCompanyController(frame));
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
										AppUser user = new AppUser(view.getMailText().getText(),new String((view.getPwdText()).getPassword()),new Date((currenttime.getTime()).getTime()),new Date((currenttime.getTime()).getTime()),Role.COMPANY);
										Candidate candidate = new Candidate();
										//AppUserDAO dao = new AppUserDAO();
										//dao.insert(user);
										ViewsManager.getInstance().next(new ProfileCandidateController(frame));
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
													+ " un caractère spécial et doit faire 8 caractères minimum.");
						view.getFailLabel().setVisible(true);
						view.getContentPane().repaint();
					}
				} else {
					view.getFailLabel().setText("Veuillez entrez une adresse mail valide !");
					view.getFailLabel().setVisible(true);
					view.getContentPane().repaint();
				}
				
			}
		});
	}

}
