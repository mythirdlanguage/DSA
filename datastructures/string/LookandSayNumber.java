package string;

public class LookandSayNumber {

    private static void printLookandSayNumber(int n) {
        String result = "1";
        for (int i = 2; i <= n; i++) {
            result = generateLookandSayNumber(result);
        }
        System.out.println(result);
    }

    private static String generateLookandSayNumber(String result) {
        char[] charArr = result.toCharArray();
        char temp = charArr[0];
        int count = 0;
        result = "";
        for (int i = 0; i < charArr.length; i++) {
            if (temp != charArr[i]) {
                result += count + String.valueOf(temp);
                count = 0;
                temp = charArr[i];
            }
            count++;
        }
        result += count + String.valueOf(temp);
        return result;
    }

    public static void main(String[] args) {
        printLookandSayNumber(6);
    }


}
