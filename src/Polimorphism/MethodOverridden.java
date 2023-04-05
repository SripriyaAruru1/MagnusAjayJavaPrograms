package Polimorphism;

public class MethodOverridden {

	public static void main(String[] args) {
//		Login sbi = new Login();
//		sbi.Loginform();
		
		NewLogin hdfc = new NewLogin();
		hdfc.Loginform();

	}

}
class Login{
	
	void Loginform()
	{
		System.out.println("Enter user name");
		System.out.println("Enter password");
		System.out.println("Submit Button ");
	}
}
class NewLogin extends Login{
	
	void Loginform()
	{
		System.out.println("Enter user name");
		System.out.println("Enter password");
		System.out.println("Enter Mobile Number ");
		System.out.println("Submit Button ");
		
	}
}