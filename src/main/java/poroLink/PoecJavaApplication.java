/**
 *
 */
package poroLink;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import poroLink.database.AppUserDAO;
import poroLink.database.BaseDAO;
import poroLink.database.DBManager;
import poroLink.database.SkillDAO;
import poroLink.entities.Candidate;
import poroLink.entities.Skill;
import poroLink.managers.ViewsManager;

public class PoecJavaApplication {

	public static void main(String[] args) {

//		Candidate jeanPaul = new Candidate();
//		jeanPaul.setBirthdate(new Date());
//		jeanPaul.setMail("mail@mail.mail");
//		jeanPaul.setCertificate_in_progress("jean pauliste");
//		jeanPaul.setCreated_at(new Date());
//		jeanPaul.setFirstname("jean");
//		jeanPaul.setLastname("paul");
//		jeanPaul.setPassword("yoloswag35");
//
//		AppUserDAO daoi = new AppUserDAO();
//		daoi.insert(jeanPaul);

		ViewsManager.getInstance().start();
	}
}
