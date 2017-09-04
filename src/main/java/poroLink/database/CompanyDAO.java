package poroLink.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import poroLink.entities.Company;
import poroLink.entities.base.BaseEntity;

public class CompanyDAO extends BaseDAO{
	
	public static final String TABLE = "Company";
	public static final String ID = "appuser_id";
	public static final String NAME = "company_name";
	public static final String ADDRESS = "address";
	public static final String DESCRIPTION = "description";
	public static final String LINKS = "links";
	public static final String SIRET = "siret";
	public static final String POSTS = "posts";
	private static final String PHONE = "phone";


	public CompanyDAO() {
		super(TABLE, ID);
		// TODO Auto-generated constructor stub
	}

	
	/* (non-Javadoc)
	 * @see poroLink.database.IDAOBase#parse(java.sql.ResultSet)
	 */
	@Override
	public BaseEntity parseResultSetToObject(ResultSet rs) {
		Company company = new Company();
		
		try {
			company.setId(rs.getDouble(ID));
			company.setCompany_name(rs.getString(NAME));
			company.setAddress(rs.getString(ADDRESS));
			company.setDescription(rs.getString(DESCRIPTION));
			company.setLinks(rs.getString(LINKS));
			company.setSiret(rs.getString(SIRET));
			company.setPhone(rs.getInt(PHONE));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			company = null;
		}
		
		return company;
	}
	
	@Override
	public String parseInsert(BaseEntity item) {
		Company company = (Company) item;

		String result = "'" + company.getCompany_name() + "',";
		result += "'" + company.getAddress() + "',";
		result += "'" + company.getDescription() + "',";
		result += "'" + company.getLinks() + "',";
		result += "'" + company.getSiret() + "',";
		result += "'" + company.getId() + "',";
		result += "'" + company.getPhone() + "'";
		

		return result;
	}

	@Override
	public String parseUpdate(BaseEntity item) {
		String result = "";
		Company company = (Company) item;

		result += NAME + " = '" + company.getCompany_name() + "'";
		result += ADDRESS + " = '" + company.getAddress() + "'";
		result += DESCRIPTION + " = '" + company.getDescription() + "'";
		result += LINKS + " = '" + company.getLinks() + "'";
		result += SIRET + " = '" + company.getSiret() + "'";
		result += PHONE + " = '" + company.getPhone() + "'";
		return result;
	}

}
