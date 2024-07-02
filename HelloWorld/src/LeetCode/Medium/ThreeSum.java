package LeetCode.Medium;

/*
* STATUS: DONE
* OPTIMIZED: 61%
*
* Description:
* Find all sub-arrays that have sum of 3 elements = 0.
*
* Link: https://leetcode.com/problems/3sum
*
* */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums); // Sort the array to use two-pointer technique

        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) { // Skip duplicates
                int low = i + 1, high = nums.length - 1;
                int target = -nums[i];

                while (low < high) {
                    int sum = nums[low] + nums[high];

                    if (sum == target) {
                        res.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        while (low < high && nums[low] == nums[low + 1]) low++; // Skip duplicates
                        while (low < high && nums[high] == nums[high - 1]) high--; // Skip duplicates
                        low++;
                        high--;
                    } else if (sum < target) {
                        low++;
                    } else {
                        high--;
                    }
                }
            }
        }

        return res;
    }



    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        System.out.println(threeSum.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));

    }
}
