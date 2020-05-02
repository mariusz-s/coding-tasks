package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/jewels-and-stones/
 */
public class JewelsAndStones {

    public int numJewelsInStones(String J, String S) {
        if (J == null || S == null) {
            return 0;
        }
        int[] jewels = new int[128];
        for (int i = 0; i < J.length(); i++) {
            jewels[J.charAt(i)]++;
        }
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            count += jewels[S.charAt(i)];
        }
        return count;
    }
}
