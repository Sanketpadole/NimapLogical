package Nimap;

public class FibonacciRecursion {

	private int a = 0;
	private int b = 1;
	int c;
	int n = 10;

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
		FibonacciRecursion ff = new FibonacciRecursion();
		ff.fib(10);

	}

}
//private int a = 0;
//private int b = 1;
//
//void fib(int n) {
//	if (n <= 0)
//		return;
//
//	// System.out.print(a + " ");
//	System.out.println(a);
//
//	int c = a + b;
//	a = b;
//	b = c;
//
//	fib(n - 1);
//}
//
//public static void main(String[] args) {
//	fibonacciSeriesRecursion ff = new fibonacciSeriesRecursion();
//	ff.fib(10);
//}