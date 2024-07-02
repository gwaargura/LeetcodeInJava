package LeetCode.Easy;

/*
*
* Link: https://leetcode.com/problems/climbing-stairs
* */
public class ClimbingStairs {
    public int climbStairs(int n) {
        if(n == 1) {
            return 1;
        }
        if(n == 2) {
            return 2;
        }
        if(n == 3) {
            return 3;
        }
        int a = 2, b = 3, c;
        for (int i = 3; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        ClimbingStairs cs = new ClimbingStairs();
        System.out.println(cs.climbStairs(4));
        System.out.println(cs.climbStairs(4));
        System.out.println(cs.climbStairs(4));
        System.out.println(cs.climbStairs(4));
    }
}
