package fiboancci;

public class FibonacciSeriesDemo {

	public static void main(String[] args) {
		getFibonacci(10);
	}

	public static void getFibonacci(int n) {
		int f, f1 = 0, f2 = 1, k = 2;
		if (n == 2) {
			System.out.println("Fibonacci Series " + f1 + " " + f2);
		} else if(n>2) {
			System.out.print("Fibonacci Series " + f1 + " " + f2+" ");
			while (k < n) {
				f = f1 + f2;
				f1 = f2;
				f2 = f;
				System.out.print(f+" ");
				k++;
			}
		}else {
			System.err.println("the value must be greater than or equal to '2'");
		}

	}

}
