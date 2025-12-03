package Basic;

public class Mythread1 extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++) {
		System.out.println("Mythread 1 is running");
		}
	}

}
