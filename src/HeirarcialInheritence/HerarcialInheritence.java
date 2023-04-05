package HeirarcialInheritence;



public class HerarcialInheritence {

	public static void main(String[] args) {
		
		// can acess only A and B methods
		B objb = new B();
		objb.printData();
		objb.printMes();
		objb.showData();
		// can access only A and C methods
		System.out.println("___________________________________________________");
C objc = new C();
objc.printData();
objc.printMes();
objc.displayData();

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
class C extends A{
	int c = 40;
	void displayData()
	{
		System.out.println("C Child classs Method an variable " +c);
	}
}