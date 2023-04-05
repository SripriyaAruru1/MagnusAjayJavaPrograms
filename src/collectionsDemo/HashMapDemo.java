package collectionsDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		//	Insertion order is not preserved.
		
		//HashMap hp = new HashMap();
		HashMap <Integer,String>  hp = new HashMap<Integer,String>();
		
		hp.put(101, "Sri");
		hp.put(101, "Sri");
		hp.put(103, "Sri");
		hp.put(104, "Priya");
		hp.put(105, "kumar");
		//hp.put(null, null);
		System.out.println(hp.put(106, null));
		
		System.out.println(hp);
		
		HashMap hp1 = new HashMap();
		
		hp1.put(101, "Sri");
		hp1.put(101, "Sri");
		hp1.put(103, "Sri");
		hp1.put(104, "Priya");
		hp1.put(105, "kumar");
	//	hp1.put(null, null);
		
		hp1.putAll(hp);
		hp1.put(500,"Sripriya");
		System.out.println(hp1);
		
		System.out.println(hp1.get(500));
		System.out.println(hp1.remove(null));
		System.out.println(hp1);
		
		hp1.replace(105, "Sukumar");
		System.out.println(hp1);
		
		System.out.println(hp1.hashCode());
		
		System.out.println(hp1.containsKey(105));
		System.out.println(hp1.containsValue("Sree"));
		
		System.out.println(hp1.keySet());// returns all keys of the collcetion-return object is set
		System.out.println(hp1.values());// returns all values of the collcetion-return object is collection
	
		System.out.println(hp1.entrySet());//returns all the entries
		
		//to read the elements of hashmap
		
		for(Object o:hp1.keySet())
		{
			System.out.println("ONLY KEYS:"+o);
		}
	
		
		for(Object o1:hp1.values())
		{
			System.out.println(o1);
		}
	
		
		for(Object o2:hp1.entrySet())
		{
			System.out.println("Entry set output:"+o2);
		}
		
		
		for (Object o4:hp1.keySet() )
		{
			System.out.println(o4+"   "+hp1.get(o4));
		}
	
	
		
	}

}
