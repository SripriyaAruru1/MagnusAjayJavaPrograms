package MultilevelInheritence;



public class MultilevelDemo {

	public static void main(String[] args) {
		C obj = new C();
		obj.printData();
		obj.showData();
		obj.printMes();
		obj.displayData();
	}

}
class A{
	int a = 20;
	
	void printData()
	{
		System.out.println("Parent class print Data method  = : "+a);
	}
	void printMes()
	{
		System.out.println("Parent class print Mess method  = : "+a);
	}
	
}
class B extends A{
	int b = 20;
	void showData()
	{
		System.out.println(" B child class show data method b = "+b);
	}
}

class C extends B{
	int c = 40;
	void displayData()
	{
		System.out.println("C Child classs Method an variable " +c);
	}
}