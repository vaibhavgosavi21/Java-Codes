package Example3;

public class CustomerMain {

	public static void main(String[] args) {
		RentedList list=new RentedList(5);
		
		Cusomer1 c1=new Cusomer1(list);
		Customer2 c2=new Customer2(list);
		c1.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c2.start();
	

	}

}
