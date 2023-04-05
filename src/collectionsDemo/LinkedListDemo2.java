package collectionsDemo;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		l.add('X');
		l.add('Y');
		l.add('Z');
		l.add('A');
		l.add('B');
		l.add('C');
		
		LinkedList l_dup = new LinkedList();
		
		l_dup.addAll(l);
		System.out.println(l_dup);
		
		l_dup.removeAll(l);
		System.out.println(l_dup);
		
		System.out.println("Before Sorting:"+l);
		Collections.sort(l); 
		System.out.println("After Sorting:"+l);
		
		//reverse order
		
		Collections.sort(l, Collections.reverseOrder());
		System.out.println("Reverse order:"+l);
		
		//Shuffle
		
		Collections.shuffle(l);
		System.out.println("Shuffle of elements:"+l);

	}

}
