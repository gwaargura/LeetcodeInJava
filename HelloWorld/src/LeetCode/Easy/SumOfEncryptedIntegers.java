package LeetCode.Easy;

/*
*
* Link: https://leetcode.com/problems/find-the-sum-of-encrypted-integers
*
* */

public class SumOfEncryptedIntegers {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for(int i : nums){
            sum += encrypt(i);
        }
        return sum;
    }

    public int encrypt(int x){
        int max = 0;
        int count = 0;
        int plus = 1;
        while(x > 0){
            count = count + plus;
            plus = plus * 10;
            max = Math.max(max, x % 10);
            x = x / 10;
        }
        return max*count;
    }

    public static void main(String[] args) {
        SumOfEncryptedIntegers s = new SumOfEncryptedIntegers();
        System.out.println(s.encrypt(123));
    }
}
