package pl.softwarie.hackerrank.crackingcoding;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Description: https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem
 */
public class ArraysLeftRotation {

    private static int[] solve(int[] a, int d) {
        return IntStream.concat(Arrays.stream(Arrays.copyOfRange(a, d, a.length)),
                Arrays.stream(Arrays.copyOfRange(a, 0, d))).toArray();
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = solve(a, d);

        for (int i = 0; i < result.length; i++) {
            System.out.print(String.valueOf(result[i]));

            if (i != result.length - 1) {
                System.out.print(" ");
            }
        }

        scanner.close();
    }
}
