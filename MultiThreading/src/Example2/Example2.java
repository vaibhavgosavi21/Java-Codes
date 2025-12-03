package Example2;

public class Example2 extends Thread{
	
	@Override
	public void run() {
		int arr[]= {22,33,21,45,65,87};
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
