package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSelect {
	
	private static Connection connection;
	private static Statement statement;
	private static ResultSet set;
	private static final String driverpath="com.mysql.cj.jdbc.Driver";
	private static final String dburl="jdbc:mysql://localhost:3306/book?user=root&password=root";
//	private static final String user="root";
//	private static final String pass="root";

	public static void main(String[] args) throws SQLException {
		
		try {
			//1. 
			Class.forName(driverpath);
			//2.
			connection=DriverManager.getConnection(dburl);
			//3.
			statement=connection.createStatement();
			//4.
			set=statement.executeQuery("select * from bookinfo");
			
			while(set.next()) {
				System.out.println("|"+set.getInt("bid")+"|"+set.getString("name")+"|"+set.getString("author")+"|");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			connection.close();
			statement.close();
			set.close();
		}
		
	}

}
