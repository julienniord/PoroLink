package poroLink.entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Candidate extends AppUser {

    private boolean gender;
    private String firstname;
    private String lastname;
    private String phone;
    private Date birthdate;
    private String transport;
    private String presentation;
    private String links;
    private String certificates;
    private String certificate_in_progress;
    private List<Skill> skills;
	
    /**
     * Default constructor
     */
    public Candidate(int id,String firstname,String lastname) {
    	super();
    	this.role_appuser=1;
    	this.firstname=firstname;
    	this.lastname=lastname;
    }

	public Candidate() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the gender
	 */
	public boolean isGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(boolean gender) {
		this.gender = gender;
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
	 * @return the birthdate
	 */
	public Date getBirthdate() {
		return birthdate;
	}

	/**
	 * @param birthdate the birthdate to set
	 */
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
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

	/**
	 * @return the links
	 */
	public String getLinks() {
		return links;
	}

	/**
	 * @param links the links to set
	 */
	public void setLinks(String links) {
		this.links = links;
	}

	/**
	 * @return the certificates
	 */
	public String getCertificates() {
		return certificates;
	}

	/**
	 * @param certificates the certificates to set
	 */
	public void setCertificates(String certificates) {
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
	public void setSkills(List<Skill> skills1) {
		this.skills = skills1;
	}

    




}