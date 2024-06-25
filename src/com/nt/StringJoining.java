package com.nt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringJoining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
		
		String collect = listOfStrings.stream().collect(Collectors.joining(",","[" ,"]"));
		System.out.println(collect);

	}

}
