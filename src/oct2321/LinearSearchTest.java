package oct2321;

import java.util.Scanner;

public class LinearSearchTest {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements you want to store: ");
		n = sc.nextInt();
		int[] array = new int[10];
		for (int i = 0; i < n; i++) {
			// reading array elements from the user
			array[i] = sc.nextInt();
		}
		System.out.println("Enter the element to be searched");
		int searchValue = sc.nextInt();

		int result = linearing(array, searchValue);
		if (result == -1) {
			System.out.println("Element not found in the array list");
		} else {

			System.out.println("Element found at " + result + " and the search key is " + array[result]);
		}
	}

	public static int linearing(int arr[], int elem) {

		int arrlength = arr.length;
		for (int i = 0; i < arrlength - 1; i++) {
			if (arr[i] == elem) {
				return i;
			}
		}
		return -1;
	}
}
