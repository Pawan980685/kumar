package com.nt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringPrefixfilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strings = {"java", "scala", "javascript", "ruby","spring","angular"};
		String str1="j";
		
		List<String> collect = Stream.of(strings).filter(s->s.startsWith(str1)).collect(Collectors.toList());
		System.out.println(collect);
		
		for(String str:strings) {
			if(str.contains(str1)) {
				System.out.println(str);
			}
		}
	}

}
