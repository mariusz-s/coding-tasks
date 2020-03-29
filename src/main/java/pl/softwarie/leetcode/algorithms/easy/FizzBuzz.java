package pl.softwarie.leetcode.algorithms.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/fizz-buzz/
 */
public class FizzBuzz {

    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            boolean mod3 = (i % 3 == 0);
            boolean mod5 = (i % 5 == 0);
            if (mod3 && mod5) {
                result.add("FizzBuzz");
            } else if (mod5) {
                result.add("Buzz");
            } else if (mod3) {
                result.add("Fizz");
            } else {
                result.add(Integer.toString(i));
            }
        }
        return result;
    }
}
