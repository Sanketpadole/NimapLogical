package Nimap1;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String str1 = "silent";
		String str2 = "listen";
		char[] chararray1 = str1.toCharArray();
		char[] chararray2 = str2.toCharArray();
		Arrays.sort(chararray1);
		Arrays.sort(chararray2);
		String sorted1 = new String(chararray1);
		String sorted2 = new String(chararray2);
		if (sorted1.equals(sorted2)) {
			System.out.println("anagram");
		} else {
			System.out.println("non anagram");
		}

	}

}

//String str1 = "listen";
//String str2 = "silent";
//char[] charArray1 = str1.toCharArray();
//char[] charArray2 = str2.toCharArray();
//Arrays.sort(charArray1);
//Arrays.sort(charArray2);
//String sortedStr1 = new String(charArray1);
//String sortedStr2 = new String(charArray2);
//if (sortedStr1.equals(sortedStr2)) {
//	System.out.println("are anagram");
//} else {
//	System.out.println("not anagram");
//}
