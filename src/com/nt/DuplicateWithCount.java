package com.nt;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateWithCount {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("AA", "BB", "AA", "CC", "AA");

		Map<String, Long> collect = names.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect);

		/*
		 * Set<String> set=new HashSet<>(); Map<String, Long> collect2 =
		 * names.stream().filter(e->!set.add(e))
		 * .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 * System.out.println(collect2);
		 */

	}

}
