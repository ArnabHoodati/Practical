package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraylistSortEg {
	public static void main(String... args) {
		//creating array list
		List<String> al = new ArrayList<String>();
		//adding object to array list
		al.add("Subhrajit");
		al.add("Mamta");
		al.add("Monalisa");
		al.add("Anju");
		al.add("Samik");
		al.add("Pallabi");
		al.add("Khusbu");
		al.add("Bhaskar");
		al.add("Vanitha");
		al.add("Suruti");
		System.out.println("String sorted list: ");	//print the line
		Collections.sort(al);	//sorting array list
		for(String s : al) {	//using for loop
		System.out.println(s);	//print array after sorting
	}
		//creating array list
		List<Integer> al1 = new ArrayList<Integer>();
		//adding object to array list
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(50);
		al1.add(60);
		al1.add(70);
		al1.add(80);
		al1.add(90);
	System.out.println("Integer sorted list :");	//print the line
	Collections.sort(al1);	//sorting array list
	for(Integer i : al1) {	//using for loop
	System.out.println(i);	//print array after sorting
		
}
}
}
	
	
	
		


