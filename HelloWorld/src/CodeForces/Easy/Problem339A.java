package CodeForces.Easy;

import java.util.Random;
import java.util.Scanner;

public class Problem339A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] chars = s.replace("+","").toCharArray();
        int [] arr = new int[chars.length];
        for(int i = 0; i<chars.length; i++){
            arr[i] = Character.getNumericValue(chars[i]);
        }
        quickSort(arr, 0, arr.length-1);
        s = "";
        for(int i = 0; i<arr.length; i++){
            if(i == arr.length-1){
                s += arr[i];
                break;
            }
            s = s + arr[i] + "+";
        }
        System.out.println(s);
    }
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
}
