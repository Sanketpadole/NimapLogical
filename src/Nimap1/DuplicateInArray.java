package Nimap1;

public class DuplicateInArray {
	public static void main(String[] args) {
		int arr[] = { 1, 7, 56, 7, 8, 88 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}

	}

}
