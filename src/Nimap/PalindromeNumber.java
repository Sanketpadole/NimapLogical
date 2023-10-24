package Nimap;

public class PalindromeNumber {
	public static void main(String[] args) {
		int num = 355;
		int rev = 0;
		int rem;
		int originaNum = num;
		while (num != 0) {
			rem = num % 10;
			num = num / 10;
			rev = rem + rev * 10;

		}
		if (originaNum == rev) {
			System.out.println("palindrome");
		} else {
			System.out.println("non palindrome");

		}
	}

}
