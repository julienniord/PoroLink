/**
 * 
 */
package poroLink.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import poroLink.entities.Candidate;
import poroLink.entities.Certificate;
import poroLink.entities.Skill;
import poroLink.entities.base.BaseEntity;
import poroLink.utils.date.DateConverter;

/**
 * @author Minet
 *
 */
public class CandidateDAO extends BaseDAO {
	public static final String TABLE = "candidate";
	
	public static final String FIRSTNAME = "firstname";
	public static final String LASTNAME = "lastname";
	public static final String PHONE = "phone";
	public static final String BIRTHDATE = "birthdate";
	public static final String TRANSPORT = "transport";
	public static final String PRESENTATION = "presentation";
	public static final String LINKS = "links";
	public static final String CERTIFICATES = "cetificates";
	public static final String CERTIFICATES_IN_PROGRESS = "certificates_in_progress";
	public static final String ID = "appuser_id";
	
	public static final String CANDIDATE_SKILL = "skill";
	public static final String ID_SKILL = "skill_id";

	public static final String CANDIDATE_CERTIF = "certificate";
	public static final String ID_CERTIF = "id_certif";


	public CandidateDAO() {
		super(TABLE, ID);
	}

	
	/* (non-Javadoc)
	 * @see poroLink.database.IDAOBase#parse(java.sql.ResultSet)
	 */
	@Override
	public BaseEntity parseResultSetToObject(ResultSet rs) {
		Candidate candidate = new Candidate();
		
		try {
			candidate.setFirstname(rs.getString(FIRSTNAME));
			candidate.setLastname(rs.getString(LASTNAME));
			candidate.setPhone(rs.getString(PHONE));
			candidate.setBirthdate(rs.getDate(BIRTHDATE));
			candidate.setTransport(rs.getString(TRANSPORT));
			candidate.setPresentation(rs.getString(PRESENTATION));
			candidate.setLinks(rs.getString(LINKS));
			candidate.setCertificate_in_progress(rs.getString(CERTIFICATES_IN_PROGRESS));
			candidate.setId(rs.getDouble(ID));
			
			loadMother(candidate);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			candidate = null;
		}
		
		return candidate;
	}


	private void loadMother(Candidate candidate) {
		AppUserDAO appUserDAO = new AppUserDAO();
		Candidate tmp =  (Candidate) appUserDAO.get(candidate.getId());
		
		candidate.setMail(tmp.getMail());
		candidate.setRole_appuser(tmp.getRole_appuser());
		candidate.setPassword(tmp.getPassword());
		candidate.setCreated_at(tmp.getCreated_at());
		candidate.setUpdated_at(tmp.getUpdated_at());
	}
	
	@Override
	public String parseInsert(BaseEntity item) {
		Candidate candidate = (Candidate) item;

		String result = "'" + candidate.getFirstname() + "',";
		result += "'" + candidate.getLastname() + "',";
		result += "'" + candidate.getPhone() + "',";
		result += "'" + DateConverter.setMySqlDate(candidate.getCreated_at()) + "',";
		result += "'" + candidate.getTransport() + "',";
		result += "'" + candidate.getPresentation() + "',";
		result += "'" + candidate.getLinks() + "',";
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
	
	public Candidate getCertificate(Candidate candidate) {
		ResultSet rs = executeRequest("SELECT * FROM " + CANDIDATE_CERTIF
				+ " WHERE " + ID + " = " + candidate.getId());
		List<Double> certifsId = new ArrayList<Double>();
		try {
			while (rs.next()) {
				certifsId.add(rs.getDouble(ID_CERTIF));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		BaseDAO CertificateDAO = new CertificateDAO();

		for (Double id : certifsId) {
			candidate.getCertificates().add((Certificate) CertificateDAO.get(id));
		}

		return candidate;
	}

	public int insertCertificates(Candidate candidate) {
		int result = 0;
		deleteCertificates(candidate);
		for (Certificate certificate : candidate.getCertificates()) {
			result += executeRequestUpdate("INSERT INTO " + CANDIDATE_CERTIF
					+ " VALUES(" + candidate.getId() + "," + certificate.getId()
					+ ")");
		}
		return result;
	}

	public int deleteCertificates(Candidate candidate) {
		return executeRequestUpdate("DELETE FROM " + CANDIDATE_CERTIF + " WHERE "
				+ ID + " = " + candidate.getId());
	}
	
	
	
	public Candidate getSkills(Candidate candidate) {
		ResultSet rs = executeRequest("SELECT * FROM " + CANDIDATE_SKILL
				+ " WHERE " + ID + " = " + candidate.getId());
		List<Double> skillsId = new ArrayList<Double>();
		try {
			while (rs.next()) {
				skillsId.add(rs.getDouble(ID_SKILL));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		BaseDAO skillDAO = new SkillDAO();

		for (Double id : skillsId) {
			candidate.getSkills().add((Skill) skillDAO.get(id));
		}

		return candidate;
	}

	public int insertSkills(Candidate candidate) {
		int result = 0;
		deleteSkills(candidate);
		for (Skill skill : candidate.getSkills()) {
			result += executeRequestUpdate("INSERT INTO " + CANDIDATE_SKILL
					+ " VALUES(" + candidate.getId() + "," + skill.getId()
					+ ")");
		}
		return result;
	}

	public int deleteSkills(Candidate candidate) {
		return executeRequestUpdate("DELETE FROM " + CANDIDATE_SKILL + " WHERE "
				+ ID + " = " + candidate.getId());
	}
	
}
