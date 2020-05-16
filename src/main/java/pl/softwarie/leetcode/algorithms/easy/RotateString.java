package pl.softwarie.leetcode.algorithms.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/rotate-string/
 */
public class RotateString {

    public boolean rotateString(String A, String B) {
        if (A == null || B == null || A.length() != B.length()) {
            return false;
        }
        if (A.isEmpty()) {
            return true;
        }
        int N = A.length();
        int[] shifts = new int[N + 1];
        Arrays.fill(shifts, 1);
        int left = -1;
        for (int right = 0; right < N; ++right) {
            while (left >= 0 && (B.charAt(left) != B.charAt(right)))
                left -= shifts[left];
            shifts[right + 1] = right - left++;
        }
        int matchLen = 0;
        for (int i = 0; i < N + N; i++) {
            while (matchLen >= 0 && B.charAt(matchLen) != A.charAt(i % N)) {
                matchLen -= shifts[matchLen];
            }
            if (++matchLen == N) {
                return true;
            }
        }
        return false;
    }
}
