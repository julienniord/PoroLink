package poroLink.database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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

	/**
	 * this function opens a connection with the database and executes an SQL Request.
	 * It used to the select request.
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
	
	/**
	 * This function opens a connection with the database and executes an SQL Request.
	 * It used for update request.
	 */
	@Override
	public int executeRequestUpdate(String request) {
		int result = 0; 
		try {
			Statement stmt = DBManager.getInstance().getCon().createStatement();
			stmt.executeUpdate(request);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;

	}
	/**
	 * This function get the auto-generated id in the database and set it 
	 * on the item enter as parameter. It used to insert request.
	 */
	@Override
	public BaseEntity executePreparedStatement(BaseEntity item, String request) {

		try {
			PreparedStatement prest;

			prest = DBManager.getInstance().getCon()
					.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
			prest.executeUpdate();
			ResultSet rs = prest.getGeneratedKeys();
			if (rs.next()) {
				item.setId(rs.getInt(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return item;
	}


	/**
	 * This function is used to delete all the specific table
	 */
	@Override
	public int deleteAll() {
		return executeRequestUpdate("DELETE FROM " + table);
	}

	/**
	 * This function is used to delete by the id in a specific table. 
	 */
	@Override
	public int delete(BaseEntity item) {
		return executeRequestUpdate("DELETE FROM " + table + " WHERE " + id + "  = " + item.getId());	
	}

	/**
	 * This function select by id in the specific table on database. Return a item with the parseResultSetToObject.
	 */
	@Override
	public BaseEntity get(double id) {
		ResultSet rs = executeRequest("SELECT * FROM " + table + " WHERE " + this.id + " = " + id);
		BaseEntity entity = null;
		try {
			if(rs.next()) {
				entity = parseResultSetToObject(rs);
			}else
				entity=null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return entity;
	}

	/**
	 * This function select all the table and put it in a Array list of item.
	 * Return a item with the parseResultSetToObject.
	 */
	@Override
	public List<BaseEntity> get() {
		List<BaseEntity> entities = new ArrayList<BaseEntity>();
		ResultSet rs = executeRequest("SELECT * FROM " + table);
		
		try {
			while(rs.next()) {
				entities.add(parseResultSetToObject(rs));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return entities;
	}

	/**
	 * This function insert a item in the database.
	 */
	@Override
	public BaseEntity insert(BaseEntity item) {
		return executePreparedStatement(item, "INSERT INTO " + table + " VALUES( " + parseInsert(item) + ")");
		
	}

	/**
	 * This functon update and item in the database by the id.
	 */
	@Override
	public int update(BaseEntity item) {
		return executeRequestUpdate("UPDATE " + table + " SET " + parseUpdate(item) + " WHERE " + id + " = " + item.getId());
		
	}
	
	
}
