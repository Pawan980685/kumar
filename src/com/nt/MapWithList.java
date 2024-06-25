package com.nt;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class MapWithList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<String, List<String>> map=new LinkedHashMap<>();
		
		List<String> list1=Arrays.asList("Apple","Banana","Grapse","Radish");
		List<String> list2=Arrays.asList("Papaya","Orange","Grapse","Radish");
		List<String> list3=Arrays.asList("Mango","Banana","Grapse","Radish");
		map.put("Pawan", list1);
		map.put("Kumar", list2);
		map.put("Madal", list3);
		System.out.println(map);
		
		map.forEach((key,value)->System.out.println("key: "+key + "  value:"+value));
	}

}
