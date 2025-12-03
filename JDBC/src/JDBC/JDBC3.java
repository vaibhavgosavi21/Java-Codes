package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC3 {
	private static Connection connection;
	private static Statement statement;
	
	private static final String driver="com.mysql.cj.jdbc.Driver";
	private static final String dburl="jdbc:mysql://localhost:3306/book?user=root&password=root";
	
	private static String query;
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		Class.forName(driver);
		System.out.println("1");
		
		connection=DriverManager.getConnection(dburl);
		statement=connection.createStatement();
		System.out.println("2");
		
		System.out.println("Enter book id: ");
		int bid=sc.nextInt();
		System.out.println("Enter book name: ");
		String bname=sc.next();
		System.out.println("enter Author name: ");
		String aname=sc.next();
		query="insert into bookinfo values("+bid+", '"+bname+"', '"+aname+"')";
		System.out.println("3");
		
//		System.out.println("Enter bid to delete record: ");
//		int bid=sc.nextInt();
//		query="delete from bookinfo where bid="+bid+"";
		
		int result =statement.executeUpdate(query);
		System.out.println("4");

		System.out.println("Query ok "+result+" rows affected.....");
		connection.close();
		statement.close();

	}

}
