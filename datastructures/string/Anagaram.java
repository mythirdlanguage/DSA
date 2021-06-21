package string;

import java.util.HashMap;
import java.util.Map;

/*
 * Given two strings a and b consisting of lowercase characters.
 *  The task is to check whether two given strings are an anagram of each other or not. 
 *  An anagram of a string is another string that contains the same characters, only the order of characters can be different.
 *  For example, “act” and “tac” are an anagram of each other.
 *  
 *  Input:
 *		a = geeksforgeeks, b = forgeeksgeeks
 * 	Output: true
 */
public class Anagaram {

	/**
	 * Other options for this problem is to sort the characters and check for
	 * equals, have an array initialized to all ascii value of small characters and
	 * maintain it as count array
	 * 
	 * @param inputStr
	 * @param checkStr
	 * @return
	 */
	private static boolean checkForAnagram(String inputStr, String checkStr) {
		if (inputStr.length() != checkStr.length())
			return false;

		int count;
		Map<Character, Integer> characterCountMap = new HashMap<>();
		for (int i = 0; i < inputStr.length(); i++) {
			char key = inputStr.charAt(i);
			if (characterCountMap.containsKey(key)) {
				count = characterCountMap.get(key);
				characterCountMap.put(key, count + 1);
			} else {
				characterCountMap.put(key, 1);
			}
		}

		for (int i = 0; i < checkStr.length(); i++) {
			char key = checkStr.charAt(i);
			if (characterCountMap.containsKey(key)) {
				count = characterCountMap.get(key) - 1;
				if (count == 0) {
					characterCountMap.remove(key);
				} else {
					characterCountMap.put(key, count);
				}

			} else {
				return false;
			}
		}
		return characterCountMap.isEmpty();
	}

	public static void main(String[] args) {
		String inputStr = "vivek";
		String checkStr = "kevvi";
		System.out.println("Is anagram ? " + checkForAnagram(inputStr, checkStr));
	}

}
