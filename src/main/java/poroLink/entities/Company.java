package poroLink.entities;

import java.util.ArrayList;
import java.util.List;

public class Company extends AppUser {

    private String company_name;
    private String address;
    private String description;
    private String siret;
    private List<Post> posts;
	private String phone;
	private String linkLinkedin;
	private String linkWebsite;
	/**
     * Default constructor
     */
    public Company(int id, String company_name) {
    	super();
    	this.role_appuser=Role.COMPANY;
    	this.company_name=company_name;
    	this.posts = new ArrayList<Post>();
    }
    
	public Company(String company_name, String address, String description, String linkLinkedin, String linkWebsite, String siret,
			List<Post> posts, String phone) {
		super();
		this.company_name = company_name;
		this.address = address;
		this.description = description;
		this.linkLinkedin = linkLinkedin;
		this.linkWebsite = linkWebsite;
		this.siret = siret;
		this.posts = posts;
		this.phone = phone;
	}*/

	public Company() {
		super();
		this.posts = new ArrayList<Post>();
		this.role_appuser=Role.COMPANY;
	}
	/**
	 * @return the company_name
	 */
	public String getCompany_name() {
		return company_name;
	}
	/**
	 * @param company_name the company_name to set
	 */
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param adress the address to set
	 */
	public void setAddress(String adress) {
		this.address = adress;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the siret
	 */
	public String getSiret() {
		return siret;
	}
	/**
	 * @param siret the siret to set
	 */
	public void setSiret(String siret) {
		this.siret = siret;
	}
	/**
	 * @return the posts
	 */
	public List<Post> getPosts() {
		return posts;
	}
	/**
	 * @param posts the posts to set
	 */
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	public String getPhone() {
		// TODO Auto-generated method stub
		return phone;
	}

	/**
	 * @param string the phone to set
	 */
	public void setPhone(String string) {
		this.phone = string;
	}

	public String getLinkLinkedin() {
		// TODO Auto-generated method stub
		return linkLinkedin;
	}

	public String getLinkWebsite() {
		// TODO Auto-generated method stub
		return linkWebsite;
	}

	/**
	 * @param linkLinkedin the linkLinkedin to set
	 */
	public void setLinkLinkedin(String linkLinkedin) {
		this.linkLinkedin = linkLinkedin;
	}

	/**
	 * @param linkWebsite the linkWebsite to set
	 */
	public void setLinkWebsite(String linkWebsite) {
		this.linkWebsite = linkWebsite;
	}
	


}
