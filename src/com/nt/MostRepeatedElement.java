package com.nt;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedElement {

	public static void main(String[] args) {
		List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
		Map<String, Long> collect = listOfStrings.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		//System.out.println(collect);
		Entry<String, Long> entry = collect.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		
		System.out.println(entry.getKey()+" "+entry.getValue());
		//collect.entrySet().stream().max(Comparator.comparing(Map.Entry.comparingByKey().toString()));
		/*for(Map.Entry<String, Long> map:collect.entrySet()) {
			if(map.getValue()>1) {
				//System.out.println(map.getKey()+"  "+map.getValue());
			}*/
		}
	}
//}
