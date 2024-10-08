package Collections;

import java.util.*;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {
		
		 Map<Integer,String> map = new HashMap<>();
		 
		 map.put(1, "Deep");
		 map.put(2,"Sam");
		 map.put(3, "John");
		 map.put(4, "Ritu");
		 
		 
		 Iterator<Integer> itr = map.keySet().iterator();
		 
		 while(itr.hasNext()) {
			 				Integer k = itr.next();
			 				
			 				String v = map.get(k);
			 				
			 				System.out.println("key= "+ k +" value= "+ v);
		 }
		 
		 System.out.println("*****************");
		 
		  Iterator<Entry<Integer, String>> itr2 = map.entrySet().iterator();
		  
		  while(itr2.hasNext()) {
			  
			     Entry<Integer, String> next = itr2.next();
			     
			     System.out.println("k="+next.getKey() + " v= "+ next.getValue());
		  }
		System.out.println("*****************");
		
		  map.forEach((k,v)->System.out.println("key= "+ k +" value= "+ v));
		

	}

}
