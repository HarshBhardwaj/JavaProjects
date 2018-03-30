package dovb.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLiteCon {
	private static Connection con;
	private static boolean hasData = false;
	
	public ResultSet displayUsers() throws ClassNotFoundException, SQLException {
		if( con == null) {
			getConnection();
		}
		
		Statement state = con.createStatement();
		ResultSet res = state.executeQuery("Select fname, lname From user");
		return res;
	}
	
	private void getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("org.sqlite.JDBC");
		con = DriverManager.getConnection("jdbc:sqlite:SQLConnectionTest.db");
		initialise();
	}

	private void initialise() throws SQLException {
		// TODO Auto-generated method stub
		if(!hasData) {
			hasData = true;
			
			Statement state = con.createStatement();
			ResultSet res = state.executeQuery("SELECT name FROM sqlite master WHERE type='table' AND name='user'");
			if(!res.next()) {
				System.out.println("Building the User table with prepopulated values.");
				// need to build the table
				Statement state2 = con.createStatement();
				state2.executeQuery("CREATE TABLE user(id integer,"
						+ "fName varchar(60)," + "lName varchar(60),"
						+ "primary key(id));");
				
				// inserting some data
				PreparedStatement prep = con.prepareStatement("INSERT INTO user values(?,?,?);");
				prep.setString(2, "Mohit");
				prep.setString(3, "Sharma");
				prep.execute();
			}
		}
	}
	
	public void addUser(String firstName, String lastName) throws ClassNotFoundException, SQLException {
		if(con == null) {
			getConnection();
		}
		
		PreparedStatement prep = con.prepareStatement("INSERT INTO user values(?,?,?);");
		prep.setString(2, firstName);
		prep.setString(3, lastName);
		prep.execute();
	}

}
