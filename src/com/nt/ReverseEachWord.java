package com.nt;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="Pawan kumar mandal";
        String collect = Stream.of(str.split(" ")).map(word->new StringBuffer(word).reverse()).collect(Collectors.joining(" "));
        System.out.println(collect);
	}

}
