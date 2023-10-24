package Logical;

public class ReverseString {
	public static void main(String[] args) {
		String str = "Sanket";
		char ch;
		String rev = "";
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);

			rev = ch + rev;

		}
		System.out.println(rev);

	}

}
