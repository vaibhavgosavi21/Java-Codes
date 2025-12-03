package Student_management;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		StudentDAO dao=new StudentDAO();
		Scanner sc=new Scanner(System.in);
		System.out.println("      ------- Student Management -------");
		do{
		System.out.println("\n1. Add Student");
		System.out.println("2. Search Student");
		System.out.println("3. Display Student");
		System.out.println("4. Update Student");
		System.out.println("5. Delete Student");
		System.out.println("6. Exit");
		System.out.println("enter your choice: ");
		int ch=sc.nextInt();
		
		
		
			switch(ch){
			case 1->{
				System.out.println("Enter Roll no: ");
				int rollno=sc.nextInt();
				System.out.println("Enter Student name: ");
				String name=sc.next();
				System.out.println("Enter Division: ");
				String div=sc.next();
				System.out.println("Enter marks: ");
				double marks=sc.nextDouble();
				
				dao.addstudent(new Student(rollno, name, div, marks));
			}
			
			case 2->{
				System.out.println("Enter student rollno: ");
				int rollno=sc.nextInt();
				dao.searchStudent(rollno);
			}
			case 3->{
				System.out.println("---------- All Student Details ----------");
				dao.displayStudent();
				
			}
			case 4->{
				System.out.println("Enter a Roll no of Student For update Details: ");
				int rollno=sc.nextInt();
				dao.searchStudent(rollno);
				System.out.println("What you want to update ?");
				System.out.println("\n1. Name  \n2. Division \n3. Marks");
				System.out.println("Select option: ");
				int uch=sc.nextInt();
				switch(uch) {
				case 1->{
					//name
					System.out.println("Enter new Name: ");
					String name=sc.next();
					dao.studentUpdate(new Student (name, rollno));
				}
				case 2->{
					//division
					System.out.println("Enter New Division: ");
					String newdivision=sc.next();
					dao.updateDivision(new Student(rollno,newdivision));
				}
				case 3->{
					//marks
					System.out.println("Enter New Marks: ");
					int newmarks=sc.nextInt();
					dao.updatemarks(new Student(rollno,newmarks));
				}
				}
				
			}
			case 5->{
				System.out.println("Enter a rollno to Delete Student");
				int rollno=sc.nextInt();
				dao.deleteStudent(new Student(rollno));
			}
			case 6-> System.exit(0);
			
			default->System.out.println("Invalid choice...");
			
			}
		}while(true);


	}

}
