package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {

	public static void main(String... args) {
		//creating HashSet and adding elements
	HashSet<String>set=new HashSet();
	set.add("ram");
	set.add("rima");
	set.add("shyam");
	set.add("rahim");
	set.add("ram");
	System.out.println("Original list"+set);
	//removing specific element from hashSet
	set.remove("ram");
	System.out.println("After invoking remove:"+set);
	HashSet<String>set1=new HashSet();
	set1.add("arnab");
	set1.add("rahul");
	System.out.println("Updated list"+set);
	//remove all new elements
	set.removeAll(set1);
	//remove all
	set.clear();
	System.out.println("present list:"+set);
	
	//Iterator<String> i=set.iterator();  
    //while(i.hasNext())  
    //{  
    //System.out.println(i.next());  
    //} 
	}
}
