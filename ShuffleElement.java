package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleElement {
	public static void main(String[] args) {
		//creating array list
		List<String> al = new ArrayList<String>();
		//adding object to array list
		al.add("Red");
		al.add("White");
		al.add("Blue");
		al.add("Green");
		System.out.println(al);	//print the original array list
		Collections.shuffle(al);	//shuffle array list
		System.out.println(al);	//print after shuffling
	}

}
