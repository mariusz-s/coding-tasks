package pl.softwarie.hackerrank.algorithms;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Description:  https://www.hackerrank.com/challenges/gem-stones
 */
public class GemStones {

    /**
     * @param args Solution for gem-stones task, input from console
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Set<Character> result = new HashSet<>();

        short n = Short.parseShort(input.nextLine());

        if (n < 1 || n > 100) {

            System.out.println(result.size());
            return;
        }

        result.addAll(convertStringToCharacterSet(input.nextLine()));

        for (short i = 1; i < n; i++)
            result.retainAll(convertStringToCharacterSet(input.nextLine()));

        System.out.println(result.size());
    }

    /**
     * @param string string to convert
     * @return set of characters from given string
     */
    private static Set<Character> convertStringToCharacterSet(String string) {

        Set<Character> result = new HashSet<>();

        for (char letter : string.toCharArray())
            result.add(letter);

        return result;
    }
}
