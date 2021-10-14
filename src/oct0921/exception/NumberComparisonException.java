package oct0921.exception;

import java.io.IOException;
import java.util.Scanner;

public class NumberComparisonException {

	static int add(int num1, int num2) throws IOException {
		if (num1 > num2) {
			throw new IOException("num1 is greater num2");
		}
		if (num2 > num1) {
			throw new ArithmeticException("num2 is greater num1");
		}
		return num1 + num2;
	}

	public static void main(String args[]) throws IOException {
		int result = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number 1 : ");
		int num1 = scanner.nextInt();

		System.out.println("Enter number 2 : ");
		int num2 = scanner.nextInt();

		try {
			result = add(num1, num2);
		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}

		System.out.println("Result is : " + result);
	}
}
