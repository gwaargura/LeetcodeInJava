package LeetCode.Medium;

/*
* STATUS: DONE
* OPTIMIZED: 74%
*
* Description: Given integer x, reverse it, of larger than int then return 0
*
* Link: https://leetcode.com/problems/reverse-integer
*
* */



public class ReverseInteger {
    public static int reverse(int x) {
        try {
            int rev = 0;
            while(x != 0) {
                rev = Math.addExact(Math.multiplyExact(rev ,10), x % 10) ;
                x = x/10;
            }
            return rev;
        } catch (Exception e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(reverse(-123));
        System.out.println(reverse(1534236469));
    }
}
