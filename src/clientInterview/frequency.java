package clientInterview;

import java.util.Arrays;

public class frequency {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 1, 2, 3, 1, 1 };

		Arrays.sort(arr);

		int i = 0;
		while (i < arr.length) {
			int count = 1;
			while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
				count++;
				i++;
			}
			System.out.println(arr[i] + "\t" + count);
			i++;
		}
	}

}
