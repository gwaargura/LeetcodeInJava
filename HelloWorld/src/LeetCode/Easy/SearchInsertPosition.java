package LeetCode.Easy;

/*
*
* Link: https://leetcode.com/problems/search-insert-position
*
* */

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if (target < nums[0]) {
            return 0;
        }
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                left = mid + 1;

            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int[] nums = {1, 3, 5, 6};
        System.out.println(searchInsertPosition.searchInsert(nums, 3));
    }
}
