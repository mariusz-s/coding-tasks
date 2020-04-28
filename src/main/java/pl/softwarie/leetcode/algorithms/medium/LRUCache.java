package pl.softwarie.leetcode.algorithms.medium;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/lru-cache/submissions/
 */
public class LRUCache {

    private Map<Integer, Integer> map;
    private int capacity;

    public LRUCache(int capacity) {
        this.map = new LinkedHashMap<>(capacity);
        this.capacity = capacity;
    }

    public int get(int key) {
        int result = -1;
        if (map.containsKey(key)) {
            result = map.get(key);
            map.remove(key);
            map.put(key, result);
        }
        return result;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            map.remove(key);
        } else if (map.size() == capacity) {
            int first = map.entrySet().iterator().next().getKey();
            map.remove(first);
        }
        map.put(key, value);
    }
}
