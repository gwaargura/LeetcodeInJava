package LeetCode.Easy;


/*
*
* Remove all duplicates from given sorted array
*
* Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array
*
* */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        int index = 1;
        int value = nums[0];
        int[]nums1 = new int[nums.length];
        nums1[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != value) {
                nums1[index++] = nums[i];
                value = nums[i];
            }
        }
        System.arraycopy(nums1, 0, nums, 0, index);
        return index;
    }
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray r = new RemoveDuplicatesFromSortedArray();
        System.out.println(r.removeDuplicates(new int[]{1,2}));
    }
}
