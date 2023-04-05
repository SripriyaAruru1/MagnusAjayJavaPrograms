package homework;

public class Constructor1 {
	
	Constructor1()
	{
		this(20,400);
		System.out.println("This is a default constructor");
	}
	
	Constructor1(int a,int b)
	{
		this(20.0f,30);
		System.out.println("This is a parameterised constructor: A+B = "+(a+b));
		
	}
	Constructor1(float a,int b)
	{
		System.out.println("This is a parameterised constructor-Afloat + Bint = "+(a+b));
	}

	public static void main(String[] args) {
		Constructor1 obj = new Constructor1();
		//Constructor1 obj1 = new Constructor1(10,20);
		//Constructor1 obj2 = new Constructor1(20.120f,30);
	}

}
