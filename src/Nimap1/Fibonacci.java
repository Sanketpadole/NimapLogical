package Nimap1;

public class Fibonacci {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c;
		int num = 10;
		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i < num; i++) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}

	}

}
