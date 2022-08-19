package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistDemo {

	public static void main(String... args) {

		  LinkedList<String> ll = new LinkedList<String>(); 
		  ll.add("Anudip");
		  ll.add("Arnab");
		  System.out.println("After adding");
		  //adding an element at the specific position
		  ll.add(1,"Babu");
		  LinkedList<String> ll1 = new LinkedList<String>(); //new element
		  ll1.add("aa");
		  ll1.add("bb");
		  //adding 2nd list elements to the first list
		  ll.addAll(ll1);
		  //adding an elements to the 1st list at specific position
		  ll.addAll(1,ll1);
		  //adding an elements at the 1st position
		  ll.addFirst("Skill");
		  //adding an elements at the last position
		  ll.addLast("Development");
		  //removing specific element from array list
		  ll.remove("Arnab");
		  //removing specific element on the basis of particular position from array list
		  ll.remove(1);
		  //remove all the new elements
		  ll.removeAll(ll1);
		  //remove 1st elements from the list
		  ll.removeFirst();
		  //remove last elements from the list
		  ll.removeLast();
		  //remove first occurrence element
		  ll.removeFirstOccurrence("Arnab");
		  //remove last occurrence element
		  ll.removeLastOccurrence("Arnab");
		  
		  //remove all the elements
		  ll.clear();
		  
		  Iterator<String> itr = ll.iterator();
		  while(itr.hasNext()) {
			  System.out.println(itr.next());
		  }
	}
}
