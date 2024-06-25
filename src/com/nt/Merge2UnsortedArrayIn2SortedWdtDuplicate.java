package com.nt;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Merge2UnsortedArrayIn2SortedWdtDuplicate {
	public static void main(String[] args) {
		int[] array1= {4, 2, 7, 1,1};
		int[] array2= {8, 3, 9, 5,3,3};
		
		int[] array3 = IntStream.concat(Arrays.stream(array2),Arrays.stream(array1)).sorted().distinct().toArray();
		System.out.println(Arrays.toString(array3));
	}

}
