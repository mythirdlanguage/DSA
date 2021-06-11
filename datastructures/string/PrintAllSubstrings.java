package string;

/*
 * Find all the substrings of a string
 * 
 */
public class PrintAllSubstrings {

	private static void printSubString(String inputWord, int i, int j) {
		System.out.println();
		for (int index = i; index <= j; index++) {
			System.out.print(inputWord.charAt(index));
		}
	}

	private static void findAllSubStrings(String inputWord) {
		for (int i = 0; i < inputWord.length(); i++) {
			for (int j = i; j < inputWord.length(); j++) {
				printSubString(inputWord, i, j);
			}
		}
	}

	public static void main(String[] args) {
		String inputWord = "Fasttrack";
		findAllSubStrings(inputWord);
	}
}
