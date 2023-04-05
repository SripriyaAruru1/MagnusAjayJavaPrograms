package homework;

public class MethodHW {
	
	String name = "Sripriya";
	int rollnum = 1001;
	static String college = "SVU";
	boolean currentstudent;
	
	
	void Student(boolean currentstudent)
	{
		System.out.println(name+" "+rollnum+" "+college+" "+currentstudent);
	}
	
	int Cal(int a,int b)
	{
//		int c = a+b;
//		return c;
		if (a>b)
			return a;
		else
			return b;
		
	}
	
	void Sub()
	{
		int a = 40;
		int b = 10;
		int c = 20;
		int d = a-b-c;
		System.out.println("sub method results is : "+d);
	}

	
	int Mul(int a)
	{
		//int c = 20;
		int e = a *2;
		return e;
	}
}
