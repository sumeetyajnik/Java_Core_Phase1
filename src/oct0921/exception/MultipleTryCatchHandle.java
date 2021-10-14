package oct0921.exception;

public class MultipleTryCatchHandle {

	public static void main(String[] args) {
		int a[] = new int[5];
		try {
			a[5] = 9;
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("ArrayIndexOutOfBoundsException");
		} finally {
			try {
				a[3] = 30 / 0;
			} catch (ArithmeticException ae) {
				System.out.println("ArithmeticException");
			}
		}
	}
}
