package pl.softwarie.leetcode.algorithms;

public class CountAndSay {

    public String countAndSay(int n) {
        switch (n) {
            case 1:
                return "1";
            case 2:
                return "11";
            case 3:
                return "21";
            case 4:
                return "1211";
            case 5:
                return "111221";
        }
        String previous = countAndSay(n - 1);
        char current = previous.charAt(0);
        int count = 1;
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < previous.length(); i++) {
            if (current == previous.charAt(i)) {
                count++;
            } else {
                result.append(count).append(current);
                current = previous.charAt(i);
                count = 1;
            }
        }
        result.append(count).append(current);
        return result.toString();
    }
}
