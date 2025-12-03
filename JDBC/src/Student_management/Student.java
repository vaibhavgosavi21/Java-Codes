package Student_management;

public class Student {
	private int id;
	private String name;
	private String div;
	private double marks;

	public Student(int rollno, String name, String div, double marks) {
		super();
		this.id = rollno;
		this.name = name;
		this.div = div;
		this.marks = marks;
	}

	public Student(String newname, int rollno) {
		// TODO Auto-generated constructor stub
		this.name = newname;
		this.id=rollno;
		
	}

	public Student(int rollno, String newdivision) {
		// TODO Auto-generated constructor stub
		this.id=rollno;
		this.div=newdivision;
	}


	public Student(int rollno, int newmarks) {
		// TODO Auto-generated constructor stub
		this.id=rollno;
		this.marks=newmarks;
	}

	public Student(int rollno) {
		// TODO Auto-generated constructor stub
		this.id=rollno;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDiv() {
		return div;
	}

	public void setDiv(String div) {
		this.div = div;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
	

}
