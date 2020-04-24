package pl.softwarie.leetcode.algorithms.medium;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/lru-cache/submissions/
 */
public class LRUCache {

    Map<Integer, Integer> map;
    int cap;

    public LRUCache(int capacity) {
        map = new LinkedHashMap<>(capacity);
        cap = capacity;
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
        } else if (map.size() == cap) {
            Map.Entry<Integer, Integer> entry = map.entrySet().iterator().next();
            int first = entry.getKey();
            map.remove(first);
        }
        map.put(key, value);
    }
}
