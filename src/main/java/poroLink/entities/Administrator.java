package poroLink.entities;

public class Administrator extends AppUser {

	private String administrator_name;
	
    public Administrator() {
    	super();
    	this.role_appuser=0;
    }

	/**
	 * @return the administrator_name
	 */
	public String getAdministrator_name() {
		return administrator_name;
	}

	/**
	 * @param administrator_name the administrator_name to set
	 */
	public void setAdministrator_name(String administrator_name) {
		this.administrator_name = administrator_name;
	}


    

}