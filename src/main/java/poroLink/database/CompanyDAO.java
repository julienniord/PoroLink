package poroLink.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import poroLink.entities.AppUser;
import poroLink.entities.Company;
import poroLink.entities.Post;
import poroLink.entities.base.BaseEntity;
import poroLink.utils.views.ViewUtils;

public class CompanyDAO extends BaseDAO{
	
	public static final String TABLE = "Company";
	public static final String ID = "appuser_id";
	public static final String NAME = "company_name";
	public static final String ADDRESS = "address";
	public static final String DESCRIPTION = "description";
	public static final String LINKS = "links";
	public static final String SIRET = "siret";
	public static final String POSTS = "posts";
	private static final String PHONE = "phone";
	
	public static final String COMPANY_POST = "post";
	public static final String ID_POST = "post_id";


	public CompanyDAO() {
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
		Company company = new Company();
		
		try {
			company.setCompany_name(rs.getString(NAME));
			company.setAddress(rs.getString(ADDRESS));
			company.setDescription(rs.getString(DESCRIPTION));
			company.setLinks(rs.getString(LINKS));
			company.setSiret(rs.getString(SIRET));
			company.setPhone(rs.getInt(PHONE));
			company.setId(rs.getDouble(ID));
			
			loadMother(company);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			company = null;
		}
		
		return company;
	}
	
	/**
	 * Insert into the object the data of the class Company with the same id.
	 * @param candidate
	 */
	public void loadMother(Company company) {
		AppUserDAO appUserDAO = new AppUserDAO();
		AppUser tmp =  (AppUser) appUserDAO.get(company.getId());
		
		company.setMail(tmp.getMail());
		company.setRole_appuser(tmp.getRole_appuser());
		company.setPassword(tmp.getPassword());
		company.setCreated_at(tmp.getCreated_at());
		company.setUpdated_at(tmp.getUpdated_at());
	}
	
	/**
	 * This function is used to transform an item to a String corresponding 
	 * to the SQL request of the insert.
	 */
	@Override
	public String parseInsert(BaseEntity item) {
		Company company = (Company) item;

		String result = "'" + ViewUtils.SqlTest(company.getCompany_name()) + "',";
		result += "'" + ViewUtils.SqlTest(company.getAddress()) + "',";
		result += "'" + ViewUtils.SqlTest(company.getDescription()) + "',";
		result += "'" + ViewUtils.SqlTest(company.getLinks()) + "',";
		result += "'" + ViewUtils.SqlTest(company.getSiret()) + "',";
		result += "'" + ViewUtils.SqlTest(String.valueOf(company.getPhone())) + "',";
		result += "'" + company.getId() + "'";
		
		return result;
	}

	/**
	 * This function is used to transform an item to a String corresponding 
	 * to the SQL request of the insert.
	 */
	@Override
	public String parseUpdate(BaseEntity item) {
		String result = "";
		Company company = (Company) item;

		result += NAME + " = '" + company.getCompany_name() + "'";
		result += ADDRESS + " = '" + company.getAddress() + "'";
		result += DESCRIPTION + " = '" + company.getDescription() + "'";
		result += LINKS + " = '" + company.getLinks() + "'";
		result += SIRET + " = '" + company.getSiret() + "'";
		result += PHONE + " = '" + company.getPhone() + "'";
		return result;
	}
	
	/**
	 * Select the post of the Company and put them in a arrayList. 
	 * @param candidate
	 * @return
	 */
	public Company getPosts(Company company) {
		ResultSet rs = executeRequest("SELECT * FROM " + COMPANY_POST
				+ " WHERE " + ID + " = " + company.getId());
		List<Double> postsId = new ArrayList<Double>();
		try {
			while (rs.next()) {
				postsId.add(rs.getDouble(ID_POST));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		BaseDAO postDAO = new PostDAO();

		for (Double id : postsId) {
			company.getPosts().add((Post) postDAO.get(id));
		}

		return company;
	}

	/**
	 * Insert the arrayList of post in the database.
	 * @param candidate
	 * @return
	 */
	public int insertPosts(Company company) {
		int result = 0;
		deletePosts(company);
		for (Post post : company.getPosts()) {
			result += executeRequestUpdate("INSERT INTO " + COMPANY_POST
					+ " VALUES(" + company.getId() + "," + post.getId()
					+ ")");
		}
		return result;
	}

	/**
	 * Delete all posts
	 *  of the database with id.
	 * @param candidate
	 * @return
	 */
	public int deletePosts(Company company) {
		return executeRequestUpdate("DELETE FROM " + COMPANY_POST + " WHERE "
				+ ID + " = " + company.getId());
	}

}
