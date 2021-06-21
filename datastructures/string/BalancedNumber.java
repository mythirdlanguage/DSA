package string;

/*
 * Given an integer N which has odd number of digits, find whether the given number is a balanced or not.
 * An odd digit number is called a balanced number if the sum of all digits to the left of the middle digit and
 * the sum of all digits to the right of the middle digit is equal.
 * 
 * Input:
 *	N = 1234006
 *	Output: true
 */
public class BalancedNumber {

	private static boolean balancedNumber(String inputStr) {
		if (inputStr == null || inputStr.isEmpty())
			return false;
		char[] inputCharArr = inputStr.toCharArray();
		int middleIndex = inputCharArr.length / 2, firstHalfValue = 0, secondHalfValue = 0;
		for (int i = 0; i < middleIndex; i++) {
			firstHalfValue += inputCharArr[i] - '0'; // converting char to int
		}
		for (int i = middleIndex + 1; i < inputCharArr.length; i++) {
			secondHalfValue += Character.getNumericValue(inputCharArr[i]); // converting char to int. One another way is
																			// Integer.parseInt(String.valueOf(inputCharArr[i]))
		}
		if (firstHalfValue == secondHalfValue)
			return true;
		return false;
	}

	public static void main(String[] args) {
		String inputStr = "1234321";
		System.out.println("Balanced Number: " + balancedNumber(inputStr));
	}

}
