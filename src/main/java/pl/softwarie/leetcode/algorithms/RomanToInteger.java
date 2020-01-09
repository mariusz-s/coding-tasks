package pl.softwarie.leetcode.algorithms;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    private final Map<Character, Integer> mapping;

    public RomanToInteger() {
        this.mapping = new HashMap<>();
        mapping.put('I', 1);
        mapping.put('V', 5);
        mapping.put('X', 10);
        mapping.put('L', 50);
        mapping.put('C', 100);
        mapping.put('D', 500);
        mapping.put('M', 1000);
    }

    public int romanToInt(String s) {
        int result = 0;
        int index = 0;
        int length = s.length();
        while (index < length) {
            char character = s.charAt(index);
            int val = mapping.get(character);
            if (index + 1 < length) {
                char nextCharacter = s.charAt(index + 1);
                if (isSubstract(character, nextCharacter)) {
                    result += mapping.get(nextCharacter) - val;
                    index += 2;
                    continue;
                }
            }
            result += val;
            index++;
        }

        return result;
    }

    private boolean isSubstract(char c, char n) {
        return (c == 'I' && (n == 'V' || n == 'X'))
                || (c == 'X' && (n == 'L' || n == 'C'))
                || (c == 'C' && (n == 'D' || n == 'M'));
    }
}
