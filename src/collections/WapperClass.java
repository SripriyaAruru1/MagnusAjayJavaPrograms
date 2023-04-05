package collections;

public class WapperClass {

	public static void main(String[] args) {
		int a = 10;
		//to convert int in object collection 
		Integer obj = new Integer(a);
		System.out.println("convert primitive  into object : "+obj);
	
		
		//to convert back as objcet into primitive
		int b = obj ;
		System.out.println("convert object into primitive : "+b);
	}

}
