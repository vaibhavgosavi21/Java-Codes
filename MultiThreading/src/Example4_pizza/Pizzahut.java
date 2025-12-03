package Example4_pizza;

public class Pizzahut extends Thread {
Pizza pizza;
	
	public Pizzahut(Pizza p) {
		this.pizza=p;
	}
	
	@Override
	public void run() {
		pizza.makepizza(10);
	}
}
