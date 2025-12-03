package Example5_Washing;

public class Customers extends Thread {
	Washing washing;

	Customers(Washing w) {
		this.washing = w;
	}

	@Override
	public void run() {
	
		washing.washing(5);
	}

}
