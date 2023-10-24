package Nimap;

public class Sum100 {
	public static void main(String[] args) {
		int arr[] = { 80, 60, 10, 70, 30, 100, 61, 50 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == 100) {
					System.out.println("first" + arr[i] + "sec" + arr[j]);
				}

			}
		}
	}

}
