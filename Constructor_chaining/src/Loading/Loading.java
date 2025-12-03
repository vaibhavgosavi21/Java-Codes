package Loading;

public class Loading {
	
	static int a;
	int b;

	static {
		System.out.println("Static block");
	}
	
	{
		System.out.println("Non Static block");

	}

	static void display() {
		System.out.println("Static method");
	}

	void show() {
		System.out.println("Non static method");

	}

	Loading() {
		System.out.println("Constructor");

	}

	public static void main(String[] args) {
		System.out.println("Main Method.");
		Loading l=new Loading();
		
		//display();
		l.show();
		
	}

}
