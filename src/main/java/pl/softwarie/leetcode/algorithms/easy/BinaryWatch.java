package pl.softwarie.leetcode.algorithms.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-watch/
 */
public class BinaryWatch {

    public List<String> readBinaryWatch(int num) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 60; j++) {
                if (Integer.bitCount((i << 6) | j) == num) {
                    result.add(i + (j < 10 ? ":0" : ":") + j);
                }
            }
        }
        return result;
    }
}
