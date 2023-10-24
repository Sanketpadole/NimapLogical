package Logical;

public class fibonaccieseries {
	public static void main(String[] args) {
		int num = 10;
		int a = 0;
		int b = 1;
		int c;
		int count = 2;
		System.out.println(a);
		System.out.println(b);
		while (count < num) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
			count++;

		}

	}

}

//0,1,1,2,3,5,8
