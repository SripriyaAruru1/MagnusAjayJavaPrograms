package collectionsDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapWithEntryMethods {

	public static void main(String[] args) {
		
		HashMap <Integer,String>  hp = new HashMap<Integer,String>();
		
		hp.put(101, "Sri");
		hp.put(101, "Sri");
		hp.put(103, "Sri");
		hp.put(104, "Priya");
		hp.put(105, "kumar");
		
		System.out.println(hp);
		
		
		//Entry interface methods
				//  to capture all the entries - entry set.  see program HashMapWithEntryMethods
				
				for ( Map.Entry entry  : hp.entrySet())   // Map.entry is the data type of variable entry
				{
					System.out.println(entry.getKey()+"  "+entry.getValue());
				}
				
		Set s = hp.entrySet();
		
		 Iterator it = s.iterator();
		 while (it.hasNext())
		 {
			 Map.Entry entry=(Entry) it.next();
			 System.out.println(entry.getKey()+"   "+entry.getValue());
		 }
				 
		
		
	}

}
