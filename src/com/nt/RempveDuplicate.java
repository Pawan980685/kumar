package com.nt;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RempveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(1,2,4,3,5,6,3,5);
		//list.stream().distinct().forEach(System.out::println);
		/*
		 * Set<Integer> collect = list.stream().collect(Collectors.toSet());
		 * System.out.println(collect);
		 */
		
		Set<Integer> set=new HashSet<>();
		
		list.stream().filter(a->set.add(a)).forEach(System.out::println);

	}

}
