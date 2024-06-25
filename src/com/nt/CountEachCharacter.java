package com.nt;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountEachCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str="Pawan";
      Map<String, Long> collect = Stream.of(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
      System.out.println(collect);
      
      
		/*
		 * Map<String, Long> collect2 =
		 * Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(
		 * ),Collectors.counting())); System.out.println(collect2);
		 */
      
      collect.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getKey));
      //collect.entrySet().stream().forEach(k,v)->System.out.println(k+  " "+v));
      
      collect.entrySet().stream()
      .forEach(entry -> System.out.println(entry.getKey() + " = " + entry.getValue()));
		/*
		 * for(Entry<String, Long> map:collect2.entrySet()) {
		 * System.out.println("Key: "+ map.getKey() + "   value   " + map.getValue()); }
		 */
	}

}
