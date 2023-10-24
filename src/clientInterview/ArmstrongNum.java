package clientInterview;

public class ArmstrongNum {
	public static void main(String[] args) {
		int num = 153;
		int rev;
		int rem;
		double res = 0;
		int originalNum = 0;
		num = originalNum;
		while (num != 0) {
			rem = num % 10;
			res = Math.pow(rem, 3);
			num = num / 10;

		}
		if (res == originalNum) {
			System.out.println("armstrong");
		} else {
			System.out.println("not armstrong");
		}

	}
}

//int num = 153;
//int remainder;
//double res;
//int result = 0;
//int OriginalNum = 0;
//num = OriginalNum;
//while (num != 0) {
//	remainder = num % 10;
//	res = Math.pow(remainder, 3);
//	// System.out.println(res);
//	result = (int) (result + res);
////	System.out.println(result);
//	num = num / 10;
//	System.out.println(result);
//}
//
//if (result == OriginalNum) {
//	System.out.println("armstrong");
//} else {
//	System.out.println("not armstrong");
//}
//}
