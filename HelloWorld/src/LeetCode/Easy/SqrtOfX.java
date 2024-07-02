package LeetCode.Easy;

/*
*
* How it works:
* Increasing integers have square in crease by 2+(prev) each time
* Example: 1^2 = 1; 2^2 = 1^1 + (1+2), 3^2 = 2^2 + (3+2), 4^2 = 3^2 + (5+2), ....
* so, we have the base: squared = 4 (2^2) or 1 if you'd like, and base: plus = 5 (because after 4 is 9 (9-5=4))
* then with each number increasing by 1 (which is index i in the loop), plus will + 2 and squared will + plus
* then compare.
*
* Link: https://leetcode.com/problems/sqrtx
*
* */

public class SqrtOfX {
    public int mySqrt(int x) {

        if(x == 0 || x == 1) return x;
        if(x == 2) return 1;

        int squared = 4;
        int plus = 5;

        for (int i = 2; i <= x/2 + 1 ; i++) {
            if(i > 46340){
                return 46340;
            }
            if (x < squared) {
                return i-1;
            }
            else if (x == squared) {
                return i;
            }
//            System.out.println("Index = " + i);
//            System.out.println("Squared = " + squared);
            squared += plus;
//            System.out.println("plus = " + plus);
            plus += 2;
        }

        return x;
    }

    public static void main(String[] args) {
        SqrtOfX sqrtOfX = new SqrtOfX();
//        System.out.println(sqrtOfX.mySqrt(8));
//        System.out.println("-----------------------");
//        System.out.println(sqrtOfX.mySqrt(4));
//        System.out.println("-----------------------");
//        System.out.println(sqrtOfX.mySqrt(2));
//        System.out.println("-----------------------");
//        System.out.println(sqrtOfX.mySqrt(3));
//        System.out.println("-----------------------");
//        System.out.println(sqrtOfX.mySqrt(2147395600));
//        System.out.println("-----------------------");

        System.out.println(sqrtOfX.mySqrt(2147483647));
        System.out.println("-----------------------");

    }
}
