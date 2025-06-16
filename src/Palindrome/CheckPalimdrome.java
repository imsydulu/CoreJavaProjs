package Palindrome;

public class CheckPalimdrome {

	public static void main(String[] args) throws Exception {
		checkpalimdrome("");
	}
	static void checkpalimdrome(String str) throws Exception{
		if (isPalindrome(str)) {
			System.out.println(str+" is palindrome ");
		}else {
			System.out.println(str +" is not palindrome");
		}
	}

	public static boolean isPalindrome(String word) throws Exception  {
		String tempStr = new String();
		boolean isMatched = false;
		String tStr = "";
		int l = word.length() - 1;
		// System.err.println(word.charAt(4) + "" + word.length());
		if (word.length() != 0) {
			for (int i = word.length() - 1; i >= 0; i--) {
				tempStr = tempStr + word.charAt(i);
			}
		} else {
			throw new Exception("\"Not valid string\"");
			//System.err.println("Not a valid string");
		}
		if (word.length() != 0 && word.length() > 2) {
			while (l >= 0) {
				tStr = tStr + Character.toString(word.charAt(l));
				l--;
			}
		} else {
			System.err.println("Not a valid string");
		}
		//System.out.println(tempStr);
		//System.out.println(tStr);
		/*
		 * if (tempStr == word) { System.out.println("is palindrome"); } else {
		 * System.out.println("tempStr == word not palindrome"); }
		 */
		if (tStr.equalsIgnoreCase(word)) {
		//	System.out.println(word + " is palindrome");
			isMatched = true;
			
		} else {
			//System.out.println("not palindrome");
			isMatched= false;
		}
		System.out.println("check compareTo " + word.compareTo(tempStr));
		return isMatched;

	}

}
