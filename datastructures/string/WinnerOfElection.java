package string;

import java.util.HashMap;
import java.util.Map;

public class WinnerOfElection {

    public static void winner(String arr[], int n) {
        Map<String, Integer> countMap = new HashMap<>();
        for (String str : arr) {
            if (countMap.get(str) != null) {
                countMap.put(str, countMap.get(str) + 1);
                continue;
            }
            countMap.put(str, 1);
        }
        int maxValue = 0;
        String winner = null;
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                winner = entry.getKey();
            } else if (entry.getValue() == maxValue) {
                if (entry.getKey().compareTo(winner) < 0) {
                    winner = entry.getKey();
                }
            }
        }
        System.out.print(winner);
    }

    public static void main(String[] args) {
        winner(new String[]{"john", "johnny", "jackie", "johnny", "john"
                , "jackie", "jamie", "jamie", "john", "johnny", "jamie",
                "johnny", "john"}, 13);
    }
}
