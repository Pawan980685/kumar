package com.nt;

import java.util.Arrays;
import java.util.List;

public class StratWithDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
		listOfStrings.stream().filter(s->Character.isDigit(s.charAt(0))).forEach(System.out::println);
	}
	

}
