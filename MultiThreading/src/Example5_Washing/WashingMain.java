package Example5_Washing;

public class WashingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Washing washing=new Washing(2,2);
		
		WashingCenter washingcenter=new WashingCenter(washing);
		
		Customers customer1=new Customers(washing);
		Customers customer2=new Customers(washing);
		
		customer1.start();
		customer2.start();
		washingcenter.start();


	}

}
