package Primenumber;

public class PrimeNumbersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(isPrimeNumber(10));
		//checkPrimeNumber(10);
		isPrimeNumber(5);
	}
	
	static void checkPrimeNumber(int num){
		if (isPrimeNumber(num)) {
			System.out.println(num+" is a prime number");
		}else {
			System.err.println(num+" is not a prime number");
		}
	}

	static boolean isPrimeNumber(int n) {
		boolean isPrime = true;
		if (n > 1) {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					isPrime = false;
					break;
				}else {
					isPrime=true;
					System.out.println("hello");
				}
			} 
		} else {
			isPrime = false;
		}

		return isPrime;
	}

}
