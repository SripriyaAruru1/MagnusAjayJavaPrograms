package collectionsDemo;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		//duplicates not allowed, insertion order is preserved
		LinkedHashSet lhs = new LinkedHashSet();
		
		lhs.add(100);
		lhs.add(20.10);
		lhs.add('S');
		lhs.add("Sripriya");
		lhs.add(true);
		lhs.add(null);
		lhs.add(null);
		
		System.out.println("lhs linked hashset: "+lhs);
		
LinkedHashSet lhs1 = new LinkedHashSet();
		
		lhs1.add(200);
		lhs1.add(200);
		lhs1.add(20.10);
		lhs1.add('S');
		lhs1.add("Sripriya");
		lhs1.add(false);
		lhs1.add(null);
		
		
		lhs1.addAll(lhs);
		System.out.println("lhs1 linked hashset: "+lhs1);
		
		System.out.println("Contains all "+lhs1.containsAll(lhs));
		System.out.println("lhs1 linked hashset: "+lhs1);
		
		lhs1.retainAll(lhs);
		System.out.println(lhs1);
		
		Iterator it = lhs1.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
		lhs1.removeAll(lhs);
		System.out.println(lhs1);

	}

}
