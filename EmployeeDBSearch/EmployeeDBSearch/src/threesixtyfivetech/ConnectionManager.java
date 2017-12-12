package threesixtyfivetech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import com.mysql.jdbc.Driver;

public class ConnectionManager{
	private static String driverName = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://127.0.0.1:3306/employee_schema";
	private static String user = "root";
	private static String pass = "AAAbbb444$";
	private static Connection con;
	
	public static Connection getConnection() {
		try {
			Class.forName(driverName);
			try {
				con = DriverManager.getConnection(url, user, pass);
			} catch (SQLException e) {
				System.out.println("Failed to create the database connection.");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found.");
		}
		return con;
	}
}