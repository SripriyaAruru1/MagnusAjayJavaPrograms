package throwDemo;

public class LowAccountBalance extends RuntimeException {

	
	LowAccountBalance()
	{
		super("account balance is low");
	}
	public static void main(String[] args) {
		
	}

}
