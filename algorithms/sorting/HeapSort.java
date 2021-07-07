package sorting;

/**
 * Time complexity - O(NlogN)
 * Space complexity - O(1)
 * Stability - No 
 */
public class HeapSort {

	public static void heapSort(int[] arrayToBeSorted) {
		for (int i = arrayToBeSorted.length / 2 - 1; i >= 0; i--)
			heapify(arrayToBeSorted, arrayToBeSorted.length, i);

		for (int i = arrayToBeSorted.length - 1; i >= 0; i--) {
			int temp = arrayToBeSorted[i];
			arrayToBeSorted[i] = arrayToBeSorted[0];
			arrayToBeSorted[0] = temp;

			heapify(arrayToBeSorted, i, 0);
		}

	}

	private static void heapify(int[] arrayToBeSorted, int lengthOfArray, int rootIndex) {
		int indexOfLargestElement = rootIndex;
		int left = 2 * rootIndex + 1;
		int right = 2 * rootIndex + 2;

		if (left < lengthOfArray && arrayToBeSorted[left] > arrayToBeSorted[indexOfLargestElement])
			indexOfLargestElement = left;

		if (right < lengthOfArray && arrayToBeSorted[right] > arrayToBeSorted[indexOfLargestElement])
			indexOfLargestElement = right;

		if (indexOfLargestElement != rootIndex) {
			int temp = arrayToBeSorted[rootIndex];
			arrayToBeSorted[rootIndex] = arrayToBeSorted[indexOfLargestElement];
			arrayToBeSorted[indexOfLargestElement] = temp;

			heapify(arrayToBeSorted, lengthOfArray, indexOfLargestElement);

		}

	}

	public static void printArray(int[] arrayToPrint) {
		for (int i : arrayToPrint) {
			System.out.print(i + ",");
		}

	}

	public static void main(String[] args) {
		int[] arrayToBeSorted = { 9, 4, 6, 1, 3, 7 };
		printArray(arrayToBeSorted);
		heapSort(arrayToBeSorted);
		System.out.println("");
		printArray(arrayToBeSorted);
	}

}
