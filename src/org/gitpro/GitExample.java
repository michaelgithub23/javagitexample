package org.gitpro;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class GitExample {

public static void main(String[] args) {
		
		
		//create an object for map
		
		Map<String,Integer>m = new LinkedHashMap();
		m.put("csk",100);
		m.put("rcb",200);
		m.put("kkr",300);
		m.put("srh",400);
		m.put("rr",500);
		m.put("mi",600);
		m.put("gt",700);
		m.put("lsg",800);
		
		//to print all the key and values in map
		System.out.println(m);
		
		//to kmow the size of the map
		int size = m.size();
		System.out.println(size);
		
		//to check the given is present r not
		boolean containsKey = m.containsKey("csk");
		System.out.println(containsKey);
		
		//to remove a value by passing the key
		
      m.remove("mi");
      System.out.println(m);
      
      //to get the value passing the key
      Integer integer = m.get("csk");
      System.out.println(integer);
      
      //to print the only keys
      
     Set<String> keySet = m.keySet();
     System.out.println(keySet);
     
     
     //to print only the values
     Collection<Integer> values = m.values();
     System.out.println(values);
     
      
      //to iterate a map we need to use entryset
     
      Set<Entry<String, Integer>> entrySet = m.entrySet();
      System.out.println(entrySet);
      
      
      //to iterate all the key and value combinations
      
      for (Entry<String, Integer> entry : entrySet) {
		
    	  System.out.println(entry);
    	  
	}
      
      //to iterate only the key
      
     for (Entry<String, Integer> entry : entrySet) {
    	 String key = entry.getKey();
    	 System.out.println(key);
		
	}
     
     for (Entry<String, Integer> entry : entrySet) {
	
    	 Integer value = entry.getValue();
    	 System.out.println(value);
	}
     
}
	
}
