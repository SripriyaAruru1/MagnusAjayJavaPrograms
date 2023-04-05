package Polimorphism;

public class MethodOverloading {
	
	int add (int a,int b)
	{
		return a+b;
	}
	
	int add (int a,int b,int c)
	{
		return a+b+c;
	}
	
	float add (float a,int b)
	{
		return a+b;
	}
	float add (int a,float b)
	{
		return a+b;
	}
	double add (int a,double b)
	{
		return a+b;
	}
	void add (int a,double b,int d)
	{
		System.out.println(a);;
	}


	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		int res  = obj.add(10, 200);
		System.out.println(res);
		
	}

}
// hw method overloading for sub
// hw aerea of circle
