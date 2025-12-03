package Student_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {

	private static final String driverpath = "com.mysql.cj.jdbc.Driver";
	private static final String dburl = "jdbc:mysql://localhost:3306/school";
	private static final String username = "root";
	private static final String password = "root";

	public static Connection getConnection(){
		Connection connection = null;
		try {
			Class.forName(driverpath);
			connection = DriverManager.getConnection(dburl, username, password);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;
	}

	public static void close(AutoCloseable resource) {
		try {
			if (resource != null) {
				resource.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
