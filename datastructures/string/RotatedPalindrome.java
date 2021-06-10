package string;

/*
 * Given a string, check whether it is a rotated palindrome of a string
 * 
 * For example:
 * BAABC is a rotated palindrome of ABCBA
 * DDECCE is a rotated palindrome of CEDDEC
 * 
 */

public class RotatedPalindrome {

	private static boolean isRotatedPalindrome(String input) {
		char[] inputCharArr = input.toCharArray();
		int rotationCount = ( inputCharArr.length / 2 ) + ( inputCharArr.length % 2 );
		while (rotationCount > 0) {
			if (inputCharArr[0] != inputCharArr[inputCharArr.length - 1]) {
				rotateArr(inputCharArr);
				rotationCount--;
			} else {
				break;
			}
		}
		return inputCharArr[0] == inputCharArr[inputCharArr.length - 1];
	}

	private static void rotateArr(char[] inputCharArr) {
		char lastElement = inputCharArr[inputCharArr.length - 1];
		for (int i = inputCharArr.length - 1; i > 0; i--) {
			inputCharArr[i] = inputCharArr[i - 1];
		}
		inputCharArr[0] = lastElement;
	}

	public static void main(String[] args) {
		System.out.println(isRotatedPalindrome("BAABC"));
	}

}
