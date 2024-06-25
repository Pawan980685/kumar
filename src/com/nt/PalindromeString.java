package com.nt;

import java.util.Arrays;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "ROTATOR";
		//Arrays.stream(str.split("")).
		
		String str2="";
		/*
		 * for(int i=str1.length()-1;i>=0;i--) { str2=str2+str1.charAt(i); }
		 */
		for(int i=0;i<=str1.length()-1;i++) {
			str2=str2+str1.charAt(i);
		}
		//System.out.println(str2);
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("Palandron");
		}
		else {
			System.out.println(" Not Palandron");
		}
	}

}
