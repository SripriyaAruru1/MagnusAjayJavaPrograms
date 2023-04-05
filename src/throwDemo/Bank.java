package throwDemo;

public class Bank {
	int balance = 10000;

	public static void main(String[] args) {
		Bank o = new Bank();
		o.withdraw(15000);

	}

	void withdraw(int amount)
	{
	if (balance < amount )
	{
		// after throw any stysout not allowed
		throw new LowAccountBalance();
	}
	else {
		balance = balance-amount;
	}
	}
}
