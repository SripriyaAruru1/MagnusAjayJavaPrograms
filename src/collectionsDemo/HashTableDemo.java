package collectionsDemo;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		
		//Hashtable t = new Hashtable();
		//Hashtable t = new Hashtable(100);// initial capacity 100
		//Hashtable t = new Hashtable(100,0.90); // initial capacity 100
		
		Hashtable <Integer,String> t = new Hashtable<Integer,String>();
		
		t.put(101, "john");
		t.put(102,"David");
		t.put(103,"Smith");
		t.put(null,"David"); // nulls are not allowed in key and values in hash tble
		
		System.out.println(t);
		
		
		
		
	}

}
