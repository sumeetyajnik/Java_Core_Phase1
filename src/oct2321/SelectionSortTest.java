package oct2321;

public class SelectionSortTest {

	public static void main(String[] args) {

		int[] arr = { 29, 72, 98, 13, 87, 66, 52, 51, 36 };
		selectionSort(arr);
		System.out.println("The sorted elements are:");
		for (int i : arr) {
			System.out.println(i);
		}
	}

	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {

					index = j;
				}
			}
			int smallNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallNumber;
		}
	}
}
