package pl.softwarie.hackerrank.algorithms;

import java.util.Scanner;

/**
 * Description:  https://www.hackerrank.com/challenges/solve-me-first
 */
public class SolveMeFirst {

    /**
     * @param a
     * @param b
     * @return
     */
    private static int solveMeFirst(int a, int b) {
        return a + b;
    }

    /**
     * @param args main method
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int _a;
        _a = in.nextInt();
        int _b;
        _b = in.nextInt();
        int sum;
        sum = solveMeFirst(_a, _b);
        System.out.println(sum);
    }
}
