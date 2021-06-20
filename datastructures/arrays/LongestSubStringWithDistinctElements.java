package arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithDistinctElements {

	private static void printArray(char[] elements, int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.print(elements[i]);
		}
	}

	/**
	 * Uses sliding window algorithm
	 * 
	 * @param inputStr
	 */
	private static void printLongestSubStrWithDistinctElements(String inputStr) {
		char[] elements = inputStr.toCharArray();
		int left = 0, right = 0, start = 0, end = 0, maxLength = 0, currentLength;
		Map<Character, Boolean> elementMap = new HashMap<>();
		int totalElements = inputStr.length();

		for (char i : elements)
			elementMap.put(i, false);

		while (right < totalElements) {
			if (!elementMap.get(elements[right])) {
				elementMap.put(elements[right], true);
				right++;
			}

			currentLength = ((right - 1) - left) + 1;

			if (currentLength > maxLength) {
				maxLength = currentLength;
				start = left;
				end = right - 1;
			}

			while (right < totalElements && elementMap.get(elements[right])) {
				elementMap.put(elements[left], false);
				left++;
			}
		}
		System.out.print("Longest Substring is - ");
		printArray(elements, start, end);
	}

	public static void main(String[] args) {
		String inputStr = "longestsubstr";
		printLongestSubStrWithDistinctElements(inputStr);
	}

}
