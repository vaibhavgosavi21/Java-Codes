package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_connectivity {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. Load driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Diver loaded");

		// 2. Open connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/book", "root", "root");
		System.out.println("connection open");

		// 3. Create Preparestatement
		Statement statement = connection.createStatement();

		// 4. Process the result
		ResultSet set = statement.executeQuery("select * from bookinfo");
		while (set.next()) {
			System.out.println(set.getInt(1) + "  " + set.getString(2) + " written by " + set.getString(3));
		}

		// 5. close connection
		connection.close();
		statement.close();
		set.close();

	}

}
