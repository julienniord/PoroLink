/**
 * 
 */
package poroLink.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import poroLink.entities.Skill;
import poroLink.entities.base.BaseEntity;

/**
 * @author Minet
 *
 */
public class SkillDAO extends BaseDAO{
	//test jpp ta maman la pute
	public static final String TABLE = "Skill";
	public static final String ID = "skill_id";
	public static final String NAME = "skill_name";
	public static final String OWN = "skill_name";
	public static final String NEED = "skill_name";


	public SkillDAO() {
		super(TABLE, ID);
		// TODO Auto-generated constructor stub
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
	
	/**
	 * This function parse an item to a String in purpose of using it in an insert SQL query.
	 */
	@Override
	public String parseInsert(BaseEntity item) {
		String result = "null,";
		Skill skill = (Skill) item;

		result += "'" + skill.getSkill_name() + "'";
		

		return result;
	}

	/**
	 * This function parse an item to a String and add it in a part of a update SQL query.
	 */
	@Override
	public String parseUpdate(BaseEntity item) {
		String result = "";
		Skill skill = (Skill) item;

		result += NAME + " = '" + skill.getSkill_name() + "'";
		

		return result;
	}

	
}
