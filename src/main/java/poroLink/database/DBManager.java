/**
 * 
 */
package poroLink.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

import poroLink.utils.file.FileManager;

/**
 * @author Minet
 *
 */
public class DBManager {

	private static DBManager instance = null;

	protected DBManager() {
		connectCrea();
		if (canConnect()) {
			connect();
		} else {
			createDB("config", "poro.sql");
		}
		// Exists only to defeat instantiation.
	}

	public static DBManager getInstance() {
		if (instance == null) {
			instance = new DBManager();
		}
		return instance;
	}

	private static final String PASSWORD = "password";
	private static final String LOGIN = "login";
	private static final String DB_NAME = "dbName";
	private static final String PORT = "port";
	private static final String SERVER_ADDRESS = "serverAddress";
	private static final String DBCONFIG = "dbconfig";
	private static final String CONFIG = "config";

	private Connection creaCon;
	private Connection con;
	private String dbName = "poro";

	/**
	 * @return the creaCon
	 */
	public Connection getCreaCon() {
		return creaCon;
	}

	/**
	 * @return the DBNAME
	 */
	public String getDbName() {
		return dbName;
	}

	/**
	 * @return the con
	 */
	public Connection getCon() {
		return con;
	}

	private boolean canConnect() {
		try {
			Statement stmt = creaCon.createStatement();
			ResultSet rs = stmt.executeQuery("SHOW DATABASES");
			while (rs.next()) {
				if (rs.getString(1).equals(dbName)) {
					return true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	private void createDB(String path, String file) {
		Statement stmt;

		try {
			stmt = creaCon.createStatement();
			stmt.execute("CREATE DATABASE IF NOT EXISTS " + dbName + ";");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		connect();
		
		FileManager fileManager = new FileManager(path, file);
		String creationRequest = "";
		for (String string : fileManager.loadFromFile()) {
			creationRequest += string + "\n";
		}

	

		try {
			stmt = con.createStatement();
			for (String iterable_element : creationRequest.split(";")) {
				if (!iterable_element.equals("") && !iterable_element.equals("\n")) {
					stmt.execute(iterable_element);
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteDB () {
		Statement stmt;
		try {
			stmt = creaCon.createStatement();
			stmt.execute("DROP DATABASE " + dbName + ";");
			con.close();
			con = null;
			creaCon.close();
			creaCon = null;
			instance = null;
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}

	public void connect() {
		connect(CONFIG, DBCONFIG);
	}

	public void connect(String path, String file) {
		FileManager fileManager = new FileManager(path, file);
		Map<String, Object> datas = fileManager.extractFromPattern();
		String password = "";
		if (datas.containsKey(PASSWORD)) {
			password = datas.get(PASSWORD).toString();
		}
		connect(datas.get(SERVER_ADDRESS).toString(), datas.get(PORT).toString(), datas.get(DB_NAME).toString(),
				datas.get(LOGIN).toString(), password);
	}

	public void connect(String serverAddress, String port, String dbName, String login, String password) {
		this.dbName = dbName;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://" + serverAddress + ":" + port + "/" + dbName, login,
					password);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public void connectCrea(String serverAddress, String port, String login, String password) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			creaCon = DriverManager.getConnection("jdbc:mysql://" + serverAddress + ":" + port + "/", login, password);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public void connectCrea(String path, String file) {
		FileManager fileManager = new FileManager(path, file);
		Map<String, Object> datas = fileManager.extractFromPattern();
		String password = "";
		if (datas.containsKey(PASSWORD)) {
			password = datas.get(PASSWORD).toString();
		}

		dbName = datas.get(DB_NAME).toString();

		connectCrea(datas.get(SERVER_ADDRESS).toString(), datas.get(PORT).toString(), datas.get(LOGIN).toString(),
				password);
	}

	public void connectCrea() {
		connectCrea(CONFIG, DBCONFIG);
	}
}
