package VowelsConsonants;

public class VowelsConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//findVowelsConsonants("animal");
		findVowelsConsts("animal");
	}
	static void findVowelsConsts(String str) {
	char charArr[]= {'a','e','i','o','u'};
		for (int i = 0; i < str.length(); i++) {
			boolean flag = false;
			for (int j = 0; j < charArr.length; j++) {
				if(str.charAt(i)==charArr[j]) {
					flag = true;
					break;
				}
			}
			if (flag) {
				System.out.println(str.charAt(i));
			}
		}
	}

	static void findVowelsConsonants(String str) {
		boolean flag = false;
		for (int i = 0; i < str.length()-1; i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				flag = true;
				System.out.println(str.charAt(i) + " is the vowel");
			} else {
				flag = false;
				System.out.println(str.charAt(i) + " is the consonant");
			}
			if (!flag) {
				System.out.println(str.charAt(i));
			}
		}

	}

}
