package poroLink.database;

import java.sql.ResultSet;
import java.sql.SQLException;

import poroLink.entities.Administrator;
import poroLink.entities.AppUser;
import poroLink.entities.Candidate;
import poroLink.entities.Company;
import poroLink.entities.Role;
import poroLink.entities.base.BaseEntity;
import poroLink.utils.date.DateConverter;
import poroLink.utils.views.ViewUtils;

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
	}

	/**
	 * This function transform the ResultSet to Object. 
	 * AppUser appUser = new Candidate(); => creation of an candidate because 
	 * AppUser is abstract. But the function just set the parameter of an AppUser so 
	 * the type of the object is not important at this moment.
	 */
	@Override
	public BaseEntity parseResultSetToObject(ResultSet rs) {
		AppUser appUser = null;
		try {
			CandidateDAO candidateDAO = new CandidateDAO();
			ResultSet rs2 = candidateDAO.executeRequest("SELECT * FROM " + CandidateDAO.TABLE + " WHERE " + ID + " = " + rs.getDouble(ID));
			if(rs2.next()) {
				appUser = new Candidate();
			}
			CompanyDAO companyDAO = new CompanyDAO();
			ResultSet rs3 = companyDAO.executeRequest("SELECT * FROM " + CompanyDAO.TABLE + " WHERE " + ID + " = " + rs.getDouble(ID));
			if(rs3.next()) {
				appUser = new Company();
			}
			AdministratorDAO administratorDAO = new AdministratorDAO();
			ResultSet rs4 = administratorDAO.executeRequest("SELECT * FROM " + AdministratorDAO.TABLE + " WHERE " + ID + " = " + rs.getDouble(ID));
			if(rs4.next()) {
				appUser = new Administrator();
			}
			
			appUser.setId(rs.getDouble(ID));
			appUser.setMail(rs.getString(MAIL));
			appUser.setPassword(rs.getString(PASSWORD));
			appUser.setCreated_at(rs.getDate(CREATED_AT));
			appUser.setUpdated_at(rs.getDate(UPDATED_AT));
			appUser.setRole_appuser(Role.valueOf(rs.getString(ROLE_APPUSER)));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return appUser;
	}
	
	/**
	 * This function is used to transform an item to a String corresponding 
	 * to the SQL request of the insert.
	 */
	@Override
	public String parseInsert(BaseEntity item) {
		String result = "null,";
		AppUser appUser = (AppUser) item;
		result += "'" + ViewUtils.SqlTest(appUser.getRole_appuser().toString()) + "',";
		result += "'" + ViewUtils.SqlTest(appUser.getMail()) + "',";
		result += "'" + ViewUtils.SqlTest(appUser.getPassword()) + "',";
		result += "'" + DateConverter.setMySqlDate(appUser.getCreated_at()) + "',";
		result += "'" + DateConverter.setMySqlDate(appUser.getUpdated_at()) + "'";

		return result;
	}
	
	/**
	 * This function is used to transform an item to a String corresponding 
	 * to the SQL request of the insert.
	 */
	@Override
	public String parseUpdate(BaseEntity item) {
		String result = "";
		AppUser appUser = (AppUser) item;

		result += MAIL + " = '" + ViewUtils.SqlTest(appUser.getMail()) + "',";
		result += PASSWORD + " = '" + ViewUtils.SqlTest(appUser.getPassword()) + "',";
		result += CREATED_AT + " = '" + appUser.getCreated_at() + "',";
		result += UPDATED_AT + " = '" + appUser.getUpdated_at() + "',";
		result += ROLE_APPUSER + " = '" + ViewUtils.SqlTest(appUser.getRole_appuser().toString()) + "'";

		return result;
	}
	/*
	 * (non-Javadoc)
	 * @see poroLink.database.BaseDAO#insert(poroLink.entities.base.BaseEntity)
	 * The specific part of this function serve to choose the dao corresponding to
	 * the ROLE of the object.
	 */
	@Override
	public BaseEntity insert(BaseEntity item) {
		super.insert(item);
		if (item instanceof Candidate) {
			CandidateDAO candidateDAO = new CandidateDAO();
			return candidateDAO.insert(item);
		}else if (item instanceof Company) {
			CompanyDAO companyDAO = new CompanyDAO();
			return companyDAO.insert(item);
		}else if (item instanceof Administrator) {
			AdministratorDAO administratorDAO = new AdministratorDAO();
			return administratorDAO.insert(item);
		}else {
			return null;
		}
	}
	
	/**
	 * this function return an specific AppUser (Candidate, company or administrator) 
	 * with the id enter in parameter
	 * @param id
	 * @return
	 */
	public AppUser getRealAppUser(Double id) {
		AppUser result = null;

		AppUserDAO appUserDAO = new AppUserDAO();

		result = (AppUser) appUserDAO.get(id);
		if (result.getRole_appuser() == Role.COMPANY) {
			CompanyDAO companyDAO = new CompanyDAO();
			result = (Company) companyDAO.get(id);
		}
		if (result.getRole_appuser() == Role.CANDIDATE) {
			CandidateDAO candidateDAO = new CandidateDAO();
			result = (Candidate) candidateDAO.get(id);
		}

		return result;
	}
	
	/**
	 * This function get the user in the database with the address mail and the password. 
	 * It used on the connection page.
	 * @param login
	 * @param password
	 * @return
	 */
	public AppUser getFromConnexion(String login, String password) {
		AppUser user = null;
		
		ResultSet rs = executeRequest("SELECT * FROM "+ TABLE + " WHERE " + MAIL + " = " + "'" + login + "'" + " AND " + PASSWORD + " = " + "'" + password + "'");
		try {
			if (rs.next()) {
				user = getRealAppUser(rs.getDouble(ID));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return user;
	}
}
