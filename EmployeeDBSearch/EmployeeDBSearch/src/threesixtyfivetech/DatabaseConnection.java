package threesixtyfivetech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseConnection {
	private Connection conn = null;
	private String query = null;
	private ResultSet rs;
	private final String url = "jdbc:mysql://127.0.0.1:3306/employee_schema";
	private final String user = "root";
	private final String pass = "AAAbbb444$";
	
	public DatabaseConnection() {
		try {
			conn = DriverManager.getConnection(url, user, pass);
			query = "SELECT * FROM employee_schema.emp_login";
			PreparedStatement stm = conn.prepareStatement(query);
			rs = stm.executeQuery();
			
			while(rs.next()) {
				String 
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
