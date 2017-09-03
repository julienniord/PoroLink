/**
 * 
 */
package poroLink.database;

import java.sql.ResultSet;
import java.sql.SQLException;

import poroLink.entities.Administrator;
import poroLink.entities.base.BaseEntity;

/**
 * @author Minet
 *
 */
public class AdministratorDAO extends BaseDAO {
	public static final String TABLE = "administrator";
	public static final String NAME = "administrator_name";
	public static final String ID = "administrator_id";


	public AdministratorDAO() {
		super(TABLE, ID);
		// TODO Auto-generated constructor stub
	}

	
	/* (non-Javadoc)
	 * @see poroLink.database.IDAOBase#parse(java.sql.ResultSet)
	 */
	@Override
	public BaseEntity parseResultSetToObject(ResultSet rs) {
		Administrator administrator = new Administrator();
		
		try {
			administrator.setId(rs.getDouble(ID));
			administrator.setAdministrator_name(rs.getString(NAME));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			administrator = null;
		}
		
		return administrator;
	}
	
	@Override
	public String parseInsert(BaseEntity item) {
		String result = "null,";
		Administrator administrator = (Administrator) item;

		result += "'" + administrator.getAdministrator_name() + "'";
		

		return result;
	}

	@Override
	public String parseUpdate(BaseEntity item) {
		String result = "";
		Administrator administrator = (Administrator) item;

		result += NAME + " = '" + administrator.getAdministrator_name() + "'";
		

		return result;
	}

}
