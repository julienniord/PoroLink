package poroLink.entities;
import java.sql.Date;

import poroLink.entities.base.BaseEntity;

public class AppUser extends BaseEntity {


    protected String mail;
    private String password;
    private Date created_at;
    private Date updated_at;
    protected int role_appuser;
	
	
    /**
     * Default constructor
     */
    public AppUser() {
    	
    }
    
    
    

	public AppUser(String mail, String password, Date created_at, Date updated_at, int role_appuser) {
		super();
		this.mail = mail;
		this.password = password;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.role_appuser = role_appuser;
	}




	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the created_at
	 */
	public Date getCreated_at() {
		return created_at;
	}

	/**
	 * @param created_at the created_at to set
	 */
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	/**
	 * @return the updated_at
	 */
	public Date getUpdated_at() {
		return updated_at;
	}

	/**
	 * @param updated_at the updated_at to set
	 */
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	/**
	 * @return the role_appuser
	 */
	public int getRole_appuser() {
		return role_appuser;
	}

	/**
	 * @param role_appuser the role_appuser to set
	 */
	public void setRole_appuser(int role_appuser) {
		this.role_appuser = role_appuser;
	}

	


    


}