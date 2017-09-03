/**
 * 
 */
package poroLink.database;

import java.sql.ResultSet;
import java.sql.SQLException;

import poroLink.entities.Candidate;
import poroLink.entities.base.BaseEntity;

/**
 * @author Minet
 *
 */
public class CandidateDAO extends BaseDAO {
	public static final String TABLE = "candidate";
	public static final String ID = "appuser_id";
	public static final String GENDER = "gender";
	public static final String FIRSTNAME = "firstname";
	public static final String LASTNAME = "lastname";
	public static final String PHONE = "phone";
	public static final String BIRTHDATE = "birthdate";
	public static final String TRANSPORT = "transport";
	public static final String PRESENTATION = "presentation";
	public static final String LINKS = "links";
	public static final String CERTIFICATES = "cetificates";
	public static final String CERTIFICATES_IN_PROGRESS = "certificates_in_progress";


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
			candidate.setFirstname(rs.getString(FIRSTNAME));
			candidate.setLastname(rs.getString(LASTNAME));
			candidate.setPhone(rs.getString(PHONE));
			candidate.setBirthdate(rs.getDate(BIRTHDATE));
			candidate.setTransport(rs.getString(TRANSPORT));
			candidate.setPresentation(rs.getString(PRESENTATION));
			candidate.setLinks(rs.getString(LINKS));
			//candidate.setCertificates(rs.getString(CERTIFICATES));
			candidate.setCertificate_in_progress(rs.getString(CERTIFICATES_IN_PROGRESS));
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

		result += "'" + candidate.getFirstname() + "',";
		result += "'" + candidate.getLastname() + "',";
		result += "'" + candidate.getPhone() + "',";
		result += "'" + candidate.getBirthdate() + "',";
		result += "'" + candidate.getTransport() + "',";
		result += "'" + candidate.getPresentation() + "',";
		result += "'" + candidate.getLinks() + "',";
		result += "'" + candidate.getCertificates() + "',";
		result += "'" + candidate.getCertificate_in_progress() + "',";
		result += "'" + candidate.getId() + "'";
		

		return result;
	}

	@Override
	public String parseUpdate(BaseEntity item) {
		String result = "";
		Candidate candidate = (Candidate) item;

		result += FIRSTNAME + " = '" + candidate.getFirstname() + "',";
		result += LASTNAME + " = '" + candidate.getLastname() + "',";
		result += PHONE + " = '" + candidate.getPhone() + "',";
		result += BIRTHDATE + " = '" + candidate.getBirthdate() + "',";
		result += TRANSPORT + " = '" + candidate.getTransport() + "',";
		result += PRESENTATION + " = '" + candidate.getPresentation() + "',";
		result += LINKS + " = '" + candidate.getLinks() + "',";
		result += CERTIFICATES + " = '" + candidate.getCertificates() + "',";
		result += CERTIFICATES_IN_PROGRESS + " = '" + candidate.getCertificate_in_progress() + "'";
		
		

		return result;
	}
}
