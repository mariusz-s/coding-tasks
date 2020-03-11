package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/first-bad-version/
 */
public class FirstBadVersion {

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
//            if (isBadVersion(mid)) {
            if (true) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
