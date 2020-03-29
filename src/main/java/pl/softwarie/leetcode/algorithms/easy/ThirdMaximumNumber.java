package pl.softwarie.leetcode.algorithms.easy;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * https://leetcode.com/problems/third-maximum-number/
 */
public class ThirdMaximumNumber {

    private static final int K_LARGEST = 3;

    public int thirdMax(int[] nums) {
        Queue<Integer> pq = new PriorityQueue<>(K_LARGEST + 1);
        for (int num : nums) {
            if (!pq.contains(num)) {
                pq.add(num);
                if (pq.size() > K_LARGEST) {
                    pq.poll();
                }
            }
        }
        while (pq.size() < K_LARGEST && pq.size() > 1) {
            pq.poll();
        }
        Integer result = pq.poll();
        return result == null ? Integer.MIN_VALUE : result;
    }
}
