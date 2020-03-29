package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/convert-a-number-to-hexadecimal/
 */
public class ConvertNumberHexadecimal {

    public String toHex(int num) {
        char[] map = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        StringBuilder res = new StringBuilder(num == 0 ? "0" : "");
        while (num != 0) {
            res.insert(0, map[num & 15]);
            num >>>= 4;
        }
        return res.toString();
    }
}
