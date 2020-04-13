package pl.softwarie.leetcode.algorithms.easy;

import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/last-stone-weight/
 */
public class LastStoneWeight {

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int a : stones) {
            pq.offer(a);
        }
        for (int i = 0; i < stones.length - 1; ++i) {
            pq.offer(pq.poll() - pq.poll());
        }
        return pq.poll();
    }
}
