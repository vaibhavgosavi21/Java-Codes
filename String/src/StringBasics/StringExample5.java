package StringBasics;

import java.util.ArrayList;
import java.util.Scanner;

public class StringExample5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Example5> list=new ArrayList<>();
		
		list.add(new Example5("Laptop", "Lenovo","LOQ"));
		list.add(new Example5("Laptop", "HP","EliteBook"));
		list.add(new Example5("Laptop", "Dell","inspiron"));
		list.add(new Example5("Laptop", "Asus","AsusVivobook15"));
		list.add(new Example5("Laptop", "Apple","Mackbookpro"));

		list.add(new Example5("Mobile", "Vivo","V40"));
		list.add(new Example5("Mobile", "Lenovo","A1000"));
		list.add(new Example5("Mobile", "Oppo","Reno10"));
		list.add(new Example5("Mobile", "Redmi","RedmiNote10"));
		list.add(new Example5("Mobile", "Oneplus","OnplePlus11R"));

		
		System.out.println("1. Search by Name ");
		System.out.println("2. Search by Brand ");
		System.out.println("3. Search by Device ");
		System.out.println("Enter your choice: ");
		int ch=sc.nextInt();
		
		switch(ch) {
		case 1 -> {
			System.out.println("Enter name of model: ");
			String model = sc.next().toLowerCase();
			for (Example5 eg : list) {
				if (eg.getModelname().toLowerCase().contains(model)) {
					System.out.println(eg);

				}
			}
		}
		case 2->{
			System.out.println("Enter name of Brand: ");
			String brand = sc.next().toLowerCase();
			for (Example5 eg : list) {
				if (eg.getBrand().toLowerCase().contains(brand)) {
					System.out.println(eg);

				}
			}
			
		}
		case 3->{
			System.out.println("Enter type Devie: ");
			String device = sc.next().toLowerCase();
			for (Example5 eg : list) {
				if (eg.getDevicetype().toLowerCase().contains(device)) {
					System.out.println(eg);

				}
			}
		}
//		case 4->{
//			System.err.println("------------ List of Devices ---------------");
//			System.out.println(eg);		}
		default-> System.out.println("Invalid choice..");
		}




		
		
	}

}
