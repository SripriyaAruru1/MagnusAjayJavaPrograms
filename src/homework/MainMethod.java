package homework;

public class MainMethod {

	public static void main(String[] args) {
		
		MethodHW obj = new MethodHW();
		//obj.Cal(10,20);
		obj.Sub();
	//	obj.Mul();
		System.out.println("Global variabls : " +obj.name);
		System.out.println(obj.rollnum);
		System.out.println(obj.college);
System.out.println("Greateste number is "+ obj.Cal(10, 20));
System.out.println("Cal method result return value : "+ obj.Cal(10,20));
//System.out.println("Mul method result: "+obj.Mul());
obj.Student(false);

System.out.println(obj.Mul(obj.Cal(10, 20)));


	}

}
