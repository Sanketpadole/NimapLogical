package Logical1;

public class MissingElementInArray {
	public static void main(String[] args) {
		int[] array = { 2, 5, 3, 7, 8, 10 };

		boolean found = false;
		for (int i = 0; i < array.length; i++) {
			for (int i1 = 0; i1 < 10; i1++) {

				if (array[i] == i1) {
					found = true;
					break;
				}

				else if (!found) {
					System.out.println(i1);
				}

			}
		}
	}
}

//			public static void main(String[] args) {
//			    int[] array = { 2, 5, 3, 7, 8, 10 };
//
//			    // Assuming the array elements are in the range 1 to 10
//			    for (int i = 1; i <= 10; i++) {
//			        boolean found = false;
//
//			        for (int j = 0; j < array.length; j++) {
//			            if (array[j] == i) {
//			                found = true;
//			                break; // Element found, no need to continue searching
//			            }
//			        }
//
//			        if (!found) {
//			            System.out.println(i + " is missing");
//			        }
//			    }
//			}
