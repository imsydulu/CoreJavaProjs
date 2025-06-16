package Primenumber;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		checkPrime(1);
	}

	public static void checkPrime(int num) {
		if (isPrimeNumber(num)) {
			System.out.println(num + " is a prime number");
		} else {
			System.err.println(num + " is not a prime number");
		}
	}

	static boolean isPrimeNumber(int n) {
		boolean isPrime = true;
		if (n > 1) {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					isPrime = false;
					break;
				} else {
					isPrime = true;
					// break;
				}
			}
		} else {
			isPrime = false;
		}
		return isPrime;
	}

}
