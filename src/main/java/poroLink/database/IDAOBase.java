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
	public BaseEntity parse (ResultSet rs);
	public void insert(BaseEntity item);
	public void update(BaseEntity item);
	public void delete(BaseEntity item);
	public void deleteAll();
	public BaseEntity get(double id);
	public List<BaseEntity> get();
	
}
