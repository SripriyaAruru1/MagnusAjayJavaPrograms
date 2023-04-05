package abstractclass;

public class AbstractDemo {

	public static void main(String[] args) {
		
B obj = new B();

obj.printData();
obj.setData(50);
	}

}

abstract class A{
	
	int a = 20;
	
	A()
	{
		System.out.println("Constructor created for A abstract class");
	}
	
	
	abstract void setData(int a); 
	
	void printData()
	{
		System.out.println("a = "+a);
	}
}

class B extends A{

	@Override
	void setData(int b) {
		super.a = b;
		System.out.println("a = "+a);
		
		
	}

	
	

	
	
	
}