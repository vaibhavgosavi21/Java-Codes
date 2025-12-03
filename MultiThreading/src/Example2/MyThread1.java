package Example2;

public class MyThread1 extends Thread{
	
	@Override
	public void run() {
		String str="mythread 1 is running...";
		for(int i=0; i< str.length(); i++) {
			System.out.print(str.charAt(i));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
