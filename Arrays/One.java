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

public class One {

	public static void findPair(int[] inputArray, int sum) {
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i + 1; j < inputArray.length; j++) {
				if (inputArray[i] + inputArray[j] == sum) {
					System.out.println("Pair found (" + inputArray[i] + "," + inputArray[j] + ")");
					break;
				}
			}
		}
	}

	public static void main(String args[]) {
		int[] inputArray = { 8, 7, 2, 5, 3, 1 };
		int sum = 10;
		findPair(inputArray, sum);
	}

}
