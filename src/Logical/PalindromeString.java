package Logical;

public class PalindromeString {
	public static void main(String[] args) {
		String str = "ajjaf";
		String rev = "";

		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			rev = ch + rev;
		}
		if (str.equals(rev)) {
			System.out.println("palindrome string");
		} else {
			System.out.println("non palindrome");
		}

	}

}
