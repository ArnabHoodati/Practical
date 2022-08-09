package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayInsert {
	public static void main(String... args) {
		//creating array list
		List<String> al = new ArrayList<String>();
		//adding object to array list
		al.add("Red");
		al.add("Green");
		al.add("Orange");
		al.add("White");
		al.add("Black");
		System.out.println(al); //printing array list object
		//insert a object at the first position of the list
		al.add(0, "Pink");
		System.out.println(al);	//print the array after inserting object
	}
}
