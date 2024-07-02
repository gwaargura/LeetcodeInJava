package LeetCode.Easy;

/*
*
* Link: https://leetcode.com/problems/plus-one
* */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        digits[digits.length - 1] += 1;
        if(digits[digits.length - 1] > 9) {
            digits[digits.length - 1] = 0;
            carry = 1;
        }
        for(int i = digits.length - 2; i >= 0; i--) {
            digits[i] = digits[i] + carry;
            carry = 0;
            if(digits[i] > 9) {
                digits[i] = 0;
                carry = 1;
            }
        }
        if(carry == 1) {
            int[] digits1 = new int[digits.length + 1];
            digits1[0] = 1;
            System.arraycopy(digits1, 0, digits, 1, digits.length - 1);
            return digits1;
        }
        return digits;
    }
}
