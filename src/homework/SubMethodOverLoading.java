package homework;

public class SubMethodOverLoading {
	
	
	void sub()
	{
		int a =20;
		int b = 10;
		int c = a-b;
		System.out.println("subtraction without parameters "+c);
	}
	void sub(int a,int b)
	{
		
		int c = a-b;
		System.out.println("subtraction with int parameters "+c);
	}
	float sub(int a,float b)
	{
		
		float  c = a-b;
		return c;
	}
	long sub(long a,int b)
	{
		
		return a-b;
	}

	public static void main(String[] args) {
		
		SubMethodOverLoading obj = new SubMethodOverLoading();
		obj.sub();
		obj.sub(30, 10.20f);
		obj.sub(40, 10);
		long d = obj.sub((long)2000000000, 200000000);
		System.out.println("retun value of int - float = "+obj.sub(30, 10.20f));
		System.out.println("retun value of long - Int = " +d);
	}

}
