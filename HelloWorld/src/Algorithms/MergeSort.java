package Algorithms;
/*
* TIME COMPLEXITY:  all O(n*log(n)) ---> REALLY FAST (ALL CASES).
* SPACE COMPLEXITY: O(n) --------------> COSTLY IN MEMORY.
* -------------------------------------> TRADE SPEED AND STABILITY FOR MEMORY.
* UNDERSTANDING:
* THEORY: 100%
* CODE: 100%
*
* */
public class MergeSort {

    /* HOW IT WORKS:
    * Merge sort algorithm will split inputted array into 2 part
    * Recursively until each array only have 1 element left.
    *
    * After that, each sub-array will be compared
    * Smaller values will be added to the bigger array first.
    *
    * After recursion, the array is sorted.
    *
    * */

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
    private static void main(String[] args) {
        int[] arr = {23, 12, 312, 23, 125, 6, 7, 7, 645, 3, 4, 5, 6, 2, 34};
        System.out.println("Before sorting: ");
        printArray(arr);
        mergeSort(arr);
        System.out.println("After sorting: ");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
