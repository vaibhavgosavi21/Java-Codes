package Example2;

public class Example3 extends Thread{
	
	@Override
	public void run() {
		String string="Hello Vaibhav";
		for(int i=0; i<string.length(); i++) {
			System.out.print(string.charAt(i));
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
