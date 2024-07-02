package LeetCode.Medium;

/*
* STATUS: NOT DONE
*
*
*
*
* */


import java.time.Duration;
import java.time.LocalDateTime;

public class SubArrayAndLimit {
    public int longestSubarray(int[] nums, int limit) {
        LocalDateTime now = LocalDateTime.now();

        int maxLength = 1;

        int min = Integer.MAX_VALUE;
        int max = -1;

        for(int i = 0; i < nums.length; i++) {
            System.out.println("Base: = " + nums[i]);
            for(int j = i+ 1; j < nums.length; j++) {
                if(nums[j] <= min){
                    min = nums[j];
                }
                if(nums[j] >= max){
                    max = nums[j];
                }
                System.out.println("Max = " + max + ", min = " + min);
                System.out.println("Next: = " + nums[j]);
                if(Math.abs(nums[i] - nums[j]) <= limit) {
                    maxLength = Math.max(maxLength, j-i+1);
                    System.out.println("Max length: " + maxLength + ", length: " + (j-i+1));
                }
                else if(max - min > limit){
                    maxLength = maxLength - 1;
                    System.out.println("--------Break! ---");
                    min = Integer.MAX_VALUE;
                    max = -1;
                    break;
                }
                else{
                    maxLength = maxLength - 1;
                    System.out.println("Break!");
                    min = Integer.MAX_VALUE;
                    max = -1;
                    break;
                }
            }
        }

        LocalDateTime end = LocalDateTime.now();
        Duration duration = Duration.between(now, end);
        System.out.println("Time executed: " + duration.toMillis() + " ms");
        return maxLength;
    }

    public static void main(String[] args) {
        SubArrayAndLimit s = new SubArrayAndLimit();
        int[] nums = {8,2,4,7};
//        System.out.println("Limit: 4 -- Expected: 2 -- Result: " + s.longestSubarray(nums, 4));

        int[] nums1 = {1,5,6,7,8,10,6,5,6};
        System.out.println("Limit: 4 -- Expected: 5 -- Result: " + s.longestSubarray(nums1, 4));
    }
}
