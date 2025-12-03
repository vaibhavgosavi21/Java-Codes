package BasicArray;

public class Array5_update {

	public static void update(int mark[]) {

		for (int i = 0; i < mark.length; i++) {
			mark[i] = mark[i] + 1;

		}
	}

	public static void main(String[] args) {

		int mark[] = { 95, 67, 55 };

		update(mark);

		// print updated array
		for (int i = 0; i < mark.length; i++) {
			System.out.print(mark[i] + " ");
		}
		System.out.println();

	}

}
