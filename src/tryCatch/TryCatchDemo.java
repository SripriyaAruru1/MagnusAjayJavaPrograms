package tryCatch;

public class TryCatchDemo {
	

	public static void main(String[] args) {
//	
//		int a = 10;
//		try {
//		int b = a/0;
//		}
//		catch(Exception e)
//		{
//			b = a/1;
//		}
//		System.out.println("a = "+b);
		System.out.println("Start protgam");
		int a = 10;
		System.out.println("Before Exception");
		try {
		int b = a/0;
		}
		catch(NullPointerException np) {
			np.printStackTrace();
		}
		catch (ArithmeticException ae)
		{
			ae.printStackTrace();
		}
		catch(RuntimeException re) {
			re.printStackTrace();
		}
		
		catch(Exception e)
		{
			System.out.println("Got Exception");
			//pritns the what is exception full details
			//e.printStackTrace();
		// get message means shows only message like by zero 
			System.out.println(e.getMessage());
		}
		
		System.out.println("After exception ");
		System.out.println("a = "+a);
		System.out.println("end of exception ");
		
	}

}
