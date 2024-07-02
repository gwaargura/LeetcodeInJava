package Algorithms;

import java.util.Random;

/*
* SPACE COMPLEXITY: O(log(n)) -----------> KEEP AN EYE TO THE MEMORY OR THE STACK WILL OVERFLOW.
* TIME COMPLEXITY: average (n*log(n)) ---> FAST.
* ---------------------------------------> COMPLICATED BUT EFFICIENT.
* UNDERSTANDINGS:
* THEORY: 100%
* CODE: 85%
*/
public class Quicksort {

    /* HOW IT WORKS:
    * The array that you want to sort is passed into quickSort()
    * A pivot is chosen (in this example: last index of array)
    *
    * Basically the pivot will be the center of each execution of the function.
    * All value that is smaller than the pivot is set to the left of the pivot.
    * All value that is larger than the pivot is set to the right of the pivot.
    *
    * left goes from the left to the right, stop when detects a value that is larger than the pivot
    * right does the same but backwards
    * Then 2 value at left & right swap.
    *
    * At the end (left and right is at the same spot)
    * Swap the value of that index to the pivot
    * Now the index of the pivot is left (also right)
    *
    * low - high: the range of the sub-array that after your pivot is sorted into place
    *
    * As the first time executed: low = 0, high = last index of array
    * After that, low will be low, high will be left - 1 for the sub-array on the left of the pivot
    * low will be left + 1, high will be high for the sub-array on the right of the pivot
    * */
    private static void quickSort( int[] array, int low, int high){
        if(low >= high){
            return;
        }
        //CHOOSE A RANDOM INDEX --> BETTER PERFORMANCE
        int pivotIndex = new Random().nextInt(high - low) + low;
        int pivot = array[pivotIndex];
        swap(array, pivotIndex, high);

        //int pivot = array[high];

        int left = low;
        int right = high;
        while(left < right){
            while(array[left] <= pivot && left < right){
                left = left + 1;
            }
            while(array[right] >= pivot && left < right){
                right = right - 1;
            }

            //CAN SWAP NORMALLY, NOT BY ANOTHER FUNCTION
            swap(array, left, right);
        }
        swap(array, left, high);
        quickSort(array, low, left - 1);
        quickSort(array, left + 1, high);
    }

    private static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void main(String[] args) {
        int[] arr = { 4,12,54,21,2,4,9,51,1,5,14};

        System.out.println("Before Quicksort");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        quickSort(arr,0, arr.length-1);
        System.out.println("\nAfter Quicksort");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
