package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEg {
		 public static void main(String... args){  
		  //Creating & adding elements  
		  TreeSet<String> set = new TreeSet<String>();  
		  set.add("M");  
		  set.add("N");  
		  set.add("O");  
		  set.add("P");  
		  set.add("Q");
		  //Traversing elemenset through iterator in descending
		 // Iterator i=set.descendingIterator(); 
		  //Iterator<String> itr=set.iterator();  
		  //while(itr.hasNext()){  
		  // System.out.println("Lowest Value:"+set.pollFirst());  
		  // System.out.println("Highest Value: "+set.pollLast());  
		  
		  //Navigable set operation
		  System.out.println("Original set"+set);
		  
		  System.out.println("Reverse Set: "+set.descendingSet()); //reverse set
		  
		  
		  //sortedset set operation
		  System.out.println("Head Set: "+set.headSet("O")); //head set
		  
		  System.out.println("SubSet: "+set.subSet("M", "Q"));  //subset
		  
		  System.out.println("TailSet: "+set.tailSet("O"));  //tail set
		  }  
		 }  
