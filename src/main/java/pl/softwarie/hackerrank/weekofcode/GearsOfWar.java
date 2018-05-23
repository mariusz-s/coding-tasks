package pl.softwarie.hackerrank.weekofcode;

import java.util.Scanner;

/**
 * Description: https://www.hackerrank.com/contests/w23/challenges/gears-of-war
 */
public class GearsOfWar {

    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int q = input.nextInt();

        if (q < 1 || q > 100000) {
            return;
        }

        for (int i = 0; i < q; i++) {

            int n = input.nextInt();

            if (n < 3 || n > 100000) {
                continue;
            }

            if (n % 2 == 0) {
                System.out.println(YES);
            } else {
                System.out.println(NO);
            }
        }
    }
}
