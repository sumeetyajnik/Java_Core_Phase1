package oct1721;

import java.util.Scanner;

public class ArrayExceptionTest {

	public static void main(String[] args) {
		int m, n, i, j;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		m = sc.nextInt();
		System.out.print("Enter the number of columns: ");
		n = sc.nextInt();
		int array[][] = new int[m][n];
		System.out.println("Enter the elements of the array: ");
		for (i = 0; i < m; i++)
			for (j = 0; j < n; j++)
				array[i][j] = sc.nextInt();
		System.out.println("Elements of the array are: ");
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++)
				System.out.print(array[i][j] + " ");
			System.out.println();
		}
		ArrayExceptionTest arrayExceptionTest = new ArrayExceptionTest();
		arrayExceptionTest.columnSum(array);
	}
	

	public int[] columnSum(int[][] array) {
		int temp[] = new int[array[0].length];
		for (int i = 0; i < array[0].length; i++) {
			int sum = 0;
			for (int j = 0; j < array.length; j++) {
				sum += array[j][i];
			}
			temp[i] = sum;
			System.out.println("Index is: " + i + " Sum is: " + sum);

		}
		return temp;
	}

}
