package arrays;

/*
 * Given a sorted array arr[] of distinct integers. 
 * Sort the array into a wave-like array and return it. 
 * In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5.....
 * 
 * Example:
 * 		Input:
 *			n = 5
 *			arr[] = {1,2,3,4,5}
 *		Output: 2 1 4 3 5
 */
public class WaveArray {

	private static void printArray(int[] elements) {
		for (int i : elements) {
			System.out.print(i);
		}
	}

	private static void convertAndPrintArrayInWaveForm(int[] elements) {
		int first = 0, second = first + 1, temp;
		while (first < elements.length - 1 && second < elements.length) {
			temp = elements[first];
			elements[first] = elements[second];
			elements[second] = temp;
			first = second + 1;
			second = first + 1;
		}
	}

	public static void main(String[] args) {
		int[] elements = { 2, 4, 7, 8, 9, 10 };
		convertAndPrintArrayInWaveForm(elements);
		printArray(elements);
	}

}
