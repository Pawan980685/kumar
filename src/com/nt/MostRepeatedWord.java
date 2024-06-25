package com.nt;

import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MostRepeatedWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "your input string here string";
		Map<String, Long> collect = Stream.of(inputString.split(" "))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		Entry<String, Long> entry2 = collect.entrySet().stream().filter(entry->entry.getValue()>1).findAny().get();
		System.out.println(entry2.getKey()+ " :"+entry2.getValue());

	}

}
