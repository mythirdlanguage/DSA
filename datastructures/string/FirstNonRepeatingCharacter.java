package string;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        checkForFirstNonRepeatingCharacter("hello");
        System.out.print(nonrepeatingCharacter("hello")); // More optimal solution
    }

    private static void checkForFirstNonRepeatingCharacter(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        char[] charArr = str.toCharArray();
        for (char ch : charArr) {
            if (map.get(ch) != null) {
                map.put(ch, map.get(ch)+1);
                continue;
            }
            map.put(ch, 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print("First non repeating character is " + entry.getKey());
                break;
            }
        }
    }

    static char nonrepeatingCharacter(String s) {
        int[] alpha = new int[26];
        for (char c : s.toCharArray()) alpha[c - 'a']++;
        for (int i = 0; i < s.length(); ++i)
            if (alpha[s.charAt(i) - 'a'] == 1) return s.charAt(i);
        return '$';
    }
}
