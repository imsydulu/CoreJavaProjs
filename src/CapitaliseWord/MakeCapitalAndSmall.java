package CapitaliseWord;

public class MakeCapitalAndSmall {

	public static void main(String[] args) {
		makeCapSmallLetters("SyduluThappetla");
	}

	static void makeCapSmallLetter(String str) {
		String newstr = str.toLowerCase();
		System.out.println(newstr);
		String finalStr = "";
		char ch;
		for (int i = 0; i < newstr.length(); i++) {
			ch = ' ';
			if (i % 2 == 0) {
				ch = Character.toUpperCase(newstr.charAt(i));
			} else {
				ch = Character.toLowerCase(newstr.charAt(i));
			}
			finalStr = finalStr + ch;
			// System.out.println(finalStr);
		}
		System.out.println(finalStr);
	}

	static void makeCapSmallLetters(String str) {
		str.toLowerCase();
		int i = 0;
		String finStr = "";
		char ch;
		while (i < str.length()) {
			ch = ' ';
			if (i % 2 == 0) {
				ch = Character.toLowerCase(str.charAt(i));
			} else {
				ch = Character.toUpperCase(str.charAt(i));
			}
			finStr = finStr + ch;
			i++;
		}
		System.out.println(finStr);
	}

}
