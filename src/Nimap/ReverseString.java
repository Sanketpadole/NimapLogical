package Nimap;

public class ReverseString {
	public static void main(String[] args) {
		String str = "saas";
		String nstr = "";

		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			nstr = ch + nstr;

		}
		if (str.equals(nstr)) {
			System.out.println("Palindrome string");

		} else {
			System.out.println("not Palindrome string");

		}
	}

}
