package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEg {

	public static void main(String[] args) {
		//creating & adding
		Deque<String> dq=new ArrayDeque<String>();  
		//adding elements
		dq.add("Ram");
		dq.add("Karan");
		dq.add("Riya");
		dq.add("Priya");
		dq.add("Sam");
		dq.add("Ajay");
		for(String s : dq) {
			System.out.println(s); //Original element
			dq.addFirst("Shree");
			dq.addLast("Riya");
			System.out.println("New List"); //modified list after adding element
			for(String s1 : dq) {
				System.out.println(s1);
			}
			dq.removeFirst();
			dq.removeLast();
			System.out.println("New list after removal");	//modified list after remove
			for(String s2:dq) {
				System.out.println(s2);
			}
		}
	}
}
