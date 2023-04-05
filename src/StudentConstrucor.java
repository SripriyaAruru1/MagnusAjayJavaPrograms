
public class StudentConstrucor {
	int Rollnumber;
	String Studentname;
	
	StudentConstrucor(String name,int Rollno)
	{
		Rollnumber = Rollno;
		Studentname = name;
	System.out.println("calling the  constuctor: "+Rollnumber+ "  "+Studentname);
		
	}
	
//	void printdata()
//	{
//		System.out.println("Name : " +Studentname+" rollnum: " + Rollnumber);
//	}
	

	public static void main(String[] args) {
		
		StudentConstrucor sri = new StudentConstrucor("Sri",1001);
		StudentConstrucor suku = new StudentConstrucor("suku",1002);
		//sri.printdata();
		//System.out.println("calling the  constuctor: "+sri.Rollnumber+ "  "+sri.Studentname);
	}

}
