package Example4_pizza;

public class PizzaMain {
	public static void main(String[] args) {
		Pizza pizza=new Pizza();
		
		Friends friend=new Friends(pizza);
		Pizzahut pizzahut=new Pizzahut(pizza);
		
		friend.start();
		pizzahut.start();
	}

}
