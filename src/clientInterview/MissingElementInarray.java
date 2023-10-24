package clientInterview;

public class MissingElementInarray {
	public static void main(String[] args) {
		int[] arr = { 2, 5, 3, 7, 8, 10 };
		for (int i = 0; i < 10; i++) {
			boolean found = false;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == i) {
					found = true;
				}
			}

			if (!found) {
				System.out.println(i);
			}

		}
	}

}
//int[] array = { 2, 5, 3, 7, 8, 10 };
//
//for (int i = 0; i <= 10; i++) {
//	boolean found = false;
//	for (int j = 0; j < array.length; j++) {
//		if (array[j] == i) {
//			found = true;
//			break;
//		}
//	}
//	if (!found) {
//		System.out.println(i);
//	}
//}
//
//}