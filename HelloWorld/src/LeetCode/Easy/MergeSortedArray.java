package LeetCode.Easy;

/*
*
* Link: https://leetcode.com/problems/merge-sorted-array
*
* */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        System.arraycopy(nums2, 0, nums1, m-n, n);
        if(nums2.length == 0) return;

        for(int i = m; i < m+n; i++){
            nums1[i] = nums2[i-m];
        }
        mergeSort(nums1);
        for(int a : nums1) {
            System.out.print(a + " ");
        }
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

    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        mergeSortedArray.merge(nums1, 3, nums2, 3);
        System.out.println();
        int[] nums3 = {1, 0};
        int[] nums4 = {2};
        mergeSortedArray.merge(nums3, 1, nums4, 1);
    }
}
