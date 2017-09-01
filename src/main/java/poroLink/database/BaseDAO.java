/**
 * coucou
 */
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
	/*
	 * (non-Javadoc)
	 *
	 * @see imiepoecjava2017.database.IDAOBase#executeRequest(java.lang.String)
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return item;
	}


	/* (non-Javadoc)
	 * @see poroLink.database.IDAOBase#deleteAll()
	 */
	@Override
	public void deleteAll() {
		executeRequest("DELETE FROM " + table);
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
		ResultSet rs = executeRequest("SELECT *  FROM " + table + "WHERE " + this.id + " = " + id);
		BaseEntity entity = null;
		try {
			rs.next();
			entity = parseResultSetToObject(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return entity;
	}

	/* (non-Javadoc)
	 * @see poroLink.database.IDAOBase#get()
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

	/* (non-Javadoc)
	 * @see poroLink.database.IDAOBase#insert(poroLink.entities.base.BaseEntity)
	 */
	@Override
	public void insert(BaseEntity item) {
		executeRequestUpdate("INSERT INTO " + table + " VALUES( " + parseInsert(item) + ")");
		
	}

	/* (non-Javadoc)
	 * @see poroLink.database.IDAOBase#update(poroLink.entities.base.BaseEntity)
	 */
	@Override
	public void update(BaseEntity item) {
		// TODO Auto-generated method stub
		
	}
	
	
}
