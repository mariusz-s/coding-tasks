package pl.softwarie.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/bulls-and-cows/
 */
public class BullsAndCows {

    public String getHint(String secret, String guess) {
        int bulls = 0;
        int[] countsSecret = new int[10];
        int[] countsGuess = new int[10];
        for (int i = 0; i < secret.length(); i++) {
            char a = secret.charAt(i);
            char b = guess.charAt(i);
            if (a == b) {
                bulls++;
            } else {
                countsSecret[a - '0']++;
                countsGuess[b - '0']++;
            }
        }
        int cows = 0;
        for (int i = 0; i < 10; i++) {
            cows += Math.min(countsSecret[i], countsGuess[i]);
        }
        return bulls + "A" + cows + "B";
    }
}
