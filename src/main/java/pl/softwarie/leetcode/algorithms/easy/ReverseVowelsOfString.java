package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/reverse-vowels-of-a-string/
 */
public class ReverseVowelsOfString {

    public String reverseVowels(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        int start = 0;
        int end = s.length() - 1;
        char[] result = s.toCharArray();
        while (start < end) {
            char a = result[start];
            char b = result[end];
            boolean isAVowel = isVowel(a);
            boolean isBVowel = isVowel(b);
            if (isAVowel && isBVowel) {
                result[start] = b;
                result[end] = a;
                start++;
                end--;
            } else if (isAVowel) {
                end--;
            } else if (isBVowel) {
                start++;
            } else {
                start++;
                end--;
            }
        }
        return new String(result);
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}
