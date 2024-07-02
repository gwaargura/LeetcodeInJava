package LeetCode.Medium;

/*
* STATUS: DONE
* OPTIMIZED: 5%
*
* Find the sum of 3 numbers in given array that is closest to target.
*
* Link: https://leetcode.com/problems/3sum-closest
*
* */

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int total = nums[i] + nums[j] + nums[k];
                    if (total == target) {
                        return total;
                    }
                    int close = Math.abs(target - total);
                    if(close < min) {
                        min = close;
                        sum = total;
                    }
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        ThreeSumClosest t = new ThreeSumClosest();
        System.out.println(t.threeSumClosest(new int[]{-1, 0, 1, 2, -1, -4}, 4));
    }
}
