package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Rename {
	private static  Connection connection;
	private static  Statement statement;
	
	private static final String driver="com.mysql.cj.jdbc.Driver";
	private static final String dburl="jdbc:mysql://localhost:3306/book?user=root&password=root";
	
//	private static final String user="root";
//	private static final String password="root";

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		connection=DriverManager.getConnection(dburl);
		statement=connection.createStatement();
		
		int result=statement.executeUpdate("rename table info to bookinfo");
		System.out.println("Query ok "+result+" rows affected");
		
		connection.close();
		statement.close();
		
		
		
	}

}
