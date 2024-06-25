package com.nt;

import java.util.Arrays;
import java.util.List;

import javax.print.attribute.Size2DSyntax;

public class LastElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");
		
		String string = listOfStrings.stream().skip(listOfStrings.size()-1).findFirst().get();
		System.out.println(string);

	}

}
