package Inheritence;

public class InheritenceINJava {

	public static void main(String[] args) {
		
	}

}
class Parent{
	int a = 10;
	int b = 20;
	void printData()
	{
		System.out.println("a value: "+a+"B valuue is : "+b);
	}
	
	
}
class child extends Parent{
	void getData()
	{
		System.out.println("Print a value from parent class: "+a);
		printData();
	}
	
 
}