package com.nt;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Testwhggh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = Arrays.asList(1, 3, 5, 6, 8, 10);
        long k = 3;
        System.out.println("The " + k + "th smallest missing integer is: " + findMissingInteger(arr, k));
	}
        public static int findMissingInteger(List<Integer> arr, long k) {
		 Collections.sort(arr);
	        int missingCount = 0;
	        int currentMissing = 1;

	        for (int num : arr) {
	            if (num == currentMissing) {
	                currentMissing++;
	            } else if (num > currentMissing) {
	                missingCount++;
	                if (missingCount == k) {
	                    return currentMissing;
	                }
	                currentMissing++;
	            }
	        }

	        while (missingCount < k) {
	            currentMissing++;
	            missingCount++;
	        }

	        return currentMissing;
	    
	}

}
