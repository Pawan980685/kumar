package com.nt;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortACtoLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        
           List<String> collect = listOfStrings.stream()
        		   .sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
           System.out.println(collect);
    }


	}


