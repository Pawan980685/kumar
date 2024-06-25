package com.nt;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Max3And3min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		List<Integer> collect = listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
		System.out.println(collect);
		List<Integer> collect1 = listOfIntegers.stream().sorted().limit(3).collect(Collectors.toList());
		System.out.println(collect1);
	}

}
