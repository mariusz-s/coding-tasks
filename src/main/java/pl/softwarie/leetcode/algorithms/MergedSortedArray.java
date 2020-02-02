package pl.softwarie.leetcode.algorithms;

/**
 * https://leetcode.com/problems/merge-sorted-array/submissions/
 */
public class MergedSortedArray {

    public void merge(int[] a, int m, int[] b, int n) {
        int index = a.length - 1;
        int i = m - 1;
        int j = n - 1;
        while (i >= 0 && j >= 0) {
            if (a[i] <= b[j]) {
                a[index--] = b[j--];
            } else {
                a[index--] = a[i--];
            }
        }
        while (j >= 0) {
            a[index--] = b[j--];
        }
    }
}
