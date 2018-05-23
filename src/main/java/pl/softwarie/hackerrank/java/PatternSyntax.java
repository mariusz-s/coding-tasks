package pl.softwarie.hackerrank.java;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Description:  https://www.hackerrank.com/challenges/pattern-syntax-checker
 */
public class PatternSyntax {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            try {
                Pattern.compile(in.nextLine());
                System.out.println("Valid");
            } catch (PatternSyntaxException exc) {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}
