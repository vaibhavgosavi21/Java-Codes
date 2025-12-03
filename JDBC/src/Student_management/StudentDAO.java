package Student_management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDAO {
	Connection connection;
	String query;
	PreparedStatement statement;
	DataBaseConnection dbconnection;

	public void addstudent(Student student) {
		//add student to database
		try {
			connection=DataBaseConnection.getConnection();
			query = "insert into std values(?,?,?,?)";

			PreparedStatement statement = connection.prepareStatement(query);
			
			statement.setInt(1, student.getId());
			statement.setString(2, student.getName());
			statement.setString(3, student.getDiv());
			statement.setDouble(4, student.getMarks());
			statement.executeUpdate();
			System.out.println("Student added successfully...");

		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

	public void searchStudent(int rollno) {
		//Search Student using rollno
		try {
			connection=DataBaseConnection.getConnection();
			query = "Select * from std where rollno=?";
			statement = connection.prepareStatement(query);

			statement.setInt(1, rollno);
			ResultSet set = statement.executeQuery();

			if (set.next()) {

				System.out.println("|"+set.getInt("rollno") + " | " + set.getString("name") + " | "
						+ set.getString("division") + " | " + set.getDouble("marks")+"|");
			} else {
				System.out.println("student not found");
			}

			System.out.println("Query ok");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void displayStudent() {
		// display all student details
		try {
			connection=DataBaseConnection.getConnection();
			query = "Select * from std";
			statement = connection.prepareStatement(query);
			ResultSet set = statement.executeQuery();

			while(set.next()) {
				System.out.println("|-------------------------|");
				
				System.out.println("|"+set.getInt("rollno") + " | " + set.getString("name") + " | "+ set.getString("division") + " | " + set.getDouble("marks")+"|");
			}
			System.out.println("Query ok");
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void studentUpdate( Student student) {
		
		try {
			connection=DataBaseConnection.getConnection();
			query="update std set name=? where rollno=?";
			statement=connection.prepareStatement(query);
			
			statement.setString(1, student.getName());
			statement.setInt(2, student.getId());
			statement.executeUpdate();
			System.out.println("Student name updated succesfully");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void updateDivision(Student student) {
		// TODO Auto-generated method stub
		try {
			connection=DataBaseConnection.getConnection();
			query="update std set division=? where rollno=?";
			statement=connection.prepareStatement(query);
			statement.setString(1, student.getDiv());
			statement.setInt(2, student.getId());
			statement.executeUpdate();
			System.out.println("Student Division updated successfully..");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}

	public void updatemarks(Student student) {
		// TODO Auto-generated method stub
		try {
			connection=DataBaseConnection.getConnection();
			query="update std set marks=? where rollno=?";
			statement=connection.prepareStatement(query);
			
			statement.setDouble(1, student.getMarks());
			statement.setInt(2, student.getId());
			statement.executeUpdate();
			System.out.println("Marks updated successfully...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

	public void deleteStudent(Student student) {
		// TODO Auto-generated method stub\
		try {
			connection=DataBaseConnection.getConnection();
			query="delete from std where rollno=?";
			statement=connection.prepareStatement(query);
			statement.setInt(1, student.getId());
			statement.executeUpdate();
			System.err.println("Student deleted successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		
	
	}
}
