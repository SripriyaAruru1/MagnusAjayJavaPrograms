package collectionsDemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {
		
		//duplicates not allowed, insertion order not preserved
		
		HashSet h = new HashSet();
		HashSet <Integer>h1 = new HashSet<Integer>();
		
		HashSet s = new HashSet(100); // to set the size
		HashSet s1= new HashSet(100, 0.95f);// to set with load factor
		
		h.add("Sripriya");
		h.add(1000);
		h.add('S');
		h.add(20.22);
		h.add(true);
		h.add("Welcome");
		h.add(null);
		
		System.out.println(h);// [null, Sripriya, S, 1000, 20.22, Welcome, true] output is like this which is not in insertion order.
		
		HashSet h_dup= new HashSet();
		
		h_dup.addAll(h);
		System.out.println(h_dup);
		
		h_dup.removeAll(h);
		System.out.println(h_dup);
		
		System.out.println(h.contains('s'));
		
	//	for reading objects  with for loop not possible becaue we dont have "get" method here.
		
	/*	for (int i = 0;i>=h.size();i++)
		{
			System.out.println(h.get(i));
		}*/
		
//		for reading objects  with for each loop
		
		for (Object e:h)
		{
			System.out.println(e);
		}
		
		
//for reading objects  with iteration
		System.out.println("______________________");
		Iterator it = h.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
