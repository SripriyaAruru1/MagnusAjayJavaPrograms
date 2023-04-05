package collectionsDemo;

import java.util.LinkedList;

public class LinkedListDemo3 {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		
		l.add("Dog");
		l.add("Dog");
		l.add("Cat");
		l.add("Horse");
		
		System.out.println(l);
		l.addFirst("Cow");
		l.addLast("Tiger");
		System.out.println(l);
		
		System.out.println("First element : "+l.getFirst());
		System.out.println("Last element : "+l.getLast());
		
		l.removeFirst();
		l.removeLast();
		System.out.println("After removing first and last elements :"+l);
		
		
	}

}
