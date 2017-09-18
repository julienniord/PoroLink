package poroLink.database;

import java.sql.ResultSet;
import java.sql.SQLException;

import poroLink.entities.Certificate;
import poroLink.entities.base.BaseEntity;

public class CertificateDAO extends BaseDAO{

		public static final String TABLE = "certificate";
		public static final String ID_CERTIF = "id_certif";
		public static final String NAME = "certificate";


		public CertificateDAO() {
			super(TABLE, ID_CERTIF);
			// TODO Auto-generated constructor stub
		}
		
		/**
		 * This function transform the ResultSet to Object. 
		 * AppUser appUser = new Candidate(); => creation of an candidate because 
		 * AppUser is abstract. But the function just set the parameter of an AppUser so 
		 * the type of the object is not important at this moment.
		 */
		@Override
		public BaseEntity parseResultSetToObject(ResultSet rs) {
			Certificate certificate = new Certificate();
			
			try {
				certificate.setId (rs.getDouble(ID_CERTIF));
				certificate.setCertificate(rs.getString(NAME));
			} catch (SQLException e) {
				e.printStackTrace();
				certificate = null;
			}
			
			return certificate;
		}
		
		/**
		 * This function is used to transform an item to a String corresponding 
		 * to the SQL request of the insert.
		 */
		@Override
		public String parseInsert(BaseEntity item) {
			String result = "null,";
			Certificate certificate = (Certificate) item;

			result += "'" + certificate.getCertificate() + "'";
			

			return result;
		}

		/**
		 * This function is used to transform an item to a String corresponding 
		 * to the SQL request of the insert.
		 */
		@Override
		public String parseUpdate(BaseEntity item) {
			String result = "";
			Certificate certificate = (Certificate) item;

			result += NAME + " = '" + certificate.getCertificate() + "'";
			

			return result;
		}

		

}
