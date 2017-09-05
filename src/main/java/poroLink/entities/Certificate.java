package poroLink.entities;

import poroLink.entities.base.BaseEntity;

public class Certificate extends BaseEntity{

	 private String certificate;
	
	 /**
    * Default constructor
    */
	 public Certificate() {
		 
	 }
   public Certificate(String certificate) {
   	this.setCertificate(certificate);
   }
/**
 * @return the certificate
 */
public String getCertificate() {
	return certificate;
}
/**
 * @param certificate the certificate to set
 */
public void setCertificate(String certificate) {
	this.certificate = certificate;
}

	



	
}

