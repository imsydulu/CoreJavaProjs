package CapitaliseWord;

import java.util.Iterator;

public class CapitaliseSmall {
	public static void main(String[] args) {
		findSmallCAp("AniMaL");
		capitalEachLetter("SydulU");
	}

	static void findSmallCAp(String str) {
		char[] ch = str.toCharArray();
		for (char letter : ch) {
			if (Character.isLowerCase(letter)) {
				System.out.println("Small Letters: " + letter);
			} else {
				System.out.println("Capital letters: " + letter);
			}
		}
	}

	static void capitalEachLetter(String str) {
		System.out.println("small letters " );
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				System.out.print(" "+str.charAt(i));
			}
		}
		System.out.println("\nCapital Letters: " );
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				System.out.print(" "+str.charAt(i));
			}
		}
	}
}
