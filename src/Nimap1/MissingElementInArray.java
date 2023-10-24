package Nimap1;

public class MissingElementInArray {
	public static void main(String[] args) {
		int[] array = { 2, 5, 3, 7, 8, 10 };
		for (int j = 0; j < 10; j++) {
			boolean found = false;
			for (int i = 0; i < array.length; i++) {
				if (array[i] == j) {
					found = true;
					break;
				}
			}
			if (!found) {
				System.out.println(j);

			}
		}

	}
}
//for (int j = 0; j < 10; j++) {
//
//	boolean found = false;
//	for (int i = 0; i < array.length; i++) {
////	boolean found=false;
//		if (array[i] == j) {
//			found = true;
//			break;
//		}
//
//	}
//	if (!found) {
//		System.out.println(j);
//
//	}
//}
//
//}
