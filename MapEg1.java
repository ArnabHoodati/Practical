package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEg1 {

	public static void main(String[] args) {
		Map mp = new HashMap();
		mp.put(1, "Pallabi");
		mp.put(2, "Rahul");
		mp.put(5, "Sweta");
		mp.put(7, "Karan");
		Set set = mp.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext()) {
			//converting to Map
	        Map.Entry en=(Map.Entry)i.next();  
	        System.out.println(en.getKey()+" "+en.getValue());  
		}

	}

}
