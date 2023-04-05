package Interfce;

public class InterfceMultipleInheritence {

	public static void main(String[] args) {
		
		C obj = new C();
		obj.add();
//		obj.a;
//		obj.b;
	
	}

}
interface A{
	 int a = 20;
	int b = 20;
	void add();
}
interface B{
	void add();
}
class C implements A,B{

	@Override
	public void add() {
		int c = a+b;
		System.out.println(c);
		
	}

	
		
	}
	
