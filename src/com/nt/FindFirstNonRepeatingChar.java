package com.nt;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFirstNonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();

		/*
		 * Map<String, Long> collect = Stream.of(inputString.split(""))
		 * .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		 * String string = collect.entrySet().stream().filter(entry -> entry.getValue()
		 * == 1).map(map -> map.getKey()) .findFirst().get();
		 * 
		 * System.out.println(string);S
		 */
		Set<String> set=new HashSet<>();

		Map<String, Long> charCountMap = Arrays.stream(inputString.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		Entry<String, Long> entry2 = charCountMap.entrySet().stream().filter(entry -> entry.getValue() == 1)
				.findFirst().get();

		System.out.println(entry2);

	}

}
