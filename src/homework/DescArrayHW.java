package homework;

public class DescArrayHW {

	public static void main(String[] args) {
		
		
	//	"Descending Order : "
		
		int a[]= {10,40,3,50,88,8,22};
		
		int temp;
		
		for(int i=0;i<a.length;i++)
		{
			for (int j = 0;j<a.length;j++)
			{
				if (a[i]>a[j])
						{
			temp = 	a[i];
			a[i] = a[j];
			a[j] = temp;
			
					
						}
			}
		}
		
		
		for(int i =0;i<a.length;i++)
		{
			
			System.out.print(a[i]+" ");
		}
		
		System.out.println("*********************");
		//Ascending Order
		
		int b[] = {10,40,50,33,2,2,38,70};
		
		
		int temp1 ;
		for (int i = 0;i<b.length;i++)
		{
			for (int j = 0;j<b.length;j++)
			{
				if (b[i]<b[j])
				{
					temp = b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		
		for (int i = 0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		
		
	}
	
}