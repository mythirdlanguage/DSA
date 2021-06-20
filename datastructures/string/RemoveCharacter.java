package string;

/*
 * Given two strings string1 and string2, remove those characters from first string(string1) which are present in second string(string2). 
 * Both the strings are different and contain only lowercase characters.
 * 
 * Input:
 *	string1 = "occurrence"
 *	string2 = "car"
 *	Output: "ouene"
 */
public class RemoveCharacter {

	private static void removeCharacters(String inputStr, String charToBeRemoved) {
		String resultStr = "";
		char[] inputCharactersArr = inputStr.toCharArray();
		for (char ch : inputCharactersArr) {
			if (charToBeRemoved.indexOf(ch) < 0)
				resultStr += ch;
		}

		System.out.println(resultStr);
	}

	public static void main(String[] args) {
		String inputStr = "occurrence";
		String charToBeRemoved = "car";
		removeCharacters(inputStr, charToBeRemoved);
	}

}
