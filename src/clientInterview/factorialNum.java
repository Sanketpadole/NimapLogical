package clientInterview;

public class factorialNum {
	public static void main(String[] args) {
		int i = 1;
		int num = 10;
		int factorial = 1;
		while (i <= num) {
			factorial = factorial * i;
			i++;

		}
		System.out.println(factorial);

	}

}
