package oct2321;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTest {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements you want to store: ");
		n = sc.nextInt();	
		int[] array = new int[n];
		System.out.print("Input elements in Array: ");
		for (int i = 0; i < n; i++) {
			// reading array elements from the user
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);
		System.out.println("Elements of array sorted in ascending order: ");
		// prints array using the for loop
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("Enter the element :: ");
		int elem = sc.nextInt();
		int arrlength = (array.length - 1);
		binarySearch(array, 0, elem, arrlength);
	}

	public static void binarySearch(int[] arr, int start, int elem, int length) {
		int midValue = (start + length) / 2;
		System.out.println("Mid Element :: " + midValue);
		while (start <= length) {
			if (arr[midValue] < elem) {
				start = midValue + 1;
			} else if (arr[midValue] == elem) {
				System.out.println("Element is found at index :" + midValue);
				break;
			} else {
				length = midValue - 1;
			}
			midValue = (start + length) / 2;
		}
		if (start > length) {
			System.out.println("Element is not found");
		}
	}
}
