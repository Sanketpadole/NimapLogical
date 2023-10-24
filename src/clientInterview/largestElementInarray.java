package clientInterview;

public class largestElementInarray {
	public static void main(String[] args) {

		int arr[] = { 12, 3, 4, 55, 6, 7 };
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}

		}
//		for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[0] + " ");
//		}

	}

}

//1)largest element...2)seconLargest...3)descending order

//public static void main(String[] args) {
//    int arr[] = { 12, 3, 4, 55, 6, 7 };
//    int temp;
//
//    for (int i = 0; i < arr.length; i++) {
//        for (int j = i + 1; j < arr.length; j++) {
//            if (arr[i] < arr[j]) {
//                temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//            }
//        }
//    }
//
//    // Print the sorted array in descending order
//    for (int i = 0; i < arr.length; i++) {
//        System.out.print(arr[i] + " ");
//    }
//}
