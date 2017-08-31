/**
 * 
 */
package poroLink.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import poroLink.entities.Skill;
import poroLink.entities.base.BaseEntity;

/**
 * @author Minet
 *
 */
public class SkillDAO extends BaseDAO{
	
	public static final String TABLE = "Skill";
	public static final String ID = "skill_id";
	public static final String NAME = "skill_name";

	/* (non-Javadoc)
	 * @see poroLink.database.IDAOBase#parse(java.sql.ResultSet)
	 */
	@Override
	public BaseEntity parse(ResultSet rs) {
		Skill skill = new Skill();
		
		try {
			skill.setId(rs.getDouble(ID));
			skill.setSkill_name(rs.getString(NAME));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			skill = null;
		}
		
		return skill;
	}

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
