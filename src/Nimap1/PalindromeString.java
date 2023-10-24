package Nimap1;

public class PalindromeString {
	public static void main(String[] args) {
		String str = "saasj";
		String nstr = "";
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			nstr = ch + nstr;

		}
		if (str.equals(nstr)) {
			System.out.println("palindromeString");
		} else {
			System.out.println("non palindrome");
		}
	}

}
