package Nimap1;

public class SecondLargestInarray {
	public static void main(String[] args) {
		int[] arr = { 12, 1, 10, 34, 1, 35 };
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}
			if (arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];

			}

		}
		System.out.println(secondLargest);

	}

}

//
//public static void main(String[] args) {
//
//	int arr[] = { 1, 34, 56, 7, 8, 88 };
//	int largest = Integer.MIN_VALUE;
//	int secLargest = Integer.MIN_VALUE;
//	for (int i = 0; i < arr.length; i++) {
//		if (arr[i] > largest) {
//
//			secLargest = largest;
//			largest = arr[i];
//
//		}
//		if (arr[i] < largest) {
//			secLargest = arr[i];
//
//		}
//
//	}
//	System.out.println(secLargest);
//}
