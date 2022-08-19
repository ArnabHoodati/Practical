package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEg {

	public static void main(String... args) {
		Set<String>s4 = new HashSet<String>();
		s4.add("Pen");
		s4.add("Pencil");
		s4.add("Mouse");
		s4.add("Phone");
		s4.add(null);
		s4.add("Ac");
		s4.add("Earphone");
		s4.add("Pen");
		   Iterator<String> i=s4.iterator();  
	    while(i.hasNext())  
	    {  
	    System.out.println(i.next());  
	    } 
	}

}
