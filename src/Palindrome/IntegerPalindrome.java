package Palindrome;

public class IntegerPalindrome {

	public static void main(String[] args) {
		integerPalindrome(232);
	}

	static void integerPalindrome(int n) {
		if (integerReverse(n) == n) {
			System.out.println(n + " is palindrome ");
		} else {
			System.err.println(n + " is not palindrome");
		}
	}

	public static int integerReverse(int num) {
		// 123
		int finval = 0;
		while (num > 0) {
			int lastDigit = num % 10;
			finval = finval * 10 + lastDigit;
			num = num / 10;
		}
		System.out.println(finval);
		return finval;
	}
}
