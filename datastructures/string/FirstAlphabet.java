package string;

public class FirstAlphabet {
    static String firstAlphabet(String S) {

        String result = "";
        int index = 0;
        for (int i =0;i<S.length();i++) {
            if (index ==0)
                result = result + S.charAt(i);
            if (S.charAt(i) == ' ')
                index = 0;
            else
                index++;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.print(firstAlphabet("geeks For Geeks"));
    }
}

