package Logical;

public class fibonacciSeriesRecursion {

	private int a = 0;
	private int b = 1;

	void fib(int n) {
		if (n <= 0)
			return;

		// System.out.print(a + " ");
		System.out.println(a);

		int c = a + b;
		a = b;
		b = c;

		fib(n - 1);
	}

	public static void main(String[] args) {
		fibonacciSeriesRecursion ff = new fibonacciSeriesRecursion();
		ff.fib(10);
	}

}
