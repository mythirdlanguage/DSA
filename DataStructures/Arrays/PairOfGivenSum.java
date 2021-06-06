package Arrays;
import java.util.Arrays;
import java.util.HashSet;

/*
Problem ~ Find a pair with given sum in an array

Input: 
arr = [8, 7, 2, 5, 3, 1]
sum = 10

Output:
Pair found (8, 2)
or
Pair found (7, 3)

Input:
arr = [5, 2, 6, 8, 1, 9]
sum = 12

Output: Pair not found
*/

// Solution

public class PairOfGivenSum {

	/**
	 * Time complexity - O(n^2)
	 * 
	 * @param inputArray
	 * @param sum
	 */
	public static void findAllThePairsBruteForce(int[] inputArray, int sum) {
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i + 1; j < inputArray.length; j++) {
				if (inputArray[i] + inputArray[j] == sum) {
					System.out.println("findAllThePairs: Pair found (" + inputArray[i] + "," + inputArray[j] + ")");
				}
			}
		}
	}

	/**
	 * Time complexity - O(n log n) for sorting (Depends on sorting used. Here the
	 * sorting used in Arrays.sort is Dual pivot quick sort), O(n) for finding the
	 * pair
	 * Space complexity - Depends on sorting algorithm used. 
	 * 
	 * @param inputArray
	 * @param sum
	 */
	public static void findAllThePairsUsingSorting(int[] inputArray, int sum) {
		Arrays.sort(inputArray);
		int frontIndex = 0, backIndex = inputArray.length - 1, frontNumber, backNumber;
		while (frontIndex < backIndex) {
			frontNumber = inputArray[frontIndex];
			backNumber = inputArray[backIndex];
			if (sum == frontNumber + backNumber) {
				System.out.println("findAllThePairsUsingSorting: Pair found (" + frontNumber + ","
						+ backNumber + ")");
				frontIndex++;
				backIndex--;
			} else if (frontNumber + backNumber < sum) {
				frontIndex++;
			} else {
				backIndex--;
			}

		}
	}

	/**
	 * Time complexity - o(n)
	 * Space complexity - o(n)
	 * 
	 * Note: This works differently for unordered and ordered array
	 * 
	 * @param inputArray
	 * @param sum
	 */
	public static void findAllThePairsUsingHashMap(int[] inputArray, int sum) {
		HashSet<Integer> set = new HashSet<>();
		for (int i : inputArray) {
			int value = sum - i;
			if (set.contains(value)) {
				System.out.println("findAllThePairsUsingHashMap: Pair found (" + i + "," + value + ")");
			}
			set.add(i);
		}

	}

	public static void main(String args[]) {
		int[] inputArray = { 1, 8, 7, 9, 2, 2, 5, 3, 1, 5 };
		int sum = 10;
		findAllThePairsBruteForce(inputArray, sum);
		System.out.println("----------------------------------------");
		findAllThePairsUsingHashMap(inputArray, sum);
		System.out.println("----------------------------------------");
		findAllThePairsUsingSorting(inputArray, sum);
	}
}
