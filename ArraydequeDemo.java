package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArraydequeDemo {

	public static void main(String[] args) {
			//creating & adding
		  Deque<String> deque=new ArrayDeque<String>();  
			deque.add("Pallabi");
			deque.add("Subhrajit");
			deque.add("Mamta");
			deque.add("Monalisa");
			deque.offerFirst("Anju");
			System.out.println("After offer first");
			//traversing
		    for(String str:deque){  
		        System.out.println(str);  
		    }  
		    //deque.poll() & deque.pollFirst same as poll()  
		    deque.pollLast();  
		    System.out.println("After poll Last");  
		    for(String str:deque){  
		        System.out.println(str);  
		    }  
    } 
}
