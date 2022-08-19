package Collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeHashMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();   
		tm.put(200, "riya");
		tm.put(205, "priya");
		tm.put(202, "rima");
		tm.put(201, "rohit");
		tm.putIfAbsent(102, "arnab");
		tm.putIfAbsent(103, "virat");
		
		//descending order
		System.out.println("Descending map:"+tm.descendingMap());
		
		//head map return keys pairs whose keys are less than/equal to the specific value
		System.out.println("Head map:"+tm.headMap(201,true));
		
		//tail map return keys pairs whose keys are greater than/equal to the specific value
		System.out.println("tailMap: "+tm.tailMap(201,true));  
		
	    //sub map rReturns key-value pairs exists in between the specified key.  
	    System.out.println("subMap: "+tm.subMap(201, true, 205, true)); 
	    
	      //Sorted Map
			//head map return keys pairs whose keys are less than/equal to the specific value
			System.out.println("Head map:"+tm.headMap(201));
			
			//tail map return keys pairs whose keys are greater than/equal to the specific value
			System.out.println("tailMap: "+tm.tailMap(201));  
			
		    //sub map rReturns key-value pairs exists in between the specified key.  
		    System.out.println("subMap: "+tm.subMap(201, 205)); 
		
		//traversing map
		for(Map.Entry m:tm.entrySet())  {
			  System.out.println(m.getKey()+" "+m.getValue());    
		}
			  tm.remove(205);
			  System.out.println("After removing:");
				for(Map.Entry m:tm.entrySet())  {
					  System.out.println(m.getKey()+" "+m.getValue());   
			}
		}
	}