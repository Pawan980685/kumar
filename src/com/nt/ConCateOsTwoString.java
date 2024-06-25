package com.nt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConCateOsTwoString {
	
	public static void main(String[] args) {
		List<String> list1=Arrays.asList("Pawan","mandal","Yadav");
		List<String> list2=Arrays.asList("Kumar");
		
		List<String> collect = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
		System.out.println(collect);
	}
	

}
