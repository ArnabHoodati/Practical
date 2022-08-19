package Collections;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
        //Create vector
        Vector<String> vc = new Vector<String>(4);
        //Adding elements to a vector  
        vc.add("Dog");  
        vc.add("Cat");  
        vc.add("Tiger");  
        vc.add("Lion"); 
        System.out.println("Size:"+vc.size());
        System.out.println("Size:"+vc.capacity());
        //add more element
        vc.addElement("cow");
        vc.addElement("goat");
        System.out.println("After adding elements:");
        System.out.println("Size:"+vc.size());
        System.out.println("Size:"+vc.capacity());
        //checking cat is present in the vector or not
        System.out.println(vc);
        if(vc.contains("Cat"))  {
        	System.out.println("Element present");
        }
        else {
        	System.out.println("Element not present");
        }
        //Get the first element  
        System.out.println("The first animal of the vector is = "+vc.firstElement());   
        //Get the last element  
        System.out.println("The last animal of the vector is = "+vc.lastElement());   
        //checking index of specified element
        System.out.println("index:"+vc.indexOf("Cat"));
	}
}