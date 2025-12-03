package StringBasics;

public class StringExample2 {

	public static void main(String[] args) {
		String str="hello";
		
		System.out.println(str.charAt(3));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.concat("World"));
		System.out.println(str.contains("he"));
		System.out.println(str.compareTo("hello"));
		System.out.println(str.endsWith("o"));
		System.out.println(str.startsWith("h"));
		System.out.println(str.indexOf('e'));
		System.out.println(str.replace('l', 'w'));
		System.out.println(str.replaceAll("l", "w"));
		
				

	}

}
