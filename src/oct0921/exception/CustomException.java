package oct0921.exception;

import java.util.Scanner;

public class CustomException {
	static void validate(int salary) throws SalaryRangeException {
		if (salary < 2100) {
			throw new SalaryRangeException("you need to work hard");
		}
		if (salary > 2100 && salary < 5000) {
			throw new SalaryRangeException("your salary is somehow good");
		}
		if (salary > 5100 || salary < 9000) {
			throw new SalaryRangeException("salary is very good");
		}
	}

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter salary: ");
			int salary = scanner.nextInt();
			validate(salary);
		} catch (Exception e) {
			System.out.println("Exception occured: " + e.getMessage());
		}
	}

}

class SalaryRangeException extends Exception {
	SalaryRangeException(String s) {
		super(s);
	}
}
