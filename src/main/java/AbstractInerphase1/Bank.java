package AbstractInerphase1;

public abstract class Bank {

	public abstract void loan(); // abstract method no method body

	public void credit() {

		System.out.println("Bank credit");
	}

	public void debit() {

		System.out.println("Bank debit");
	}

}
