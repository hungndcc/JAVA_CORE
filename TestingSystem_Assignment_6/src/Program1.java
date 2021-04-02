public class Program1 {
	public static void main(String[] args) {

		// question1,2
//		try {
//		float result = devide(7, 0);
//		System.out.println(result);
//		} catch (ArithmeticException e) {
//			System.out.println("Can not devide 0");
//		} finally {
//			System.out.println("Devide completed");
//		}
//		try {
//		int[] i = {1, 2, 3};
//		System.out.println(i[10]);
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Qua so phan tu roi");
//		}
//	}
//	
//	public static float devide(int a, int b) {
//		return a/b;
//	}

		// question3
		try {
		int[] numbers = {1, 2, 3};
		System.out.println(numbers[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Qua so phan tu trong mang");
		}
	}
}
