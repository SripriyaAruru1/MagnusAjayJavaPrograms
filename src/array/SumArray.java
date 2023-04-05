package array;

public class SumArray {

	public static void main(String[] args) {
		
		
		int a[]= {10,20,11,40,50,25,90};
		int sum = 0;
		
		for (int i = 0;i<a.length;i++)
		{
			sum = sum+a[i];
			System.out.print(a[i]+ " + ");
		}
		
System.out.println(" =  "+sum);
	}
	

}
