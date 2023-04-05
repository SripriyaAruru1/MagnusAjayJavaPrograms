
public class LogicalOperators {
	
	 public static void main(String[] args) {
		 
		 //&& and - || OR
		 // and operator return true only if both are true
		 
		 int a = 10;
		 int b = 20;
		 int c = 30;
		 
		 System.out.println(a<b && c>b);//true
		 System.out.println(true && true);//true
		 System.out.println(false && true);//false
		 System.out.println(false && false);//false
		 
		 // || OR return true if any one condition is true.
		 
		 System.out.println(a<b || c<b);//true
		 
		 // ? and : conditional operators 
		 int d = a>b?a:b;
		 System.out.println(d); // if condition is true returns a value to d, if condition it false b value is assign to d
		 
		 
		 char e = a>b?'a':'b';
		 System.out.println(e);
		 // & or | bitwise operator
		 System.out.println(3 | 5);
		 System.out.println(3 ^ 5);
		 
		 //compound operator - +=,-=,*=,/=,%=
		 
		 // int a = a+2;
		 
		 
		 int p = 20;
				 p+=2;
		 System.out.println(p);
		
		 
		 
		 
		 

}
}