package Misc;

public class KadanesAlgorithm {

	private static void printMaxContiguousSubArraySum(int[] inputArr) {
		int maxSum = Integer.MIN_VALUE, temp = 0;
		for (int i : inputArr) {
			temp = i > i + temp ? i : i + temp;
			if (maxSum < temp)
				maxSum = temp;
		}
		System.out.println("Max Sum is " + maxSum);
	}

	public static void main(String[] args) {
		int[] inputArr = { 1,2,3,-2,5 };
		printMaxContiguousSubArraySum(inputArr);
	}

}
