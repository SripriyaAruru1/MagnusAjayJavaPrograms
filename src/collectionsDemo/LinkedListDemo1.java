package collectionsDemo;

import java.util.Iterator;
import java.util.LinkedList;



public class LinkedListDemo1 {

	public static void main(String[] args) {
		//LinkedList<Integer> l = new LinkedList<Integer>();//to save homogeneous data
		//LinkedList<String> l = new LinkedList<String>();
		
		LinkedList l = new LinkedList();// to save hetrogenius data
		
		l.add(100);
		l.add("Sripriya");
		l.add("Welcome");
		l.add(50.05);
		l.add('S');
		l.add(true);
		l.add(null);
				System.out.println(l);
				System.out.println("Size of linked list is :"+l.size());
				System.out.println("Get of first: "+l.getFirst());
				l.set(0, 1000);
				System.out.println("set of 0 index 100 to : "+l);	
				l.add(2, "Loves Java");
				System.out.println(l);			
				
				//to read data from linked list by for loop
				
				for (int i=0;i<=l.size()-1;i++)
				{
					System.out.println(l.get(i));
				}
				
//to read data from linked list by for each loop
				System.out.println("_______________________");
				for (Object e :l)
				{
					System.out.println(e);
				}	
				//to read data from linked list by iterator 
				System.out.println("************************");	
		
		Iterator it = l.iterator(); 
		while (it.hasNext())//checks it has next objects 
		{
			System.out.println(it.next()); 
		}
	}

}
