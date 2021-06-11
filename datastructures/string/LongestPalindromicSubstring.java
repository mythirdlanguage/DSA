package string;

/*
 * Find the longest palindrome substring of a string
 * 
 * For example: wasitacaroracatisaw (was it a car or a cat i saw)
 * 
 * Longest Palindrome - wasitacaroracatisaw
 */
public class LongestPalindromicSubstring {

	private static void printSubString(String inputWord, int startIndex, int endIndex) {
		for (int i = startIndex; i <= endIndex; i++) {
			System.out.print(inputWord.charAt(i));
		}
	}

	private static void isPalindrome(String inputWord) {
		int maxLength = 1, startIndex = 0;
		boolean isPalindromicCandidate;
		for (int i = 0; i < inputWord.length(); i++) {
			for (int j = i; j < inputWord.length(); j++) {
				isPalindromicCandidate = true;
				// Check if the substring is a palindrome
				for (int k = 0; k < ((j - i) + 1) / 2; k++) {
					if (inputWord.charAt(i + k) != inputWord.charAt(j - k)) {
						isPalindromicCandidate = false;
						break;
					}
				}
				if (isPalindromicCandidate && ((j - i) + 1) > maxLength) {
					startIndex = i;
					maxLength = ((j - i) + 1);
				}

			}
		}
		printSubString(inputWord, startIndex, (startIndex + maxLength - 1));
	}

	public static void main(String[] args) {
		String inputWord = "wastcaroracatisa";
		isPalindrome(inputWord);
	}

}
