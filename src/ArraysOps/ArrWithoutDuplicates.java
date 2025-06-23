package ArraysOps;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrWithoutDuplicates {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		//removeDuplicatesArr();
		removeDuplicates();
	}

	static void removeDuplicatesArr() {
		int arr[] = { 1, 1, 2, 3, 4, 5, 5, 2, 3, 8, 9, 0, 4, 6, 7 };
		int finArr[] = new int[arr.length];
		boolean visited[] = new boolean[arr.length];
		int k = 0, count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (visited[i]) {
				count++;
				continue;
			} else {
				finArr[k++] = arr[i];
				//System.out.print(" " + arr[i]);
			}
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					visited [j] = true;
					// break;
				}
			}

		} // for
		System.out.println("count = "+count+" visited count "+visited.length);
		for (int val : finArr) {
			//System.out.print(" "+val);
		}
		int finalArr[] = new int[finArr.length-count];
		for (int i = 0; i < finArr.length-count; i++) {
			finalArr[i]=finArr[i];
		}
		System.out.println("\n" + Arrays.toString(finalArr));
	}
	static void removeDuplicates() {
		int arr[] = { 1, 1, 2, 3, 4, 5, 5, 2, 3, 8, 9, 0, 4, 6, 7 };
		Set<Integer> arrSet = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if(!arrSet.contains(arr[i])) {
				arrSet.add(arr[i]);
			}
		}
		for (Integer integer : arrSet) {
			System.out.println(" "+integer);
		} 
		
	}

}
