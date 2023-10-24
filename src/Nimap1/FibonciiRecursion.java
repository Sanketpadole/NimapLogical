package Nimap1;

public class FibonciiRecursion {
	int a = 0;
	int b = 1;
	int c;

	void fib(int n) {
		if (n < 0) {
			return;
		}
		c = a + b;
		System.out.println(a);
		a = b;
		b = c;
		fib(n - 1);
	}

	public static void main(String[] args) {

		FibonciiRecursion ff = new FibonciiRecursion();
		ff.fib(10);
	}

}
