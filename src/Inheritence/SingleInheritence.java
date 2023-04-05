package Inheritence;

public class SingleInheritence {

	public static void main(String[] args) {
		
		B obj = new B();
		obj.printData();
		obj.showData();
		obj.printMes();
		System.out.println(" a value = "+obj.a+"b value = "+obj.b);
		
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
		System.out.println("child class show data method b = "+b);
	}
}