package com.nt;

import java.util.HashMap;
import java.util.Map;

public class MapCodingQuestions {
	public static void main(String[] args) {
		
	
	 HashMap<String, String> map = new HashMap<String, String>();
     
     //Adding key-value pairs to HashMap
      
     map.put("ONE", "AAA");
      
     map.put("TWO", "BBB");
      
     map.put("THREE", "CCC");
      
     map.put("FOUR", "DDD");
      
     map.put("FIVE", "EEE");
      
     //Printing key-value pairs
      
     System.out.println("HashMap Before Remove :"+map);
     System.out.println("HashMap Before Remove :"+map.keySet());
     System.out.println("HashMap Before Remove :"+map.values());
     System.out.println("HashMap Before Remove :"+map.size());
     System.out.println("HashMap Before Remove :"+map.get("ONE"));
		/*
		 * for(Map.Entry emap:map.entrySet()) {
		 * 
		 * System.out.println("HashMap Before Remove :"+emap); }
		 */
}
}
