package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayIterate {
	public static void main(String... args) {
		//creating array list
		List<String> al = new ArrayList<String>();
		//adding object to array list
		al.add("Red");
		al.add("Green");
		al.add("Orange");
		al.add("White");
			System.out.println("traversing using Iterate"); //print the line
			Iterator<String> itr = al.iterator();	//getting the iterator
			while (itr.hasNext()) {		//checking iterator has element
				System.out.println(itr.next()); //printing array list after iterate
		}
	}

}
