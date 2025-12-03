package Example4_pizza;

public class Friends extends Thread{
	Pizza pizza;
	
	public Friends(Pizza p) {
		this.pizza=p;
	}
	
	@Override
	public void run() {
		
		pizza.orderpizza(5);;
	}
}
