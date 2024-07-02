package LeetCode.Medium;

/*
* STATUS: DONE
* OPTIMIZED: 100%
*
* Description:
*
* Given sorted array, may be rotated
* (choose a pivot, put everything before that point to the end).
*
* Return index of target (-1 if not found)
* Algorithm must be in time-complexity = O(log(n)).
*
* */

public class SearchRotatedSortedArray {
    public int search(int[] nums, int target) {
        if(nums.length == 1){
            return nums[0]==target?0:-1;
        }

        int start = 0, end = nums.length - 1;

        if (nums[start] == target) {
            return start;
        }
        if (nums[end] == target) {
            return end;
        }
        if(nums.length == 2){
            return -1;
        }
        if (nums[start] < nums[end]) {
            return binarySearch(nums, target);
        }

        while (nums[end] > nums[end - 1]) {
//            System.out.println("End: " + end + ", " + nums[end]);
            end--;
            if (target == nums[end]) {
                return end;
            }
        }
        end = end - 1;
//        System.out.println("End: " + end + " | " + nums[end]);
        if (target == nums[end]) {
            return end;
        }
        if(end == start || end == start +1){
            return -1;
        }
        if (target > nums[end]) {
            return -1;
        }
        int[] newNums = new int[end+1];
        System.arraycopy(nums, 0, newNums, 0, end);
        return binarySearch(newNums, target);

    }

    private int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        SearchRotatedSortedArray searchRotatedSortedArray = new SearchRotatedSortedArray();

        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(searchRotatedSortedArray.search(nums, 0));
        int[] nums1 = {1};
        System.out.println(searchRotatedSortedArray.search(nums1, 0));

        int[] nums2 = {4,5,6,7,0,1,24,5,6,7,0,1,2};
        System.out.println(searchRotatedSortedArray.search(nums2, 0));

        int[] nums3 = {5,1,3};
        System.out.println(searchRotatedSortedArray.search(nums3, 0));
    }
}
