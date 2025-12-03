package Example4_pizza;

public class Pizza {
	private int noofpizza;
	
	public synchronized void orderpizza(int no) {
		System.out.println("Ordering "+no+" pizzas....");
		if(no>noofpizza) {
			System.out.println("We are making your pizzas.... So please wait.... ");
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.noofpizza-=no;
		System.out.println("Pizza Delivered successfully");
	}
	
	public synchronized void makepizza(int no) {
		System.out.println("Making "+no+" Pizzas");
		this.noofpizza+=no;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Pizzas done");
		this.notify();
	}

}
