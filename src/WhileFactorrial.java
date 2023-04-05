
public class WhileFactorrial {

	public static void main(String[] args) {
		
		int result = 1;
		
		int i = 1;
		while (i<=5)
		{
			result = result * i;
			
			System.out.print(i+ " * ");
			
			i++;
		}
		
		System.out.print(" = " +result);
		

	}

}
