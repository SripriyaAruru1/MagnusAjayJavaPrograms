
public class ConsructorDemo {
// constructor - as soon as object created constructor is invoked 
	
	int a;
	int b;
	
	ConsructorDemo()
	{
		a = 10;
		b = 20;
		System.out.println("This is constructor ");
	}
	
	ConsructorDemo(int a,int b)
	{
		this.a = a;
		this.b = b;
		int c = a+b;
		System.out.println("The value of c: "+c);
	}
	//with same no of arguments with different datatypes it will allow
	ConsructorDemo(float a,float b)
	{
		System.out.println("Float argument ");
	}
	
	ConsructorDemo(short a)
	{
		System.out.println("short  argument ");
	}
	
	public static void main(String[] args) {
		ConsructorDemo obj = new ConsructorDemo();
		System.out.println("End of main method");
		// each constructor we have to create seperate object
		ConsructorDemo obj1 = new ConsructorDemo(10.2f,20.5f);
		ConsructorDemo obj2 = new ConsructorDemo((short)10);
		ConsructorDemo obj3 = new ConsructorDemo(30,40);
		
			}

}
