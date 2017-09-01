/**
 * 
 */
package poroLink.database;

import java.sql.ResultSet;
import java.sql.SQLException;

import poroLink.entities.Candidate;
import poroLink.entities.Skill;
import poroLink.entities.base.BaseEntity;

/**
 * @author Minet
 *
 */
public class CandidateDAO extends BaseDAO {
	public static final String TABLE = "Skill";
	public static final String ID = "skill_id";
	public static final String NAME = "skill_name";


	public CandidateDAO() {
		super(TABLE, ID);
		// TODO Auto-generated constructor stub
	}

	
	/* (non-Javadoc)
	 * @see poroLink.database.IDAOBase#parse(java.sql.ResultSet)
	 */
	@Override
	public BaseEntity parseResultSetToObject(ResultSet rs) {
		Candidate candidate = new Candidate();
		
		try {
			candidate.setId(rs.getDouble(ID));
			candidate.set (rs.getString(NAME));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			candidate = null;
		}
		
		return candidate;
	}
	
	@Override
	public String parseInsert(BaseEntity item) {
		String result = "null,";
		Candidate candidate = (Candidate) item;

		result += "'" + candidate.getSkill_name() + "'";
		

		return result;
	}

	@Override
	public String parseUpdate(BaseEntity item) {
		String result = "";
		Candidate candidate = (Candidate) item;

		result += NAME + " = '" + candidate.getCandidate_name() + "'";
		

		return result;
	}
}
