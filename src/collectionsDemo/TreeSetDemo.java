package collectionsDemo;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// Heterogeneous object are not allowed ● Null insertion is possible. but throughs exception null pointer exceptoion  ● Sort and navigation
		
		TreeSet ts = new TreeSet<>();
		
		ts.add(10);
		ts.add(40);
		ts.add(22);
		ts.add(54);
		ts.add(66);
		System.out.println(ts.add(10));
		ts.add(19);
		
		
		System.out.println(ts);//[10, 19, 22, 40, 54, 66]-ascending order 
		
	//ts.descendingSet();
		System.out.println("Descending order without object :"+ts.descendingSet());//Descending order[66, 54, 40, 22, 19, 10]
		
		NavigableSet ns = ts.descendingSet();
		System.out.println("with object navigable set:"+ns);
		
		System.out.println("Headset of 54:"+ts.headSet(54));//below 54:_ [10, 19, 22, 40]
		System.out.println("Tail of 54:"+ts.tailSet(54));// above 54 --[54, 66]
		
		//System.out.println("with boolean tailset"+ts.tailSet(74, false));
		System.out.println("First :"+ts.first());
		System.out.println(ts);
		System.out.println("First :"+ts.last());
		System.out.println("floor 75 "+ts.floor(75));
		System.out.println(ts);
	}

}
