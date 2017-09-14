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


		ViewsManager.getInstance().start();
	}
}
