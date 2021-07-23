package string;

public class GenerateParanthesis {

    private static void generateParanthesis(int n) {
        generateParanthesis(0, 0, n, "");
    }

    private static void generateParanthesis(int l, int r, int n, String s) {
        if (s.length() == n*2) {
            System.out.println(s);
        }
        if (l < n) {
            generateParanthesis(l + 1, r, n, s + "(");
        }
        if (r < l) {
            generateParanthesis(l, r + 1, n, s + ")");
        }
    }

    public static void main(String[] args) {
        generateParanthesis(3);
    }
}
