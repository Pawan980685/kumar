package com.nt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8MapFunction {
	
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "cherry");
		
		//List<Integer> collect = words.stream().map(w->w.length()).collect(Collectors.toList());
		List<Integer> collect1 = words.stream().map(String::length).collect(Collectors.toList());
		
		List<String> collect2=words.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		
		System.out.println(collect2);
	}

}
