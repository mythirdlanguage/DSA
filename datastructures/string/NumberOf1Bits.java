package string;

public class NumberOf1Bits {

	private static void printNumberOf1Bits(int number) {
		int temp = 0, countOf1Bits = 0;
		int[] bitArray = new int[10];
		while (number > 0) {
			bitArray[temp] = number % 2;
			countOf1Bits = bitArray[temp] == 1 ? ++countOf1Bits : countOf1Bits;
			number = number / 2;
			temp++;
		}
		System.out.println("Number of 1 bits: " + countOf1Bits);
	}

	public static void main(String[] args) {
		printNumberOf1Bits(8);
	}

}
