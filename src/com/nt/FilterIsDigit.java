package com.nt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterIsDigit {
	public static void main(String[] args) {
		List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "F2our", "5ive", "Six");
		
		List<String> collect = listOfStrings.stream().filter(s->Character.isDigit(s.charAt(0))).collect(Collectors.toList());
		//System.out.println(collect);
		List<String> collect1 = listOfStrings.stream().filter(s->Character.isDigit(s.charAt(0))).collect(Collectors.toList());
		System.out.println(collect1);
		
	
	}

}
