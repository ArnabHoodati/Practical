package Collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueEg {
	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("Akash");
		queue.add("Sayan");
		queue.add("Sankhajit");
		queue.add("Hasan");
		queue.add("Jaita");
		queue.add("Owashim");
		queue.add("Tanmoy");			
		System.out.println("head: "+queue.element());
		System.out.println("head: "+queue.peek());		
		System.out.println("Iterating the queue elements:");  
		Iterator itr=queue.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}
		queue.poll();										
		queue.remove();										
		System.out.println("After removing");	
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		} 
	}
}
