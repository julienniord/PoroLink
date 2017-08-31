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


	public SkillDAO() {
		super(TABLE, ID);
		// TODO Auto-generated constructor stub
	}


	public void insert(BaseEntity item) {
		// TODO Auto-generated method stub
		
	}


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
	
	/* (non-Javadoc)
	 * @see poroLink.database.IDAOBase#parse(java.sql.ResultSet)
	 */
	@Override
	public BaseEntity parseResultSetToObject(ResultSet rs) {
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
	
	@Override
	public String parseObjectToString(BaseEntity item) {
		String res = "";
		Skill skill = (Skill) item;
		res += "NULL, ";
		if (skill.getId() != 0.0) {
			res = String.valueOf(skill.getId());
			res += ", ";
		}
		res += skill.getSkill_name();
		return res;
	}

	
}
