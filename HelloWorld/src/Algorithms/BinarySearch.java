package Algorithms;

/*
*
*
*
* UNDERSTANDING:
* THEORY: 100%
* CODE: 100%
* */
public class BinarySearch {

    /* HOW IT WORKS:
    *
    * MAKE SURE THE ARRAY IS SORTED!!!
    *
    * Choose a number you want to check if it exists in the array
    * The function will return the index of that number if exist
    * Else return -1
    *
    * Choose the middle value of the array
    * If that value is equal to the chosen one
    * Return index
    *
    * If that value is larger -> Do it again for the right side sub-array
    * The same for smaller.
    * Return index
    *
    * */

    private static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if(arr[mid] < key) {
                low = mid + 1;
            } else{
                high = mid - 1;
            }
        }
        return -1;
    }

    private static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(arr, 9));

    }
}
