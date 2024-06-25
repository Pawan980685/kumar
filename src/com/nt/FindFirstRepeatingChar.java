package com.nt;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
		
		Set<String> set=new HashSet<>();
		Map<String, Long> collect = Arrays.stream(inputString.split("")).filter(s->!set.add(s))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		String string = collect.entrySet().stream().filter(entry -> entry.getValue() >= 1).map(entry -> entry.getKey())
				.findFirst().get();

		System.out.println(string);

	}

}
