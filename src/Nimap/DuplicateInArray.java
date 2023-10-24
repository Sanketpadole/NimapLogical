package Nimap;

public class DuplicateInArray {
	public static void main(String[] args) {
		int[] array = { 4, 2, 3, 5, 1, 3, 4, 7, 8, 5 };
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					System.out.println(array[j]);

				}
			}
		}

	}

}
