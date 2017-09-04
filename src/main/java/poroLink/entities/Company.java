package poroLink.entities;

import java.util.List;

public class Company extends AppUser {

    private String company_name;
    private String address;
    private String description;
    private String links;
    private String siret;
    private List<Post> posts;
	private int phone;
	/**
     * Default constructor
     */
    public Company(String company_name) {
    	this.role_appuser = Role.COMPANY;
    	this.company_name=company_name;
    }
    
	public Company(String company_name, String address, String description, String links, String siret,
			List<Post> posts, int phone) {
		super();
		this.company_name = company_name;
		this.address = address;
		this.description = description;
		this.links = links;
		this.siret = siret;
		this.posts = posts;
		this.phone = phone;
	}

	public Company() {
		// TODO Auto-generated constructor stub
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

	public int getPhone() {
		// TODO Auto-generated method stub
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(int phone) {
		this.phone = phone;
	}



}
