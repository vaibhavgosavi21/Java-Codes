package CheckedException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//java.io.IOException;

//declaration & handling exception is main 

public class CheckedException1 {
	public static void main(String[] args) throws FileNotFoundException,IOException
	
	{
		try {
		System.out.println("Start");
		FileInputStream obj=new FileInputStream("hello.txt");
		System.out.println(obj.read());
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("Finally");
		}
		System.out.println("Main end");
		
	}
}
