package Authentication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ex1 {
	private static Connection connection;
	private static Statement statement;

	private static final String driver = "com.mysql.cj.jdbc.Driver";
	private static final String dburl = "jdbc:mysql://localhost:3306/validation?user=root&password=root";

	private static String query;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		// 1. Load driver class
		Class.forName(driver);

		// 2. Open connection
		connection = DriverManager.getConnection(dburl);

		// 3. Create Preparestatement
		statement = connection.createStatement();
		System.out.println("--------- Login ---------");
		System.out.println("1. Login");
		System.out.println("2. New User");
		System.out.println("Select option: ");
		int ch=sc.nextInt();
		
		switch(ch){
		case 1->{
			System.out.println("Enter Username : ");
			String user=sc.next();
			System.out.println("Enter password : ");
			String pass=sc.next();
			
			query = "select * from valid1 where username=? AND password=?";
			
			// Prepared statement
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, user);
			ps.setString(2, pass);

			// 4. Process the result
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				System.out.println("Login Successful");
			} else {
				System.out.println("Login failed, Inavalid Credentials....");
			}
			
			
		}
		case 2->{
			System.out.println("Enter Username : ");
			String user=sc.next();
			System.out.println("Enter password : ");
			String pass=sc.next();
			query = "insert into valid1 values('" + user + "','" + pass + "')";
			System.out.println("3");

			int result = statement.executeUpdate(query);
			System.out.println("4");

			System.out.println("New user added successfully");
			System.out.println("5");
		}
		}

		connection.close();
		statement.close();

	}

}
