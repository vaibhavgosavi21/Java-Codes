package Exception;

//import java.io.FileNotFoundException;
import java.io.FileReader;

public class IOException {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("file.txt");
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println(e);
			System.out.println("Hello");
		}

	}

}
