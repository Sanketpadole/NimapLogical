package Nimap;

public class MissingElementInArray {

	public static void main(String[] args) {
		int[] array = { 2, 5, 3, 7, 8, 10 };

		for (int i = 0; i <= 10; i++) {
			boolean found = false;
			for (int j = 0; j < array.length; j++) {
				if (array[j] == i) {
					found = true;
					break;
				}
			}
			if (!found) {
				System.out.println(i);
			}
		}

	}

}

//int[] array = { 2, 5, 3, 17, 8, 10 };
////int start = 1;
////int end = 10;
//
//for (int i = 1; i <= 20; i++) {
//	boolean found = false;
//	for (int j = 0; j < array.length; j++) {
//		if (array[j] == i) {
//			found = true;
//			break;
//		}
//	}
//	if (!found) {
//		System.out.print(i + " ");
//	}
//}
