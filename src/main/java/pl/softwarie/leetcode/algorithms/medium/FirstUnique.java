package pl.softwarie.leetcode.algorithms.medium;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/531/week-4/3313/
 */
public class FirstUnique {

    private static final int NOT_FOUND = -1;

    private Queue<Integer> queue = new LinkedList<>();
    private Map<Integer, Integer> map = new HashMap<>();

    public FirstUnique(int[] nums) {
        for (int item : nums) {
            add(item);
        }
    }

    public int showFirstUnique() {
        if (queue.isEmpty()) {
            return NOT_FOUND;
        }
        while (!queue.isEmpty()) {
            Integer peek = queue.peek();
            if (map.get(peek) > 1) {
                queue.remove();
            } else {
                return peek == null ? NOT_FOUND : peek;
            }
        }
        return NOT_FOUND;
    }

    public void add(int key) {
        if (map.containsKey(key)) {
            map.put(key, map.get(key) + 1);
        } else {
            queue.add(key);
            map.put(key, 1);
        }
    }
}
