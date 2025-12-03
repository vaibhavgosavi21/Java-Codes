package Example3;

public class RentedList {
	private int availablevehicle;

	public RentedList(int availablevehicle) {
		this.availablevehicle = availablevehicle;
	}

	public synchronized void available() {
		System.out.println("Available vehicles: " + this.availablevehicle);
	}

	public synchronized void buy(int noofvehicle) {
		if (this.availablevehicle > noofvehicle) {
			availablevehicle -= noofvehicle;
			System.out.println("Vehicle is bought " + noofvehicle);
			available();
			return;
		} 
			System.out.println("Vehicle is not avaialble for Buy");
		
	}



}
