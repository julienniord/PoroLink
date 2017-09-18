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
import poroLink.utils.views.ViewUtils;

/**
 * @author Minet
 *
 */
public class CandidateDAO extends BaseDAO {
	public static final String TABLE = "candidate";
	
	public static final String FIRSTNAME = "firstname";
	public static final String LASTNAME = "lastname";
	public static final String PHONE = "phone";
	public static final String TRANSPORT = "transport";
	public static final String PRESENTATION = "presentation";
	public static final String LINKLINKEDIN = "linkLinkedin";
	public static final String LINKGITHUB = "linkGitHub";
	public static final String CERTIFICATES = "cetificates";
	public static final String CERTIFICATE_IN_PROGRESS = "certificate_in_progress";
	public static final String ID = "appuser_id";
	public static final String GRADUATE = "graduate";
	
	public static final String CANDIDATE_SKILL = "skill";
	public static final String OWN = "own";
	public static final String MASTERIES = "indice_masteries";
	public static final String ID_SKILL = "skill_id";

	public static final String CANDIDATE_CERTIF = "certificate";
	public static final String ID_CERTIF = "id_certif";


	public CandidateDAO() {
		super(TABLE, ID);
	}

	
	/**
	 * This function transform the ResultSet to Object. 
	 * AppUser appUser = new Candidate(); => creation of an candidate because 
	 * AppUser is abstract. But the function just set the parameter of an AppUser so 
	 * the type of the object is not important at this moment.
	 */
	@Override
	public BaseEntity parseResultSetToObject(ResultSet rs) {
		Candidate candidate = new Candidate();
		
		try {
			candidate.setFirstname(rs.getString(FIRSTNAME));
			candidate.setLastname(rs.getString(LASTNAME));
			candidate.setPhone(rs.getString(PHONE));
			candidate.setTransport(rs.getString(TRANSPORT));
			candidate.setPresentation(rs.getString(PRESENTATION));
			candidate.setLinkLinkedin(rs.getString(LINKLINKEDIN));
			candidate.setLinkGitHub(rs.getString(LINKGITHUB));
			candidate.setCertificate_in_progress(rs.getString(CERTIFICATE_IN_PROGRESS));
			candidate.setId(rs.getDouble(ID));
			
			loadMother(candidate);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			candidate = null;
		}
		
		return candidate;
	}

	/**
	 * Insert into the object the data of the class Candidate with the same id.
	 * @param candidate
	 */
	private void loadMother(Candidate candidate) {
		AppUserDAO appUserDAO = new AppUserDAO();
		Candidate tmp =  (Candidate) appUserDAO.get(candidate.getId());
		
		candidate.setMail(tmp.getMail());
		candidate.setRole_appuser(tmp.getRole_appuser());
		candidate.setPassword(tmp.getPassword());
		candidate.setCreated_at(tmp.getCreated_at());
		candidate.setUpdated_at(tmp.getUpdated_at());
	}
	
	/**
	 * This function is used to transform an item to a String corresponding 
	 * to the SQL request of the insert.
	 */
	@Override
	public String parseInsert(BaseEntity item) {
		Candidate candidate = (Candidate) item;

		String result = "'" + ViewUtils.SqlTest(candidate.getFirstname()) + "',";
		result += "'" + ViewUtils.SqlTest(candidate.getLastname()) + "',";
		result += "'" + ViewUtils.SqlTest(candidate.getPhone()) + "',";
		result += "'" + ViewUtils.SqlTest(candidate.getTransport()) + "',";
		result += "'" + ViewUtils.SqlTest(candidate.getPresentation()) + "',";
		result += "'" + ViewUtils.SqlTest(candidate.getLinkLinkedin()) + "',";
		result += "'" + ViewUtils.SqlTest(candidate.getLinkGitHub()) + "',";
		result += "'" + ViewUtils.SqlTest(candidate.getCertificate_in_progress()) + "',";
		result += "'" + candidate.getId() + "'";
		
		return result;
	}
	
	/**
	 * This function is used to transform an item to a String corresponding 
	 * to the SQL request of the insert.
	 */
	@Override
	public String parseUpdate(BaseEntity item) {
		String result = "";
		Candidate candidate = (Candidate) item;

		result += FIRSTNAME + " = '" + ViewUtils.SqlTest(candidate.getFirstname()) + "',";
		result += LASTNAME + " = '" + ViewUtils.SqlTest(candidate.getLastname()) + "',";
		result += PHONE + " = '" + ViewUtils.SqlTest(candidate.getPhone()) + "',";
		result += TRANSPORT + " = '" + ViewUtils.SqlTest(candidate.getTransport()) + "',";
		result += PRESENTATION + " = '" + ViewUtils.SqlTest(candidate.getPresentation()) + "',";
		result += LINKLINKEDIN + " = '" + ViewUtils.SqlTest(candidate.getLinkLinkedin()) + "',";
		result += LINKGITHUB + " = '" + ViewUtils.SqlTest(candidate.getLinkGitHub()) + "',";
		result += CERTIFICATES + " = '" + candidate.getCertificates() + "',";
		result += CERTIFICATE_IN_PROGRESS + " = '" + ViewUtils.SqlTest(candidate.getCertificate_in_progress()) + "'";
		
		return result;
	}
	
	/**
	 * Select the certificate of the Candidate and put them in a arrayList. 
	 * @param candidate
	 * @return
	 */
	public Candidate getCertificate(Candidate candidate) {
		ResultSet rs = executeRequest("SELECT * FROM " + GRADUATE
				+ " WHERE " + ID_CERTIF + " = " + candidate.getId());
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

	/**
	 * Insert the arrayList of certificates in the database.
	 * @param candidate
	 * @return
	 */
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

	/**
	 * Delete all certificates of the database with id.
	 * @param candidate
	 * @return
	 */
	public int deleteCertificates(Candidate candidate) {
		return executeRequestUpdate("DELETE FROM " + CANDIDATE_CERTIF + " WHERE "
				+ ID + " = " + candidate.getId());
	}
	
	
	/**
	 * Select the skill of the Candidate and put them on a ArrayList
	 * @param candidate
	 * @return
	 */
	public Candidate getSkills(Candidate candidate) {
		ResultSet rs = executeRequest(
				"SELECT " + CANDIDATE_SKILL + " .*, " + OWN + "." + MASTERIES +
				" FROM " + CANDIDATE_SKILL + " LEFT JOIN " + OWN + 
					" ON " + CANDIDATE_SKILL + "." + ID_SKILL + " = " + OWN + "." + ID_SKILL + 
					" WHERE " + OWN + "." + ID + " = " + candidate.getId());
		try {
			SkillDAO skillDAO = new SkillDAO();
			while (rs.next()) {
				candidate.getSkills().add((Skill) skillDAO.parseResultSetToObjectForCandidate(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return candidate;
	}

	/**
	 * Insert the arrayList of skill in the database.
	 * @param candidate
	 * @return
	 */
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

	/**
	 * Delete all skills of the database with id.
	 * @param candidate
	 * @return
	 */
	public int deleteSkills(Candidate candidate) {
		return executeRequestUpdate("DELETE FROM " + CANDIDATE_SKILL + " WHERE "
				+ ID + " = " + candidate.getId());
	}
	
}
