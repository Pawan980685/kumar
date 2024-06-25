package com.nt;

public class PrimeNumber {
	public static void main(String[] args) {
		if(isprime(11)) {
			System.out.println("prime number");
		}
		else {
			System.out.println("Not prime number");
		}
		
	}
		

	private static boolean isprime(int number) {
		// TODO Auto-generated method stub
		
		if(number<=1) {
			return false;
		}
	
		for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
	}

