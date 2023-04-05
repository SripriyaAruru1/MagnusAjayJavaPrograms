
public class Swithccasedemo {

	public static void main(String[] args) {
	
		
		int option = 6;
		int a = 20;
		int b = 30;
		
		switch (option)
		{
		case 1:
			System.out.println("Addition : " + (a+b));
			break;
		case 2:
			System.out.println("Subtraction :" + (b-a));
			break;
		case 3:
			System.out.println("Multiplication : " + (a*b));
			break;
		case 4:
			System.out.println("Division : " + (b/a));
			break;
		case 5:
			System.out.println("Modulous : " + (b%a));
			break;
				default:
					System.out.println("Enter option from 1 to 5 only ");
		
		
		}
		
		
		
		
	}

}
