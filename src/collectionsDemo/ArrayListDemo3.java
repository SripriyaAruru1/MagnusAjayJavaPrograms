package collectionsDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		
		// to convert the array to   arraylist/ transfer the array objects to arraylist
		
		String arr[]= {"Dog","Cat","Elephant"};
		
		for(String values:arr)
		{
			System.out.println(values);//to read values in arr
		}
		
		ArrayList al = new ArrayList(Arrays.asList(arr)); //to transfer values from arr to arraylist
		System.out.println(al);

	}

}
