package array;

public class MaxArray {

	public static void main(String[] args) {
		
		int a[] = {10,20,30,40,50,60,70,80};
		//int a[] = new int[20]---size of array
		
		int maxnumber = 0;
		for (int i = 0;i<a.length;i++)
		{
			if (maxnumber < a[i])
			{
				maxnumber = a[i];
			}
		}
		System.out.println(maxnumber);

	}

}
