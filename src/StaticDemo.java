
public class StaticDemo {

	void display()
	{
		System.out.println("Display nonstatic or instance method");
	}
	
	static void show()
	{
		System.out.println("static show method");
	}
	
	void display1()
	{
		display();
	}
	public static void main(String[] args) {
		
		
		StaticDemo obj = new StaticDemo();
		obj.display();
		show();
		obj.display1();
		
		//this and super holds objects of this class and super holds objects pf super class
		

	}
	
	
}
