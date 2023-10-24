package Logical;

public class CountEven {

	public static void main(String[] args) {
		int a[] = { 12, 3, 9, 5, 6, 7 };
		int countEven = 0;
		int countOdd = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				countEven = countEven + 1;

			} else if (a[i] % 2 != 0) {
				countOdd = countOdd + 1;

			}

		}
		System.out.println("Count of even numbers: " + countEven);
		System.out.println("Count of odd numbers: " + countOdd);

	}

}
