package LeetCode.Medium;

/*
*
* Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
* */

public class FirstAndLastPosInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int index1 = -1;
        int index2 = -1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                index1 = i;
                index2 = i;
                for(int j = i+1; j < nums.length; j++) {
                    if(nums[j] == target) {
                        index2 = j;
                    }
                    else{
                        return new int[]{index1, index2};
                    }
                }
                return new int[]{index1, index2};
            }
        }
        return new int[]{index1, index2};
    }
    public static void main(String[] args) {
        FirstAndLastPosInSortedArray first = new FirstAndLastPosInSortedArray();
        int[] nums = {1,3,5,6};
        int target = 6;
        System.out.println(first.searchRange(nums, target)[0] + " - " + first.searchRange(nums, target)[1]);
    }

}
