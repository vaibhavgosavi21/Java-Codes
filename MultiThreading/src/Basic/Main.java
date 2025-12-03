package Basic;

public class Main {
	public static void main(String[] args) {
		Mythread1 my1=new Mythread1();
		MYthread2 my2=new MYthread2();
		
		Thread thread=new Thread(my2);
		
		my1.start();
		thread.start();
		 
		
	}

}
