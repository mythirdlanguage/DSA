package search;

class KMPSearch {

    private static void constructLPSArray(String pattern, int[] LPSArray) {
        int i = 0, j = 1, len = pattern.length();
        while (j < len) {
            if (pattern.charAt(i) == pattern.charAt(j)) {
                i++;
                LPSArray[j] = i;
                j++;
            } else {
                if (i != 0)
                    i = LPSArray[i - 1];
                else
                    LPSArray[j] = i;
                j++;
            }
        }
    }

    private static void KMPSearch(String text, String pattern) {
        int lengthOfText = text.length();
        int lengthOfPattern = pattern.length();
        int[] LPSArray = new int[pattern.length()];
        constructLPSArray(pattern, LPSArray);
        int i = 0, j = 0;
        while (i < lengthOfText) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }
            if (j == lengthOfPattern) {
                System.out.print("Found string at index: " + (i - j));
                j = LPSArray[j - 1];
            } else if (i < lengthOfText && text.charAt(i) != pattern.charAt(j)) {
                if (j != 0)
                    j = LPSArray[j - 1];
                else
                    i++;
            }
        }
    }

    public static void main(String[] args) {
        String text = "AAABC";
        String pattern = "C";
        KMPSearch(text, pattern);
    }
}

