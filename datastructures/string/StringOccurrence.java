package string;

/*
    Task is to implement the function strstr. The function takes two strings as arguments (s,x) and  locates the occurrence of the string x in the string s. The function returns and integer denoting the first occurrence of the string x in s (0 based indexing).
    Note: You are not allowed to use inbuilt function.
   
   	Input:
		s = GeeksForGeeks, x = For
	Output: 5
	Explanation: For is present as substring in GeeksForGeeks from index 5 (0 based indexing).
	
	Input:
		s = GeeksForGeeks, x = Fr
	Output: -1
	Explanation: Fr is not present in the string GeeksForGeeks as substring.
 */
public class StringOccurrence {

	private static int findStringOccurrence(String mainString, String testString) {
		if (mainString == null || testString == null || mainString.isEmpty() || testString.isEmpty())
			return -1;
		char[] mainChar = mainString.toCharArray();
		char[] testChar = testString.toCharArray();

		for (int i = 0; i < mainChar.length; i++) {
			if (mainChar[i] == testChar[0])
				if (testForSubStr(mainChar, testChar, i))
					return i;
		}
		return -1;
	}

	private static boolean testForSubStr(char[] mainChar, char[] testChar, int index) {
		int i, j;
		for (i = 1, j = index + 1; i < testChar.length && j < mainChar.length; i++, j++) {
			if (testChar[i] != mainChar[j])
				return false;
		}
		return i == testChar.length;
	}

	public static void main(String[] args) {
		String mainString = "Martin";
		String testString = "int";
		System.out.println("String " + testString + " found in " + mainString + " at "
				+ findStringOccurrence(mainString, testString));
	}

}
