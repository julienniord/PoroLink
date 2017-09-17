package poroLink.database;

import java.sql.ResultSet;
import java.sql.SQLException;

import poroLink.entities.Company;
import poroLink.entities.Post;
import poroLink.entities.base.BaseEntity;

public class PostDAO extends BaseDAO{
	
	public static final String TABLE = "Post";
	public static final String ID = "post_id";
	public static final String NAME = "name";
	public static final String PRESENTATION = "presentation";
	public static final String CREATED_AT = "created_at";
	public static final String UPDATED_AT = "updated_at";
	public static final String MAIL_AGENT = "mail_agent";
	public static final String FIRSTNAME_AGENT = "firstname_agent";
	public static final String LASTNAME_AGENT = "lastname_agent";


	public PostDAO() {
		super(TABLE, ID);
	}

	
	/* (non-Javadoc)
	 * @see poroLink.database.IDAOBase#parse(java.sql.ResultSet)
	 */
	@Override
	public BaseEntity parseResultSetToObject(ResultSet rs) {
		Post post = new Post();
		
		try {
			post.setId(rs.getDouble(ID));
			post.setPost_name(rs.getString(NAME));
			post.setPresentation(rs.getString(PRESENTATION));
			post.setCreated_at(rs.getDate(CREATED_AT));
			post.setUpdated_at(rs.getDate(UPDATED_AT));
			post.setMail_agent(rs.getString(MAIL_AGENT));
			post.setFirstname_agent(rs.getString(FIRSTNAME_AGENT));
			post.setLastname_agent(rs.getString(LASTNAME_AGENT));
		} catch (SQLException e) {
			e.printStackTrace();
			post = null;
		}
		
		return post;
	}
	
	@Override
	public String parseInsert(BaseEntity item) {
		String result = "null,";
		Post post = (Post) item;

		result += "'" + post.getPost_name() + "'";
		result += "'" + post.getPresentation() + "'";
		result += "'" + post.getCreated_at() + "'";
		result += "'" + post.getUpdated_at() + "'";
		result += "'" + post.getMail_agent() + "'";
		result += "'" + post.getFirstname_agent() + "'";
		result += "'" + post.getLastname_agent() + "'";

		return result;
	}

	@Override
	public String parseUpdate(BaseEntity item) {
		String result = "";
		Post post = (Post) item;

		result += NAME + " = '" + post.getPost_name() + "'";
		result += PRESENTATION + " = '" + post.getPresentation() + "'";
		result += CREATED_AT + " = '" + post.getCreated_at() + "'";
		result += UPDATED_AT + " = '" + post.getUpdated_at() + "'";
		result += MAIL_AGENT + " = '" + post.getMail_agent() + "'";
		result += FIRSTNAME_AGENT + " = '" + post.getFirstname_agent() + "'";
		result += LASTNAME_AGENT + " = '" + post.getLastname_agent() + "'";
		return result;
	}
	
	/*
	public void getPostsFromBase(Company company) {
		ResultSet rs = executeRequest("SELECT * FROM " + TABLE + " WHERE " + ID + " = " + company.getId() + ";");
		// Fetch each row from the result set
		try {
			while (rs.next()) {
			  company.getPosts().add((Post) parseResultSetToObject(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		};
	}
*/

}
