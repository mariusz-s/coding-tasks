package pl.softwarie.hackerrank.algorithms;

import java.util.Scanner;

/**
 * Description:  https://www.hackerrank.com/challenges/utopian-tree
 */
public class UtopianTree {

    /**
     * @param args main method for input reading and printing results
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        short T = input.nextShort();

        if (T < 1 || T > 10)
            return;

        for (short i = 0; i < T; i++) {

            short N = input.nextShort();

            if (N >= 0 && N <= 60)
                System.out.println(getTreeHeight(N));
        }
    }

    /**
     * @param cycles number of cycles
     * @return tree height
     */
    private static int getTreeHeight(short cycles) {

        int height = 1;

        for (short i = 0; i < cycles; i++) {

            if (i % 2 == 0)
                height *= 2;
            else
                height += 1;
        }

        return height;
    }
}
