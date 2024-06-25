package com.nt;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.SortedMap;

public class MinNMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		 Integer integer = listOfIntegers.stream().sorted().max(Comparator.naturalOrder()).get();
		 Integer integer2 = listOfIntegers.stream().sorted().min(Comparator.naturalOrder()).get();
		 System.out.println(integer);
		 System.out.println(integer2);
	}

}
