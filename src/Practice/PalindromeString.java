package Practice;

public class PalindromeString {

	public static void main(String[] args) {
		String str = "saasd";
		char ch;
		String nstr = "";

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			nstr = ch + nstr;

		}

		if (str.equals(nstr)) {
			System.out.println("palindrome");
		} else {
			System.out.println("non palindrome");
		}
	}

}
