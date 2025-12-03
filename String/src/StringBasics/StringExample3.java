package StringBasics;

public class StringExample3 {

	public static void main(String[] args) {
		
		//Reverse String
		String str="abcd";
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}

	}

}
