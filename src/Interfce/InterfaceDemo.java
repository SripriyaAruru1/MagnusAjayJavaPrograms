package Interfce;

public class InterfaceDemo {

	public static void main(String[] args) {
		newuser u = new newuser();
		u.addUser(20);
		u.deleteUser();
		u.editUser();
		System.out.println("Final variable : "+u.a);
	
	}

}
interface user  {
	
	 int a = 10;
	public abstract void addUser(int b);
	void deleteUser();
	void editUser();

	
}

class newuser implements user{


	@Override
	public void addUser(int b) {
	
		System.out.println("This is add user method : "+ b);
		
	}

	@Override
	public void deleteUser() {
		System.out.println("This is Delete user method");
	}

	@Override
	public void editUser() {
		System.out.println("This is Edit user method");
	}
	
}
//interface to intercae one class assignment