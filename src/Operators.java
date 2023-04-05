
public class Operators {
	
	 public static void main(String[] args) {
		 
		 int a = 30;
		 int b = 40;
		 System.out.println(a==b);
		 // pre or post increment examples
		 System.out.println(++a);//31
		 System.out.println(a++);//31
		 System.out.println(a);//32
		 System.out.println(a++);//32
		 System.out.println(a++);//33
		 System.out.println(a++);//34
		 int c = a++;
		 System.out.println(c);//35
		 System.out.println(a);//36
		 int d = ++a;
		 System.out.println(d);//37
		 System.out.println(a++);//37 ----a =38
		 System.out.println(++a);//39
		 
		 //Pre or post drecrement examples
		 
		 System.out.println(--a);//38
		 System.out.println(a--);//38- a =37
		 System.out.println(--a);//36
		 	System.out.println(a--);//36 a =35
		 			System.out.println(a);

}
}