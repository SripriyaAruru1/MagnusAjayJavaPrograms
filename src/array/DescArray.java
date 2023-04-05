package array;

import java.util.Arrays;
import java.util.Collections;

public class DescArray {

	public static void main(String[] args) {
		
		int a[] = {10,40,22,65,70,8,90,35};
	//	System.out.println("int a[] before sorting : " + Arrays.toString(a)); 
		//System.out.println("sorting array in ascending order");
	  Arrays.sort(a);		
		//System.out.println("reversing array in place"); 
		  System.out.println("Sorted array in ascending order : " + Arrays.toString(a));
		  //System.out.println("Sorted array in ascending order : " + Arrays.reverse);
		  
		
		int last = a.length - 1; 
		int middle = a.length / 2; 
		for (int i = 0; i <= middle; i++) 
		{ 
			int temp = a[i]; 
			a[i] = a[last - i]; 
			a[last - i] = temp;
		}
		
		System.out.println("Sorted array in descending order : " + Arrays.toString(a));

		
	}

}
//
//int a =10;
//int b = 20;
//int temp = 0;
//temp = a;
//a=b;
//b=temp;
//sysoutA+B
//private void sysout() {
//	// TODO Auto-generated method stub
//
//}
//
