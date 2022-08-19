package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		//adding element
		lhm.put(200, "riya");
		lhm.put(205, "priya");
		lhm.put(202, "rima");
		lhm.put(201, "rohit");
		lhm.put(null, null);
		lhm.put(102, null);
		lhm.put(null, "arnab");
		lhm.putIfAbsent(103, "virat");
		lhm.putIfAbsent(104, "rahul");
		
		//key
		System.out.println("keys are:" +lhm.keySet());
		
		//values
		System.out.println("values are:" +lhm.values());
		
		//key-value pair
		System.out.println("keys-values pairs are:" +lhm.entrySet());
		
		//remove map element
		lhm.remove(202);
		
		//traversing
		for(Map.Entry m : lhm.entrySet()){
			System.out.println(m.getKey()+""+m.getValue());
		}
	}
}
