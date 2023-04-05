package array;

public class MinArrayHW {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,70,9,30,8};
		int minnumber = a[0];
		
		for(int i = 0;i<a.length;i++)
		{
			if (minnumber > a[i] )
			{
				minnumber = a[i];
			}
		}
System.out.println(minnumber);
	}

}
