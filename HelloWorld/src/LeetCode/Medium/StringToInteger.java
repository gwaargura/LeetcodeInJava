package LeetCode.Medium;


/*
 * STATUS: NOT DONE
 * OPTIMIZED: 5%
 * DIFFICULTY: MEDIUM
 *
 * DESCRIPTION:
 * Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.
 *
 * The algorithm for myAtoi(string s) is as follows:
 *
 * Whitespace: Ignore any leading whitespace (" ").
 *
 * Signedness: Determine the sign by checking if the next character is '-' or '+',
 * assuming positivity is neither present.
 *
 * Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered
 * or the end of the string is reached. If no digits were read, then the result is 0.
 *
 * Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1],
 * then round the integer to remain in the range. Specifically,
 * integers less than -231 should be rounded to -231,
 * and integers greater than 231 - 1 should be rounded to 231 - 1.
 *
 * Return the integer as the final result.
 *
 * Link: https://leetcode.com/problems/string-to-integer-atoi
 */


import java.math.BigInteger;

public class StringToInteger {
    public static int myAtoi(String s) {

        //REMOVE LEADING WHITE SPACE
        s = s.trim();

        //MAKE SURE IT'S NOT BLANK
        if (s.isBlank()) {
            return 0;
        }
        //MAKE SURE IT'S IN THE RIGHT FORMAT
        if (!s.matches("^[-,+]?\\d+.*$")) {
            return 0;
        }

        //IF IT IS ONLY NUMBERS
        if (s.matches("^[-,+]?\\d+$")) {
            return validate(s);
        }
        while (s.startsWith("0")) {
            s = s.substring(1);
        }

        String a = "0";
        for (int i = s.length(); i >= 0; i--) {
            a = s.substring(0, i);
            if (a.matches("^[-,+]?\\d+$")) {
                break;
            }
        }
        return validate(a);
    }

    public static int validate(String s) {
        s = s.trim();
        int output = 0;
        try {
        BigInteger i = new BigInteger(s);
        if (i.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) > 0) {
            output = Integer.MAX_VALUE;
        } else if (i.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) < 0) {
            output = Integer.MIN_VALUE;
        } else {
            output = i.intValue();
        }
        return output;
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("    +0a32"));
        System.out.println(myAtoi(" 12312a123"));
        System.out.println(myAtoi(" 1231211111111111111111111111111111111111111"));
        System.out.println(myAtoi("  0000000000012345678"));
    }
}
