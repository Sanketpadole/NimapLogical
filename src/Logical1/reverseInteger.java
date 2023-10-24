package Logical1;

public class reverseInteger {
	public static void main(String[] args) {
		int n = 12345;
		int rem;
		int reversed = 0;
		while (n > 0) {
			rem = n % 10;
			reversed = reversed * 10 + rem;
			n = n / 10;

		}
		System.out.println(reversed);

	}
}

//	public static void main(String[] args) {
//		int n = 12345;
//		int rem;
//		int reversed = 0;
//
//		while (n > 0) {
//			rem = n % 10;
//			reversed = reversed * 10 + rem;
//			n = n / 10;
//		}
//
//		System.out.println(reversed);
//	}
//
//}
