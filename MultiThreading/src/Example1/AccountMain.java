package Example1;

public class AccountMain {

	public static void main(String[] args) {
		Account account = new Account(5000);

		Husband h = new Husband(account);
		Wife w = new Wife(account);

		h.start();
		w.start();

	}

}
