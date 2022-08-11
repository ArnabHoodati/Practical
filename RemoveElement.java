package Collections;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {

	public static void main(String[] args) {
		//creating array list
		List<String> al = new ArrayList<String>();
		//adding object to array list
		al.add("Red");
		al.add("White");
		al.add("Blue");
		al.add("Green");
		al.add("Black");
		al.remove(2);	//removing 3rd element
		System.out.println(al); //print after moving
	}

}
