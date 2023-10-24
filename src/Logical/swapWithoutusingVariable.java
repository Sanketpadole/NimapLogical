package Logical;

public class swapWithoutusingVariable {
	public static void main(String[] args) {
		int a = 10;
		int b = 12;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("value of b is" + b + "value of a is" + a);

	}

}
