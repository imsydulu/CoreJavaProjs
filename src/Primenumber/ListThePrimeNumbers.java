package Primenumber;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ListThePrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// primeNumbersList(7);
		listPrime(20);
	}

	static void listPrime(int num) {
		Set<Integer> primeNumbers = new LinkedHashSet<Integer>();
		for (int i = 2; i <= num; i++) {
			if (isPrime(i)) {
					//System.out.println(i+"is a prime number");
					primeNumbers.add(i);
			}else {
				System.err.println(i+" is not a prime number");
			}
		}
		System.out.println(Arrays.toString(primeNumbers.toArray()));
		
	}

	static boolean isPrime(int n) {
		boolean isPrimeNum = true;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				isPrimeNum = false;
				break;
			}
		}
		return isPrimeNum;
	}

	static void primeNumbersList(int num) {
		// int r = num/2;
		int i = 2;
		while (i < num && num != 0) {
			if (num % i == 0) {
				System.err.println(num + " is not a prime number");
				break;
			} 
			i++;
			num--;
		}
	}

}
