package search;

public class BinarySearch {

	private static void search(int[] inputArray, int numberToSearch) {
		int i = 0, j = inputArray.length - 1, middle;
		while (i <= j) {
			middle = (i + j) / 2;
			if (inputArray[middle] == numberToSearch) {
				System.out.println("Number found at: " + middle);
				return;
			}
			if (inputArray[middle] < numberToSearch) {
				i = middle + 1;
			} else {
				j = middle - 1;
			}
		}
		System.out.println("Number not found");
	}

	public static void main(String[] args) {
		int[] inputArray = { 2, 3, 4, 5, 6 };
		search(inputArray, 2);
	}
}
