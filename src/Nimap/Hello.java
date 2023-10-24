package Nimap;

import java.util.ArrayList;

public class Hello {

	public static void main(String[] args) {

		int temp;
		ArrayList<Integer> arrays = new ArrayList();
		int arr[] = { 1, 5, 0, 7, 0, 3, 0, 5, 0 };
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 0) {
				arrays.add(arr[i]);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				arrays.add(arr[i]);
			}
		}
		System.out.println(arrays);

	}

}
