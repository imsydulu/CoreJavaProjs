package factorial;

public class FcatorialDemo {

	public static void main(String[] args) {
		// System.out.println("factorail of 5 is" + getFactorial(5));
		getFactorial(6);
	}
	public static void getFactorial(int n) {
		int f = 1;
		System.out.println("fact of " + n + " is : ");
		if (n > 0) {
			while (n != 0) {
				f = f * n;
				n--;
				//System.out.println(f);
			}
		} else {
			f = 1;
		}
		System.out.print(f);

	}

}
