/**
 * 
 */
package poroLink.database;

import java.sql.ResultSet;
import java.util.List;

import poroLink.entities.base.BaseEntity;

/**
 * @author Minet
 *
 */
public interface IDAOBase {
	public ResultSet executeRequest(String Request);
	public int executeRequestUpdate(String Request);
	public BaseEntity parseResultSetToObject (ResultSet rs);
	public String parseInsert (BaseEntity item);
	public String parseUpdate (BaseEntity item);
	public void insert(BaseEntity item);
	public void update(BaseEntity item);
	public void delete(BaseEntity item);
	public void deleteAll();
	public BaseEntity get(double id);
	public List<BaseEntity> get();
	public BaseEntity executePreparedStatement(BaseEntity item, String request);
	
}
