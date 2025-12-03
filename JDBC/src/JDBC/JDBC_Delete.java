package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Delete {
	private static Connection connection;
	private static Statement statement;

	private static final String driver = "com.mysql.cj.jdbc.Driver";
	private static final String dburl = "jdbc:mysql://localhost:3306/book?user=root&password=root";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Load the driver
		Class.forName(driver);
		System.out.println("1");
		// conection
		connection = DriverManager.getConnection(dburl);
		System.out.println("2");
		statement = connection.createStatement();
		int result = statement.executeUpdate("delete from bookinfo info where bid=6");
		System.out.println("Query Ok " + result + "rows affected");
		connection.close();
		statement.close();

	}

}
