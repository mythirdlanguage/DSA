package string;

/**
 * Given an array A of N elements. Find the majority element in the array. A
 * majority element in an array A of size N is an element that appears more than
 * N/2 times in the array.
 * 
 * Example 1: 
 * Input: N = 3 
 * A[] = {1,2,3} 
 * Output: -1 
 * Explanation: Since, each
 * element in {1,2,3} appears only once so there is no majority element.
 * 
 * Example 2:
 * Input: N = 5 
 * A[] = {3,1,3,3,2} 
 * Output: 3 
 * Explanation: Since, 3 is present
 * more than N/2 times, so it is the majority element.
 */

public class MajorityElement {

	private static int findMajorityElement(int[] elementArr, int size) {
		if (size == 0)
			return -1;
		int[] countArr = new int[9999999];
		int majorityElementIndex = -1;
		for (int i : elementArr) {
			countArr[i] += 1;
			if (majorityElementIndex == -1 || countArr[majorityElementIndex] < countArr[i])
				majorityElementIndex = i;
		}
		return countArr[majorityElementIndex] > elementArr.length / 2 ? majorityElementIndex : -1;
	}

	public static void main(String[] args) {
		int[] elementArr = { 6, 1, 15, 19, 9, 13, 12, 6, 7, 2, 10, 4, 1, 14, 11, 14, 14, 13 };
		System.out.println("Majority Element: " + findMajorityElement(elementArr, elementArr.length));
	}

}
