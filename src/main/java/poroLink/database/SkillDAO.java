/**
 * 
 */
package poroLink.database;

import java.util.List;

import poroLink.entities.base.BaseEntity;

/**
 * @author Minet
 *
 */
public class SkillDAO extends BaseDAO{
	
	public static final String TABLE = "Skill";
	public static final String ID = "id";

	public SkillDAO() {
		super(TABLE, ID);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void insert(BaseEntity item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(BaseEntity item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(BaseEntity item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BaseEntity get(double id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BaseEntity> get() {
		// TODO Auto-generated method stub
		return null;
	}

}
