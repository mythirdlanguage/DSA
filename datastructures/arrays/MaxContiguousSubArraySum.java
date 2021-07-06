package arrays;

public class MaxContiguousSubArraySum {

	/**
	 * This method follows Brute force approach; 
	 * For optimized solution pls refer Kadane's Algorithm under Algorithm section
	 * 
	 * @param inputArr
	 */
	private static void findMaxContiguousSubArraySum(int[] inputArr) {
		int maxSum = Integer.MIN_VALUE, start = 0, end = 0;
		for (int i = 0; i < inputArr.length; i++) {
			int sum = inputArr[i];
			if (maxSum < sum) {
				maxSum = sum;
				start = end = i;
			}
			maxSum = maxSum < sum ? sum : maxSum;
			for (int j = i + 1; j < inputArr.length; j++) {
				sum += inputArr[j];
				if (maxSum < sum) {
					maxSum = sum;
					start = i;
					end = j;
				}
			}
		}
		System.out.println("Max sum is " + maxSum + " from index " + start + " to index " + end);
	}

	public static void main(String[] args) {
		int[] inputArr = { -2, -3, 4, -1, -2, 1, 5, -3 };
		findMaxContiguousSubArraySum(inputArr);
	}

}
