package oct2421;

public class InsertionSortTest {
	public static void main(String[] args) {
		int[] arr = { 9, 7, 6, 15, 17, 5, 10, 11 };
		insertionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void insertionSort(int[] arr) {
		int len = arr.length;
		for (int j = 1; j < len; j++) {
			int key = arr[j];
			int i = j - 1;
			while ((i > -1) && (arr[i] > key)) {
				arr[i + 1] = arr[i];
				i = i-1;
			}
			arr[i + 1] = key;
		}
	}
}