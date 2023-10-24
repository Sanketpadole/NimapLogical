package clientInterview;

public class PrimeNo1to10 {
	public static void main(String arg[]) {
		int num = 20, count;
		for (int i = 0; i <= num; i++) {
			count = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.println(i);
			}
		}

	}
}

//for (int i = 1; i <= num; i++) {
//	count = 0;
//	for (int j = 2; j <= i / 2; j++) {
//		if (i % j == 0) {
//			count++;
//			break;
//		}
//	}
//
//	if (count == 0) {
//		System.out.println(i);
//	}
//
//}
//}