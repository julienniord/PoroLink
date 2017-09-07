/**
 * 
 */
package poroLink.database;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import poroLink.entities.Administrator;
import poroLink.entities.AppUser;
import poroLink.entities.Candidate;
import poroLink.entities.Company;
import poroLink.entities.Role;
import poroLink.entities.base.BaseEntity;
import poroLink.utils.date.DateConverter;

/**
 * @author Minet
 *
 */
public class AppUserDAO extends BaseDAO {
	public static final String TABLE = "appuser";
	public static final String ID = "appuser_id";
	public static final String MAIL = "mail";
	public static final String PASSWORD = "password";
	public static final String CREATED_AT = "created_at";
	public static final String UPDATED_AT = "updated_at";
	public static final String ROLE_APPUSER = "role_appuser";

	public AppUserDAO() {
		super(TABLE, ID);
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see poroLink.database.IDAOBase#parse(java.sql.ResultSet)
	 */
	@Override
	public BaseEntity parseResultSetToObject(ResultSet rs) {
		AppUser appUser = new Candidate();

		try {
			appUser.setId(rs.getDouble(ID));
			appUser.setMail(rs.getString(MAIL));
			appUser.setPassword(rs.getString(PASSWORD));
			appUser.setCreated_at(rs.getDate(CREATED_AT));
			appUser.setUpdated_at(rs.getDate(UPDATED_AT));
			appUser.setRole_appuser(Role.valueOf(rs.getString(ROLE_APPUSER)));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			appUser = null;
		}

		return appUser;
	}

	@Override
	public String parseInsert(BaseEntity item) {
		String result = "null,";
		AppUser appUser = (AppUser) item;
		result += "'" + appUser.getRole_appuser() + "',";
		result += "'" + appUser.getMail() + "',";
		result += "'" + appUser.getPassword() + "',";
		result += "'" + DateConverter.setMySqlDate(appUser.getCreated_at()) + "',";
		result += "'" + DateConverter.setMySqlDate(appUser.getUpdated_at()) + "'";

		return result;
	}

	@Override
	public String parseUpdate(BaseEntity item) {
		String result = "";
		AppUser appUser = (AppUser) item;

		result += MAIL + " = '" + appUser.getMail() + "',";
		result += PASSWORD + " = '" + appUser.getPassword() + "',";
		result += CREATED_AT + " = '" + appUser.getCreated_at() + "',";
		result += UPDATED_AT + " = '" + appUser.getUpdated_at() + "',";
		result += ROLE_APPUSER + " = '" + appUser.getRole_appuser() + "'";

		return result;
	}

	@Override
	public BaseEntity insert(BaseEntity item) {
		super.insert(item);
		if (item instanceof Candidate) {
			CandidateDAO candidateDAO = new CandidateDAO();
			return candidateDAO.insert(item);
		}else if (item instanceof Company) {
			CompanyDAO companyDAO = new CompanyDAO();
			return companyDAO.insert(item);
		}else if (item instanceof Candidate) {
			AdministratorDAO administratorDAO = new AdministratorDAO();
			return administratorDAO.insert(item);
		}else {
			return null;
		}
	}

	public AppUser getRealAppUser(Double id) {
		AppUser result = null;

		CandidateDAO candidateDAO = new CandidateDAO();

		result = (Candidate) candidateDAO.get(id);
		if (result == null) {
			CompanyDAO companyDAO = new CompanyDAO();
			result = (Company) companyDAO.get(id);
		}
		if (result == null) {
			AdministratorDAO administratorDAO = new AdministratorDAO();
			result = (Administrator) administratorDAO.get(id);
		}

		return result;
	}
	
	public AppUser getFromConnexion(String login, String password) {
		AppUser user = null;
		
		ResultSet rs = executeRequest("SELECT * FROM "+ TABLE + " WHERE " + MAIL + " = " + "'" + login + "'" + " AND " + PASSWORD + " = " + "'" + password + "'");
		try {
			if (rs.next()) {
				user = getRealAppUser(rs.getDouble(ID));
			}
		} catch (SQLException e) {
			e.printStackTrace();
//			user= new Candidate();
//			user.setMail("???");
		}
		
		return user;
	}
}
