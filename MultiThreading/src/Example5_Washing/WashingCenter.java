package Example5_Washing;

public class WashingCenter extends Thread {
	
	Washing washing;
	
	WashingCenter(Washing w){
		this.washing=w;
	}
	
	@Override
	public void run() {
		washing.washingdone();
	}

}
