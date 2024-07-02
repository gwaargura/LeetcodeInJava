package LeetCode.Hard;

/*
* STATUS: DONE
* OPTIMIZED: 63%
* DESCRIPTION:
* Given 2 sorted arrays, merge, sort and return the mean value of the merged array.
*
* Link: https://leetcode.com/problems/median-of-two-sorted-arrays
*
* */


public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays1(int[] nums1, int[] nums2) {
        int i = 0, j = 0, k = 0;
        int[] nums = new int[nums1.length + nums2.length];

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                nums[k++] = nums1[i++];
                printArray(nums);
            } else {
                nums[k++] = nums2[j++];
                printArray(nums);
            }
        }
        if (i < nums1.length) {
            System.arraycopy(nums1, i, nums, k, nums1.length - i);
        }
        if (j < nums2.length) {
            System.arraycopy(nums2, j, nums, k, nums2.length - j);
        }

        if(nums.length % 2 == 0){
            return nums[nums.length / 2];
        } else if (nums.length % 2 == 1) {
            return (double)(nums[nums.length / 2] + nums[nums.length / 2 - 1]) / 2;
        }
        return 0;
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, nums, 0, nums1.length);
        System.arraycopy(nums2, 0, nums, nums1.length, nums2.length);
        mergeSort(nums);
        int length = nums.length;
        if (length % 2 == 1) {
            return (nums[length / 2 ]);
        }
        if(length % 2 == 0) {
            printArray(nums);
            System.out.println(nums[length / 2] + " - " + nums[length / 2 - 1]);
            return (double) (nums[length / 2] + nums[(length / 2) + 1]) /2;
        }
        return 0;
    }
    private static void mergeSort(int[] arr) {
        int arrLength = arr.length;
        if (arrLength < 2) {
            return;
        }
        int mid = arrLength / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }
        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }

    private static void merge(int[] arr, int[] leftArray, int[] rightArray) {
        int left = leftArray.length;
        int right = rightArray.length;

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left && j < right) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i = i + 1;
            }
            else{
                arr[k] = rightArray[j];
                j = j + 1;
            }
            k = k + 1;
        }
        while (i < left) {
            arr[k] = leftArray[i];
            i = i + 1;
            k = k + 1;
        }
        while (j < right) {
            arr[k] = rightArray[j];
            j = j + 1;
            k = k + 1;
        }
    }
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MedianOfTwoSortedArrays obj = new MedianOfTwoSortedArrays();
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {4,5,1,2};
        System.out.println(obj.findMedianSortedArrays(nums1, nums2));

        int[] nums3 = {1,2};
        int[] nums4 = {3,4};
        System.out.println(obj.findMedianSortedArrays1(nums3, nums4));
    }
}
