package homework;

public class CircleAreaMethodOverLoading {
	
	void area()
	{
		int  radius = 5;
		double pi = 3.124;
		double area = pi*radius*radius;
		System.out.println("Radius of circle from no parameters method "+area);
		}
	
	double area(int radius,double pi)
	{
		return   pi*radius*radius;
	}
	
	float area(int radius,float pi)
	{
		return   pi*radius*radius;
	}

	public static void main(String[] args) {
		CircleAreaMethodOverLoading obj = new CircleAreaMethodOverLoading();
		obj.area();
		System.out.println("Radius of Circle from double  Area method "+obj.area(8, 3.128));
System.out.println("Radius of Circle from Float Area method : "+obj.area(6, 10.23f));
	}

}
