/**
 * 
 */
package poroLink.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import poroLink.entities.base.BaseEntity;

/**
 * @author Minet
 *
 */
public abstract class BaseDAO implements IDAOBase{
	
	private String table;
	private String id;
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the table
	 */
	public String getTable() {
		return table;
	}
	
	public BaseDAO (String table, String id) {
		this.table = table;
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see poroLink.database.IDAOBase#executeRequest(java.lang.String)
	 */
	@Override
	public ResultSet executeRequest(String request) {
		ResultSet result = null; 
		try {
			Statement stmt = DBManager.getInstance().getCon().createStatement();
			result = stmt.executeQuery(request);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}



	/* (non-Javadoc)
	 * @see poroLink.database.IDAOBase#delete(poroLink.entities.base.BaseEntity)
	 */
	@Override
	public void delete(BaseEntity item) {
		executeRequest("DELETE FROM " + table + " WHERE " + id + "  = " + item.getId());
		
	}

	/* (non-Javadoc)
	 * @see poroLink.database.IDAOBase#get(double)
	 */
	@Override
	public BaseEntity get(double id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see poroLink.database.IDAOBase#get()
	 */
	@Override
	public List<BaseEntity> get() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
