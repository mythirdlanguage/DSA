package arrays;

import java.util.ArrayList;
import java.util.List;

/*

 Given an integer array, check if it contains a subarray  having zero-sum
 
 	Input:  { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }
 
	Output: Subarray with zero-sum exists
 
	The subarrays with a sum of 0 are:
	 
	{ 3, 4, -7 }
	{ 4, -7, 3 }
	{ -7, 3, 1, 3 }
	{ 3, 1, -4 }
	{ 3, 1, 3, 1, -4, -2, -2 }
	{ 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }
	
 */

public class SubArrayWithZeroSum {

	private static void printList(List<Integer> subArrayList) {
		System.out.print("\n{");
		for (int i : subArrayList) {
			System.out.print(" " + i);
		}
		System.out.print(" }");
	}

	/**
	 * BruteForce
	 * 
	 * Time complexity - O(n^2)
	 * @param inputArray
	 */
	private static void printSubArrayWithZeroSum(int[] inputArray) {
		for (int i = 0; i < inputArray.length - 1; i++) {
			List<Integer> subArrayList = new ArrayList<>();
			int sum = 0;
			sum += inputArray[i];
			subArrayList.add(inputArray[i]);
			for (int j = i + 1; j < inputArray.length; j++) {
				sum += inputArray[j];
				subArrayList.add(inputArray[j]);
				if (sum == 0) {
					printList(subArrayList);
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] inputArray = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
		printSubArrayWithZeroSum(inputArray);
	}

}
