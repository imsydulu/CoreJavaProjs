
package StringOps;

import java.util.Iterator;

public class DuplicatesInString {

	public static void main(String[] args) {
		// findDuplicatesChars("malayalam");
		findRepeatedChars("lamalayalammml");
	}

//method 1
	static void findDuplicatesChars(String str) {
		char ch;
		int count = 0;
		boolean isVisited = false;
		for (int i = 0; i < str.length(); i++) {
			count = 1;
			for (int j = 0; j < i; j++) { // a
				if (str.charAt(i) == str.charAt(j)) {// a==m
					isVisited = true;
					// System.out.println(count++ + "" + str.charAt(i));
					break;
				}
			}
			if (!isVisited) {
				// System.out.println("isvisited");
				for (int k = i + 1; k < str.length(); k++) {
					if (str.charAt(i) == str.charAt(k)) {
						count++;
					}
				}
				System.out.println(str.charAt(i) + " " + count);
			} else {
				System.out.println(str.charAt(i));
			}
			// System.out.println("count"+count);
		} // for i
	}

	// method 2
	static void findRepeatedChars(String str) {
		// currentChar = ' ';
		int count = 0;
		char repeated = 0;
		char currentChar;
		boolean isFound = true;
		for (int i = 0; i < str.length(); i++) {
			count = 1;
			currentChar = str.charAt(i);
			isFound = false;
			for (int j = i+1; j < str.length(); j++) {
				if (currentChar == str.charAt(j)) {
					isFound = true;
					str = str.substring(0, j) + str.substring(j+1);
					count++;
					//break;
					// System.out.println(str);
					// break;
				}
			}
			if (isFound) {
				System.out.println(count + "" + currentChar);
			}
		}

	}// findRepeatedChars

}
