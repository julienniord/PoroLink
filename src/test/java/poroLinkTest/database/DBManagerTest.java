package poroLinkTest.database;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import poroLink.database.DBManager;
import poroLink.utils.processExecution.ProcessManager;

public class DBManagerTest {
	
	private static ProcessManager process;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		process = new ProcessManager(ProcessManager.WAMP);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		process.close();
		
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void testGetInstance() {
		/*test singleton*/
		fail("Not yet implemented");
	}

	@Test
	public void testGetCreaConNotNull() {
		assertNotNull(DBManager.getInstance().getCreaCon());
	}
	
	@Test
	public void testGetCreaConValid() throws ClassNotFoundException, SQLException {
		
		Connection conCrea = DBManager.getInstance().getCreaCon();
		Connection creaCon = null;
		
			Class.forName("com.mysql.jdbc.Driver");
			creaCon = DriverManager.getConnection(conCrea.getMetaData().getURL(), "root", "");
			
		assertEquals(conCrea.getMetaData().getURL(), creaCon.getMetaData().getURL());		
	}
	
	@Test(expected = SQLException.class)
	public void testGetCreaConNotValid() throws ClassNotFoundException, SQLException {
		
		Connection conCrea = DBManager.getInstance().getCreaCon();
		
			Class.forName("com.mysql.jdbc.Driver");
			DriverManager.getConnection(conCrea.getMetaData().getURL(), "jeanlouion", "patator");
		
		fail("Exception not correctly returned");
	}
	
	@Test
	public void testGetCreaConRequest() {

		String dbName = "dbtestporo";
		Statement stmt;

		try {
			stmt = DBManager.getInstance().getCreaCon().createStatement();
			stmt.execute("CREATE DATABASE IF NOT EXISTS " + dbName + ";");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		Statement stmt1;

		try {
			stmt1 = DBManager.getInstance().getCreaCon().createStatement();
			ResultSet rs = stmt1.executeQuery("SHOW DATABASES;");
			while(rs.next()) {
				if(rs.getString(1).equals(dbName)){
					assertTrue(true);
					break;
				}
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			try {
				stmt = DBManager.getInstance().getCreaCon().createStatement();
				stmt.execute("DROP DATABASE IF EXISTS " + dbName + ";");
			} catch (SQLException e1) {
				e1.printStackTrace();
				fail("Database not found");
			}
		}
		
	}

	@Test
	public void testGetDbName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetConNotNull() {
		assertNotNull(DBManager.getInstance().getCon());
	}

	@Test
	public void testGetConValid() throws ClassNotFoundException, SQLException {
		Connection noc = DBManager.getInstance().getCon();
		Connection con;

		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(noc.getMetaData().getURL(), "root", "");

		assertEquals(noc.getMetaData().getURL(), con.getMetaData().getURL());

	}

	@Test(expected = SQLException.class)
	public void testGetConNotValid() throws ClassNotFoundException, SQLException {
		Connection noc = DBManager.getInstance().getCon();


		Class.forName("com.mysql.jdbc.Driver");
		DriverManager.getConnection(noc.getMetaData().getURL(), "Jean-Louion", "PATATOR");

		fail("Exception not correctly returned");

	}		

	@Test
	public void testCreateDB() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteDB() {
		fail("Not yet implemented");
	}

	@Test
	public void testConnect() {
		fail("Not yet implemented");
	}

	@Test
	public void testConnectStringString() {
		fail("Not yet implemented");
	}

	@Test
	public void testConnectStringStringStringStringString() {
		fail("Not yet implemented");
	}

	@Test
	public void testConnectCreaStringStringStringString() {
		fail("Not yet implemented");
	}

	@Test
	public void testConnectCreaStringString() {
		fail("Not yet implemented");
	}

	@Test
	public void testConnectCrea() {
		fail("Not yet implemented");
	}

}
