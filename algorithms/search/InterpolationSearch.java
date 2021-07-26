package search;

public class InterpolationSearch {

	private static int search(int[] inputArray, int low, int high,  int numberToSearch) {
		int pos;
		if (low <= high && numberToSearch >= inputArray[low] && numberToSearch <= inputArray[high]) {
			// calculate pos
			pos = low + (((high-low)/(inputArray[high]-inputArray[low])) * (numberToSearch-inputArray[low]));
			if (inputArray[pos] == numberToSearch) {
				return pos;
			}
			if (inputArray[pos] < numberToSearch) {
				return search(inputArray, pos +1, high, numberToSearch);
			}
			if (inputArray[pos] > numberToSearch) {
				return search(inputArray, low , pos-1, numberToSearch);
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		int[] inputArray = { 2, 3, 4, 5, 6 };
		System.out.print("Number found at :"+ search(inputArray, 0, inputArray.length -1,  2));
	}
}
