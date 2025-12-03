package StringBasics;

public class StringExample4 {
	public static void main(String[] args) {
		String str="helloa";
		String vowels="aeiouAEIOU";      
		
		for(int i=0; i<str.length(); i++) {
			if(vowels.contains(String.valueOf(str.charAt(i)))) {
				System.out.print(str.charAt(i)+" ");

			}
		}
	}

}
