package Collable_Statement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class Collable_procedure {

	private static final String driverpath = "com.mysql.cj.jdbc.Driver";
	private static final String dburl = "jdbc:mysql://localhost:3306/school";
	private static final String username = "root";
	private static final String password = "root";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		Class.forName(driverpath);
		//view details of roll no 2
//		String query="call proc5(2)"; //call proc5(rollno)
		
		//insert and update
		 String query1="CALL proc7(1, 'Vaibhav', 'A', 85)";
		 		
				
		Connection connection = DriverManager.getConnection(dburl, username, password);
		CallableStatement statement=connection.prepareCall(query1);
		int set=statement.executeUpdate();
//		while(set.next()) {
//			System.out.println("|"+set.getInt("rollno")+"|"+set.getString("name")+"|"+set.getString("division")+"|"+set.getDouble("marks"));
//		}
		System.out.println("Query ok");
		connection.close();
//		set.close();
		statement.close();
	}

}
