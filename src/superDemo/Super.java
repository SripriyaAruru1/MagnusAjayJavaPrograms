package superDemo;

public class Super {

	public static void main(String[] args) {
		C b = new C();
		b.print();
		
	}

}
class A {
	int a = 30;
}
class B extends A{
	int a = 10;
	
	void print()
	{
		System.out.println("a = "+ super.a);
		System.out.println("a = "+a);
	}
}
class C extends B{
	int a = 40;
	void print()
	{
		System.out.println(super.a); /// immediate parent class value prints that is 10
		super.print();
	}
	
}