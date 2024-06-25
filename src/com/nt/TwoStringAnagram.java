package com.nt;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TwoStringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1 = "RaceCar";
        String s2 = "CarRace";
		
		s1 = Arrays.stream(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		s2 = Arrays.stream(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		//System.out.println(collect);
		if(s1.equals(s2)) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Angram");
		}
	}

}
