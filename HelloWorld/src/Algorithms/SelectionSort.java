package Algorithms;
/*
* TIME COMPLEXITY: all O(n^2) ---> SLOW
* SPACE COMPLEXITY: O(1) --------> SMALL
* -------------------------------> EASY ALGORITHM
* UNDERSTANDING:
* THEORY: 100%
* CODE: 100%
*
* */

public class SelectionSort {

    /*
    * HOW IT WORKS:
    * Choose the first number in the array
    * Go through the whole array to find the smallest value
    * Remember that smallest value's index
    *
    * Swap the chosen number with that smallest
    * Now the smallest number is at the start of the array
    * We can ignore it as it is in the right position
    *
    * Loop
    * */
    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            int j = i + 1;
            while (j < arr.length) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
                j = j + 1;
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    private static void main(String[] args) {
        int[] arr = {1,414,23,4,12,51,3,67,2};
        System.out.println("Before Sorting: ");
        printArray(arr);
        selectionSort(arr);
        System.out.println("After Sorting: ");
        printArray(arr);
    }
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
