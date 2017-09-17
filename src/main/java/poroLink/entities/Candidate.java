package poroLink.entities;

import java.util.ArrayList;
import java.util.List;

public class Candidate extends AppUser {


    private String firstname;
    private String lastname;
    private String phone;
    private String transport;
    private String presentation;
    private String linkLinkedin;
    private String linkGitHub;    
    private List<Certificate> certificates;
    private String certificate_in_progress;
    private int purcentcompatibility;
    private List<Skill> skills;
	
    public Candidate() {
    	super();
    	this.role_appuser=Role.CANDIDATE;
    	this.skills = new ArrayList<Skill>();
    }
    
    /**
     * Default constructor
     */
    public Candidate(int id,String firstname,String lastname) {
    	super();
    	this.role_appuser=Role.CANDIDATE;
    	this.firstname=firstname;
    	this.lastname=lastname;
    }


	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the transport
	 */
	public String getTransport() {
		return transport;
	}

	/**
	 * @param transport the transport to set
	 */
	public void setTransport(String transport) {
		this.transport = transport;
	}

	/**
	 * @return the presentation
	 */
	public String getPresentation() {
		return presentation;
	}

	/**
	 * @param presentation the presentation to set
	 */
	public void setPresentation(String presentation) {
		this.presentation = presentation;
	}

	public String getLinkLinkedin() {
		return linkLinkedin;
	}

	public void setLinkLinkedin(String linkLinkedin) {
		this.linkLinkedin = linkLinkedin;
	}

	public String getLinkGitHub() {
		return linkGitHub;
	}

	public void setLinkGitHub(String linkGitHub) {
		this.linkGitHub = linkGitHub;
	}

	/**
	 * @return the certificates
	 */
	public List<Certificate> getCertificates() {
		return certificates;
	}

	/**
	 * @param certificates the certificates to set
	 */
	public void setCertificates(List<Certificate> certificates) {
		this.certificates = certificates;
	}

	/**
	 * @return the certificate_in_progress
	 */
	public String getCertificate_in_progress() {
		return certificate_in_progress;
	}

	/**
	 * @param certificate_in_progress the certificate_in_progress to set
	 */
	public void setCertificate_in_progress(String certificate_in_progress) {
		this.certificate_in_progress = certificate_in_progress;
	}

	/**
	 * @return the skills
	 */
	public List<Skill> getSkills() {
		return skills;
	}

	/**
	 * @param skills1 the skills to set
	 */
	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

	/**
	 * @return the purcentcompatibility
	 */
	public int getPurcentcompatibility() {
		return purcentcompatibility;
	}

	/**
	 * @param purcentcompatibility the purcentcompatibility to set
	 */
	public void setPurcentcompatibility(int purcentcompatibility) {
		this.purcentcompatibility = purcentcompatibility;
	}
	
	
	    public Candidate firstCandidate(List<Candidate> candidates) {
	    	Candidate candidate = candidates.get(0);
	    	int leporcentage = candidates.get(0).purcentcompatibility;
	    	for(int i=0;i<candidates.size();i++) {
				if(candidates.get(i).getPurcentcompatibility()>leporcentage) {
					candidate = candidates.get(i);
				}
	    		//System.out.println(candidatlist.get(i).getPurcentcompatibility());
			}
	    	return candidate;
	        
	    }

}