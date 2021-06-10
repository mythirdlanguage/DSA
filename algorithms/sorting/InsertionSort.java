package sorting;

public class InsertionSort {

	private static void printArray(int[] inputArr) {
		for (int i : inputArr) {
			System.out.print(i + " ");
		}
	}

	/**
	 * Time complexity - O(n^2)
	 * Best Case - When all the elements are already sorted in asc order -> O(n)
	 * Worst Case - When all the elements are sorted in reverse order -> O(n^2)
	 * 
	 * Best Usage - Use when only few elements needs to be sorted
	 * 
	 * @param inputArr
	 */
	private static void insertionSort(int[] inputArr) {
		for (int i = 1; i < inputArr.length; i++) {
			int j = i - 1;
			int currentElement = inputArr[i];
			while (j >= 0 && inputArr[j] >= currentElement) {
				inputArr[j + 1] = inputArr[j];
				j--;
			}
			inputArr[j + 1] = currentElement;
		}
	}

	public static void main(String[] args) {
		int[] inputArr = { 4, 8, 2, 9, 1, 7, 3, 5, 2 };
		System.out.print("Before sorting ...");
		printArray(inputArr);
		insertionSort(inputArr);
		System.out.print("\nAfter sorting ...");
		printArray(inputArr);
	}

}
