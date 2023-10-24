package clientInterview;

public class frequecystring {
	public static void main(String[] args) {
		String str = "Scaler by InterviewBit";
		char ch = 'e';
		int freq = 0;
		for (int i = 0; i < str.length(); i++) {
			if (ch == str.charAt(i)) {
				freq++;
			}
		}
		System.out.println("Frequency of " + ch + " = " + freq);

	}

}

//String str = "Scaler by InterviewBit";
//// character whose frequency must be determined
//char ch = 'e';
//// store the frequency in freq
//int freq = 0;
//
//// iterate through the string
//for (int i = 0; i < str.length(); i++) {
//	// if the specified character
//	// appears in the string
//	if (ch == str.charAt(i)) {
//		// increase freq by 1
//		++freq;
//	}
//}
//
//// print the total occurrence of 'ch'
//System.out.println("Frequency of " + ch + " = " + freq);
//
//}
