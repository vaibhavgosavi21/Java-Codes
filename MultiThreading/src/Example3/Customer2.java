package Example3;

public class Customer2 extends Thread {
	private RentedList list;

	public Customer2(RentedList list) {
		this.list = list;
	}
	
	
	@Override
	public void run() {
		list.buy(3);
//		list.sell(1);
	}
	
	

}
