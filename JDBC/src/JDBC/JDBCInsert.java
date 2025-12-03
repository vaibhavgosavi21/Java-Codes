package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsert {
	
		
		private static Connection connection;
		private static Statement statement;
		
		private static final String driver="com.mysql.cj.jdbc.Driver";
		private static final String dburl="jdbc:mysql://localhost:3306/book?user=root&password=root";
		
		private static String query;
		
		
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
			Class.forName(driver);
			System.out.println("1");
			
			connection=DriverManager.getConnection(dburl);
			statement=connection.createStatement();
			System.out.println("2");
			
			//for insert
//			query="insert into bookinfo values(5, 'War of Lanka','sharma')";
//			System.out.println("3");
			
			
			//for delete row
//			query="delete from bookinfo where bid=5";
		
			//for update
//			query="update bookinfo set name='lanka' where bid=4";
			
			//rename table name
//			query="rename table bookdetails to bookinfo";
			
			query="insert into bookinfo values(6, 'Chanakya', 'aarya')";
			System.out.println("3");
			
			int result =statement.executeUpdate(query);
			System.out.println("4");

			System.out.println("Query ok "+result+" rows affected.....");
			connection.close();
			statement.close();

		
	}

}
