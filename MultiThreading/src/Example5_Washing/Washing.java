package Example5_Washing;

public class Washing {
	private int availablewashingplace ;
	private int noofbike;
	

	public Washing(int availablewashingplace,int noofbike) {
	
		this.availablewashingplace = availablewashingplace;
		this.noofbike=noofbike;
	}

	public synchronized void washing(int noofbike) {
		if (noofbike > availablewashingplace) {
			System.out.println("Washing place is full ...plase wait");
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.availablewashingplace -= noofbike;
		System.out.println("Washing bike started.... Available places: "+availablewashingplace);
	}

	public synchronized void washingdone() {
		if (availablewashingplace == noofbike) {
			this.availablewashingplace-=noofbike; 
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Washing completed! Available places: "+availablewashingplace);
			this.notify();
		}
	}

}
