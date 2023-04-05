package collectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		ArrayList al = new 	ArrayList();
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");
	//	al.add(null);
		
		// to add group of objects to other array.
		ArrayList al_dup = new 	ArrayList();
		al_dup.addAll(al);
		System.out.println(al_dup);
		
		// to remove all -to remove group of elements m
		
		al_dup.removeAll(al);
		System.out.println(al_dup);
		System.out.println(al);
		
		/*al_dup.addAll(7, al);//not working
		System.out.println("Addall with index 0: "+al_dup);*/
		
		// to sort elements collections.sort
		
		Collections.sort(al);
		System.out.println("After sorting the arraylist: "+al);
		
		// to reverse the order
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("After Sorting in reverse order:"+al);
		
		// to shuffle the elements
		
		Collections.shuffle(al);
		System.out.println("After shuffeling : "+al);
		
	}

}
