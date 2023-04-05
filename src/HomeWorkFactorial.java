
public class HomeWorkFactorial {

	public static void main(String[] args) {
		
		int result = 1;
		
		for(int i = 1;i<=5;++i)
		{
			//System.out.print("\n"+i+" * "+result+ " = "+(result * i));
			result = result * i;
			System.out.print(i+ " * ");
			
			
		}
		
		System.out.print("= "+ result);
		
	}

}
