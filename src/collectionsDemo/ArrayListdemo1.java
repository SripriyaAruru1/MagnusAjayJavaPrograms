package collectionsDemo;
import java.io.*;
import java.util.*;


public class ArrayListdemo1 {
	public static void main(String[] args) {
		
	ArrayList al = new ArrayList();
	//ArrayList<Integer> al1 = new ArrayList<Integer>();
	//giving values to array;
	al.add(100);
	al.add("Sripriya");
	al.add(1, "Sri");
	al.add(50.55);
	al.add('S');
	al.add(true);
	System.out.println(al);
	
//	//Remove
//	al.remove(1);
//	System.out.println(al);
//	al.remove("Sripriya");
//	System.out.println(al);
//	
//	//Retrive the value
//	al.get(0);
//	System.out.println(al.get(0));
//	//to replace the value
//	System.out.println(al);
//	al.set(1, "Sripriya");
//	System.out.println(al);
//	
//	// to check for particular value
//	al.contains("S");
//	System.out.println(al.contains(50.55));
//	// is empty
//	System.out.println("Array size is : "+al.size());
//	System.out.println(al);
//	//	//al.removeAll(al);
////	System.out.println(al);
////	System.out.println(al.isEmpty());
//	// to read data from arraylist by using for loop 
//	
	for (int i =0;i<=al.size()-1;i++)
	{
		System.out.println(al.get(i));
	}
	
	//// to read data from arraylist by using for  eachloop
	
	for (Object e:al)
	{
		System.out.println(e);
	}
	
	// to read data from arraylist by using for  Iterator interface.
	
	Iterator it = al.iterator();//Iterator interface is reading the data through arraylist method called iterator with command like al.iterator
	while(it.hasNext()) // checks whether that element is available or not
	{
		System.out.println("Iteration method reading : "+it.next()); //if element available prints all elements automatically goes next
	}
	
}

}
