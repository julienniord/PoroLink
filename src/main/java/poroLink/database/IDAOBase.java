
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
	public BaseEntity insert(BaseEntity item);
	public int update(BaseEntity item);
	public int delete(BaseEntity item);
	public int deleteAll();
	public BaseEntity get(double id);
	public List<BaseEntity> get();
	public BaseEntity executePreparedStatement(BaseEntity item, String request);
	
}
