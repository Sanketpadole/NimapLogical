package ReviewCall;

public class Demo {
	public static void main(String[] args) {

		int arr[] = { 1, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 1; i < 10; i++) {
			boolean found = false;
			for (int j = 1; j < arr.length; j++) {
				if (arr[j] == i) {
					found = true;
					break;
				}
			}
			if (!found) {
				System.out.println(i);
			}
		}
	}

}
