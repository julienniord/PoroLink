package poroLink.database;

import java.sql.ResultSet;
import java.sql.SQLException;

import poroLink.entities.Certificate;
import poroLink.entities.base.BaseEntity;

public class CertificateDAO extends BaseDAO{

		public static final String TABLE = "certificate";
		public static final String ID = "id_certif";
		public static final String NAME = "certification";


		public CertificateDAO() {
			super(TABLE, ID);
			// TODO Auto-generated constructor stub
		}
		
		/* (non-Javadoc)
		 * @see poroLink.database.IDAOBase#parse(java.sql.ResultSet)
		 */
		@Override
		public BaseEntity parseResultSetToObject(ResultSet rs) {
			Certificate certificate = new Certificate();
			
			try {
				certificate.setId(rs.getDouble(ID));
				certificate.setCertificate(rs.getString(NAME));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				certificate = null;
			}
			
			return certificate;
		}
		
		@Override
		public String parseInsert(BaseEntity item) {
			String result = "null,";
			Certificate certificate = (Certificate) item;

			result += "'" + certificate.getCertificate() + "'";
			

			return result;
		}

		@Override
		public String parseUpdate(BaseEntity item) {
			String result = "";
			Certificate certificate = (Certificate) item;

			result += NAME + " = '" + certificate.getCertificate() + "'";
			

			return result;
		}

		

}
