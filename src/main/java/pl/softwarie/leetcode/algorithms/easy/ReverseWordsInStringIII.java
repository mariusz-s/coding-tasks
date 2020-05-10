package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/reverse-words-in-a-string-iii/
 */
public class ReverseWordsInStringIII {

    public String reverseWords(String s) {
        if (s == null) {
            return null;
        }
        char[] output = s.toCharArray();
        int index = 0;
        int wordLength = 0;
        while (index < output.length) {
            while (index + wordLength < output.length && output[index + wordLength] != ' ') {
                wordLength++;
            }
            swap(output, index, index + wordLength - 1);
            index += wordLength + 1;
            wordLength = 0;
        }
        return new String(output);
    }

    private void swap(char[] output, int start, int end) {
        char tmp;
        while (start < end) {
            tmp = output[start];
            output[start] = output[end];
            output[end] = tmp;
            start++;
            end--;
        }
    }
}
