package StringOps;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		// removeDuplicatesFrmString("malayalammmy");
		withoutDuplicateStr("malayalammmmmm");
	}

	static void removeDuplicatesFrmString(String str) {

		System.out.println("Given String ==> " + str);
		boolean found = false;
		String finalStr = "";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			count = 0;
			for (int j = i + 1; j < str.length() - 1; j++) {
				if (str.charAt(i) == str.charAt(j)) {
					found = true;

					str = str.substring(0, j) + str.substring(j + 1);// malayalam //malayala //

					count++;
					// break;
				}
			}
			if (found) {
				count++;
				System.out.println(count + " " + str.charAt(i));
				finalStr = str.substring(0, i) + str.substring(i + 1);
			}

		}
		System.out.println("\nStr==>" + str);
		System.out.println("Final String wihtout duplicates=>> " + finalStr);
	}

	static void withoutDuplicateStr(String str) {
		boolean flag = false;
		// malayalam
		int j = 0, count = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			count = 1;
			j = i + 1;
			while (j < str.length()) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
					flag = true;
					// break;
					str = str.substring(0, j) + str.substring(j + 1);
				} else {
					j++;
				}
			}

			if (flag && count > 1) {
				System.out.print(count);
				System.out.println(str.charAt(i));
			}
		}

		// System.out.println(str);
	}

	static void withoutDuplicateStrOne(String str) {
		StringBuilder result = new StringBuilder();
		boolean[] visited = new boolean[256]; // ASCII character map
		for (int i = 0; i < str.length(); i++) {
			if (visited[str.charAt(i)])
				continue;

			int count = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}

			if (count > 1) {
				System.out.println(str.charAt(i));
			}

			visited[str.charAt(i)] = true;
		}
	}

}
