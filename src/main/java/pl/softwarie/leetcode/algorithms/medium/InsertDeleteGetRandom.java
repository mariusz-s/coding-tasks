package pl.softwarie.leetcode.algorithms.medium;

import java.util.*;

/**
 * https://leetcode.com/problems/insert-delete-getrandom-o1/
 */
public class InsertDeleteGetRandom {

    private final Map<Integer, Integer> map = new HashMap<>();
    private final List<Integer> list = new ArrayList<>();

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        map.put(val, list.size());
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        Integer index = map.get(val);
        if (index == null) {
            return false;
        }
        int lastVal = list.get(list.size() - 1);
        list.set(index, lastVal);
        list.remove(list.size() - 1);
        map.put(lastVal, index);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        return list.get(new Random().nextInt(list.size()));
    }
}
