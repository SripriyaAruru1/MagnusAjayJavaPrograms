
public class ThisForConsructor {
	
//this can be used to invoke current class constructor (this should be first line of constructor)
	
	
	ThisForConsructor()
	{
		this(10);
		System.out.println("This is 0 arg constructor");
	}
	
	ThisForConsructor(int a)
	{
		this(10,20);
		System.out.println("This is 1 arg constructor");
	}
	
	ThisForConsructor(int a,int b)
	{
		//this. should be the first line of constructor.
		this(10,20,30);
		System.out.println("This is 2 arg constructor");
	}
	ThisForConsructor(int a,int b,int c)
	{
		//this(10)--it is error . this process will continue if we call from last constructor.
		System.out.println("This is 3 arg constructor");
	}
	
	
	public static void main(String[] args) {
		ThisForConsructor obj = new ThisForConsructor();
		System.out.println("End of line");

	}

}
