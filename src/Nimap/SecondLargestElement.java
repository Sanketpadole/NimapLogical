package Nimap;

public class SecondLargestElement {
	public static void main(String[] args) {
		int[] arr = { 12, 35, 1, 10, 34, 1, 35 };
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];

			} else if (arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}
		if (secondLargest != Integer.MIN_VALUE) {
			System.out.println("Second largest element: " + secondLargest);
		} else {
			System.out.println("No second largest element");
		}
	}

}

//int[] arr = { 12, 35, 1, 10, 34, 1, 35 };
//int n = arr.length;
//
//int largest = Integer.MIN_VALUE;
//System.err.println(largest);
//int secondLargest = Integer.MIN_VALUE;
//System.err.println(secondLargest);
//
//for (int i = 0; i < n; i++) {
//	if (arr[i] > largest) {
//		secondLargest = largest;
//		largest = arr[i];
//	} else if (arr[i] > secondLargest && arr[i] != largest) {
//		secondLargest = arr[i];
//	}
//}
//
//if (secondLargest != Integer.MIN_VALUE) {
//	System.out.println("Second largest element: " + secondLargest);
//} else {
//	System.out.println("No second largest element");
//}
//}
