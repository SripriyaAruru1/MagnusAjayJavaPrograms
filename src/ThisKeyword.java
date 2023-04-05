
public class ThisKeyword {
	
	int a;
	int b;
	// this refere to current class instance variable 
	void setData(int c,int d)
	{
		this.a = c;
		this .b = d;
		getData();
	}
	
	void getData()
	{
		System.out.println("a = :"+ a +" b = : "+b);
	}

	public static void main(String[] args) {
		
		ThisKeyword obj = new ThisKeyword();
		obj.setData(10, 20);
		//obj.getData();
		
	}

}
