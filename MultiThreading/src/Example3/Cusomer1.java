package Example3;

public class Cusomer1 extends Thread{
	private RentedList list;  
	
	
	public Cusomer1(RentedList list) {
		this.list = list;
	}

	@Override
	public void run() {
		list.buy(22);
//		list.sell(3);
	}
	

}
