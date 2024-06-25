package com.nt;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();

		// Duplicate characters

		Set<String> set = new HashSet<>();
		List<String> collect = Arrays.stream(inputString.split("")).filter(str -> !set.add(str))
				.collect(Collectors.toList());
		System.out.println(collect);

		// Duplicate words
		String sentence = "alex brian charles alex charles david eric david";

		Set<String> tempSet = new HashSet<>();

		List<String> duplicateWords =Arrays.stream(sentence.split(" "))
		    .filter(w -> tempSet.add(w))
		    .collect(Collectors.toList());

		//System.out.println(duplicateWords); 
		
		// System.out.println(collect);;

		/*
		 * Map<String, Long> collect2 = Stream.of(inputString.split(""))
		 * .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 * 
		 * List<Entry<String, Long>> collect3 = collect2.entrySet().stream()
		 * .filter(e->e.getValue()>1).collect(Collectors.toList());
		 * 
		 * System.out.println(collect2); System.out.println(collect3);
		 */
	}

}
