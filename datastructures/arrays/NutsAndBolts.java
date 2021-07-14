package arrays;

/*Given a set of N nuts of different sizes and N bolts of different sizes. There is a one-one mapping between nuts and bolts. Match nuts and bolts efficiently.

Comparison of a nut to another nut or a bolt to another bolt is not allowed. It means nut can only be compared with bolt and bolt can only be compared with nut to see which one is bigger/smaller.
The elements should follow the following order ! # $ % & * @ ^ ~ .

Example 1:

Input: 
N = 5
nuts[] = {@, %, $, #, ^}
bolts[] = {%, @, #, $ ^}
Output: 
# $ % @ ^
# $ % @ ^
Example 2:

Input: 
N = 9
nuts[] = {^, &, %, @, #, *, $, ~, !}
bolts[] = {~, #, @, %, &, *, $ ,^, !}
Output: 
! # $ % & * @ ^ ~
! # $ % & * @ ^ ~

*/
public class NutsAndBolts {

	private static void matchPairs(char[] nuts, char bolts[], int n) {
		for (int i = 0; i < n; i++) {
			int pairIndex = getPairIndex(nuts[i], bolts);
			for (int j = 0; j < n; j++) {
				if (nuts[i] > bolts[j] && pairIndex != -1 && pairIndex < j) {
					char temp = bolts[j];
					bolts[j] = bolts[pairIndex];
					bolts[pairIndex] = temp;
					pairIndex = j;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			nuts[i] = bolts[i];
		}
	}

	private static int getPairIndex(char ch, char[] bolts) {
		for (int i = 0; i < bolts.length; i++) {
			if (bolts[i] == ch) {
				return i;
			}
		}
		return -1;
	}

	private static void printArray(char[] arrayToPrint) {
		for (char ch : arrayToPrint) {
			System.out.print(ch);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		char nuts[] = { '^', '&', '%', '@', '#', '*', '$', '~', '!' };
		char bolts[] = { '~', '#', '@', '%', '&', '*', '$', '^', '!' };
		matchPairs(nuts, bolts, nuts.length);
		printArray(nuts);
		printArray(bolts);
	}
}
