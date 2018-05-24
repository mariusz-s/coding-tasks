package pl.softwarie.hackerrank.crackingcoding;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Description: https://www.hackerrank.com/challenges/ctci-making-anagrams/problem
 */
public class StringAnagrams {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        System.out.println(solve(a, b));

        scanner.close();
    }

    private static int solve(String a, String b) {
        int[] counters = new int[26];
        for (char c : a.toCharArray()) {
            counters[c - 'a']++;
        }
        for (char c : b.toCharArray()) {
            counters[c - 'a']--;
        }
        return Arrays.stream(counters).map(Math::abs).sum();
    }
}
