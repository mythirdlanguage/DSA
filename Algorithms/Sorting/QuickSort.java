package Sorting;

/*
 * QuickSort:
 * 	-> Follows Divide & Conquer method
 * 	-> Inplace sorting
 * 
 * Time complexity:
 * 	Best case -> O(n log n) - Happens when the partition is balanced
 *  Worst case -> O(n^2) - Happens when the partition is unbalanced
 *  
 * Space complexity:
 * 	No additional DS used to store the values
 *  Only the space used in the recursion stack
 *  
 *  Note: Randomized pivotal selection can be used to reduce the risk of worst case scenario
 * 	
 */

public class QuickSort {
	private static void print(int[] numArr) {
		for (int i : numArr) {
			System.out.print(i + ", ");
		}
	}
	private static void swap(int[] numArr, int i, int current) {
		int temp = numArr[current];
		numArr[current] = numArr[i];
		numArr[i] = temp;
	}
	
	private static int partition(int[] numArr, int left, int right) {
		int i = left - 1;
		int pivotal = numArr[right];
		for (int current = left; current < right; current++) {
			if (numArr[current] <= pivotal) {
				i++;
				swap(numArr, i, current);
			}			
		}
		swap(numArr, i + 1, right);
		return i + 1;
		
	}
	
	private static void quickSort(int[] numArr, int left, int right) {
		if (left < right) {
			int pivotalIndex = partition(numArr, left, right);
			quickSort(numArr, left, pivotalIndex - 1);
			quickSort(numArr, pivotalIndex + 1, right);
		}
	}
	
	public static void main(String[] args) {
		int[] numArr = { 8, 5, 6, 3, 7, 2, 1, 3};
		System.out.print("Before Sorting .. ");
		print(numArr);
		quickSort(numArr, 0, numArr.length - 1);
		System.out.print("\nAfter Sorting .. ");
		print(numArr);
	}

}
