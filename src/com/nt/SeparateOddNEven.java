package com.nt;

import java.util.Arrays;
import java.util.List;

public class SeparateOddNEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list=Arrays.asList(1,2,4,3,5,6);
		System.out.println("Even Numbers");
		list.stream().filter(a->a%2==0).forEach(System.out::println);
		
		System.out.println("Odd Numbers");
		list.stream().filter(a->a%2!=0).forEach(System.out::println);
		
	}

}
