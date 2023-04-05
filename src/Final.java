
public class Final {

	
	static final int a =  20;
	// instance block or constructor can assign value to the final variable.
//	{
//		a = 30;
	//a=40;
//	}
//	Final ()
//	{
//		a = 30;
//	}
	// for static final variable only through static block assign value not with instance block not with constructor  
//	static 
//	{
//	a = 30;
//	}
	
//	{
//		a = 30;
//	}
//	
//	Final()
//	{
//		a = 30;
//	}
	
	
	public static void main(String[] args) {
		Final f = new Final();
		// we cannot modfy the value of final variable
		//f.a = 40;
		System.out.println(f.a);
	}

}
 class login{
	 void display()
	{
		System.out.println("login parent class");
	}
}
class newlogin extends login{
	void display()
	{
		System.out.println("new login child  class");
	}
}
// outer class cannot be private but inner calss can be private