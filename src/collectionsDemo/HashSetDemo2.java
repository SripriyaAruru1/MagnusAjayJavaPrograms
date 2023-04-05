package collectionsDemo;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		
		//duplicates not allowed, insertion order not preserved
		// union, intersection,difference-- 
		// no  union all as it allows duplicates, in hashset no duplicates so no union all in hashset only union
		HashSet <Integer> set1 = new HashSet<Integer>();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		System.out.println("Set 1: "+set1);
		
HashSet <Integer> set2 = new HashSet<Integer>();
		
		
		set2.add(3);
		set2.add(4);
		set2.add(5);

		System.out.println("Set 2: "+set2);
		
		/*//union-addAll prints only unique elements
				set1.addAll(set2);
				System.out.println("Union: "+set1);// [1, 2, 3, 4, 5, 6, 7]- unique elementss
				
		// intersection -retainAll  presents common elemets
				set1.retainAll(set2);
				System.out.println("intersection: "+set1);// [1, 2, 3, 4, 5, 6, 7]- unique elementss*/	
			/*// diference ---
								set1.removeAll(set2);
				System.out.println("Difference: "+set1);*/
		//subset
				System.out.println(set1.containsAll(set2));
				System.out.println("Subset of : "+set1);
		
		
	}

}
