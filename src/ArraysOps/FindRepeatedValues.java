package ArraysOps;

import java.time.temporal.Temporal;
import java.util.Iterator;

public class FindRepeatedValues {

	public static void main(String[] args) {
		// findRepeatedvals();
		//findRepeatedvalsOne();
		findRepeatedvalsTwo();
	}

	static void findRepeatedvals() {
		int arr[] = { 10, 10, 20, 10, 25, 3, 4, 5, 6, 4, 3, 3, 25 };
		int count = 0;
		int tempArr[] = new int[arr.length];
		// int[] finalArr = new int[arr.length];
		boolean found = false;
		int k = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			count = 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					found = true;
					break;
				} else {
					found = false;
				}
			}

			if (!found) {
				for (int j = i + 1; j < tempArr.length; j++) {
					if (arr[i] == arr[j]) {
						tempArr[k++] = arr[i];
						break;
					}
				}
			}

		} // outer for
		for (int val : tempArr) {
			System.out.println(" " + val);
		}

	}

	static void findRepeatedvalsOne() {
		int arr[] = { 20, 0, 10, 10, 30, 5, 8, 4, 20, 0, 5, 4, 10, 4 };
		int count = 0;
		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {
			int j = i + 1;
			while (j < arr.length) {
				if (arr[i] == arr[j]) {
					flag = true;
					break;
				} else {
					flag = false;
				}
				j++;
			}
			if (flag) {
				System.out.print(" " + arr[i]);
			}
		}
	}// findRepeatedValsOne()

	static void findRepeatedvalsTwo() {
		int arr[] = { 20, 0, 10, 10, 30, 5, 8, 4, 20, 0, 5, 4, 10, 4,4,20 };
		//int count = 0;
		boolean[] visited = new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (visited[i]) {
				continue;
			}
			int count = 1;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
					visited[j] = true;
					count++;
					//break;
				}
			}
			if (count>1) {
				System.out.println(count+" "+arr[i]);
			}
		}
	}
}
