package ArraysOps;

public class RepeatedValsInArr {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		findRepeatedVal();
	}

	// withoutsorting
	static void findRepeatedVal() throws Exception {
		int arr[] = { 10, 20, 10, 20, 30, 10, 10, 5, 5, 4, 0, 4,30 };
		boolean found = false;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count=1;
			for (int j = 0; j < i ; j++) {
				if (arr[i] == arr[j]) {
					found = true;
					break;
				}else {
					found=false;
					//break;
					
				}
			}
			if (!found) {
				for (int k = i+1; k < arr.length; k++) {
					if(arr[i]==arr[k]) {
						count++;
					}
				}
				System.out.println(count+"  ===  "+arr[i]);
			}
		}
	}

}
