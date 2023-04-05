package homework;

public class Encapsulation {
	
	private String gender;
	private int age;
	
	void setData(String gender,int age)
	{
		this.gender = gender;
	    this.age = age;
	    if (age >=18)
	    {
	    	getGender();
	    }
	    else
	    {
	    	System.out.println("Age is below 18 cannot show the gender");
	    }
	}
	
	void getGender()
	{
		System.out.println("Age is above 18 and the gender is :"+this.gender);
	}
	
int getAge()
{
	int a = age;
	return age;
}

public static void main(String[] args) {
	Encapsulation obj = new Encapsulation();
	obj.setData("Male", 18);
	//obj.getGender();
	System.out.println("The age is : "+obj.getAge());
	
}

}
