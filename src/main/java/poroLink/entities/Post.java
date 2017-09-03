package poroLink.entities;

import java.util.List;

import poroLink.entities.base.BaseEntity;

import java.sql.Date;

public class Post extends BaseEntity{
	

    private String post_name;
    private String presentation;
    private String mail_agent;
    private String firstname_agent;
    private String lastname_agent;
    private Date created_at;
    private Date updated_at;
    private List<Skill> Skills;
	
    /**
     * Default constructor
     */

    
    public Post(String Name) {
    	this.setPost_name(Name);
    }
    /**
	 * @return the post_id
	 */




	public Post() {
		// TODO Auto-generated constructor stub
	}




	/**
	 * @return the post_name
	 */
	public String getPost_name() {
		return post_name;
	}


	/**
	 * @param post_name the post_name to set
	 */
	public void setPost_name(String post_name) {
		this.post_name = post_name;
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
	 * @return the mail_agent
	 */
	public String getMail_agent() {
		return mail_agent;
	}



	/**
	 * @param mail_agent the mail_agent to set
	 */
	public void setMail_agent(String mail_agent) {
		this.mail_agent = mail_agent;
	}


	/**
	 * @return the firstname_agent
	 */
	public String getFirstname_agent() {
		return firstname_agent;
	}


	/**
	 * @param firstname_agent the firstname_agent to set
	 */
	public void setFirstname_agent(String firstname_agent) {
		this.firstname_agent = firstname_agent;
	}


	/**
	 * @return the lastname_agent
	 */
	public String getLastname_agent() {
		return lastname_agent;
	}


	/**
	 * @param lastname_agent the lastname_agent to set
	 */
	public void setLastname_agent(String lastname_agent) {
		this.lastname_agent = lastname_agent;
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
	 * @return the skills
	 */
	public List<Skill> getSkills() {
		return Skills;
	}



	/**
	 * @param skills3 the skills to set
	 */
	public void setSkills(List<Skill> skills3) {
		Skills = skills3;
	}

	
    



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return post_name;
	}






}
