package com.nt;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
		
		Map<String, Long> collect = stationeryList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect);
		
		/*
		 * Map<String, Long> collect2 =
		 * collect.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey,
		 * Map.Entry::getValue)); System.out.println(collect2);
		 */
		//.forEach(entry -> System.out.println(entry.getKey() + " = " + entry.getValue()));
		
		collect.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " = " + entry.getValue()));
		
		for(Map.Entry<String, Long> map:collect.entrySet()) {
		 System.out.println(map.getKey()+  "="+map.getValue());	
		}

	}

}
