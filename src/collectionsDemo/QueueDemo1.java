package collectionsDemo;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo1 {

	public static void main(String[] args) {
		
		PriorityQueue pq = new PriorityQueue(); 
		
		// add() and offer()
		pq.add("A");
		pq.add("B");
		pq.add("C");
		pq.offer("C");
		pq.offer(100);//
		System.out.println(pq);// not allowed in queue hetrogenious data. Exception in thread "main" java.lang.ClassCastException:---
		
		// get head elemet- elemet()and peek()
		
	//System.out.println(pq.element()); //A-Head element---if queue is empty --Exception in thread "main" java.util.NoSuchElementException
		//System.out.println(pq.peek());//A A-Head element--if queue is empty -Null
		
// return and remove the element immediately --remove() and poll()

	System.out.println(pq.remove());//return head element A and removes immediately.
	System.out.println(pq);//---[B, C, C]-- removed the head element after return------remove return exception if queue is empty 
	
	//System.out.println(pq.poll()); //---return head element B and removes immediately.
	//System.out.println(pq); //[C, C] -- removed the head element after return  ---poll return null in case os queue is empty
	
	// to read the elements in the queue each loop and iterator only no for loop. get will not work here
	
	for (Object ob:pq)
	{
		System.out.println(ob);
	}
		
	Iterator it = pq.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	
	}
	
	
	

}
