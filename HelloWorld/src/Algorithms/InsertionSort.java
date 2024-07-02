package Algorithms;
/*
* SPACE COMPLEXITY : O(1) -----> GOOD.
* TIME COMPLEXITY: average O(n^2) ---> BAD.
* ----------------------------> OK FOR SMALL DATASET.
* UNDERSTANDINGS:
* THEORY: 100%
* CODE: 90%
* */
public class InsertionSort {

    private static void insertionSort(int[] a){
        for(int i = 1; i < a.length; i++){
            //START WITH i = 1 BECAUSE 0th IS ASSUMED TO BE SORTED
            //KEY IS THE VALUE THAT BEING SORTED
            int key = a[i];

            //THE VALUE BEFORE THE KEY
            int j = i - 1;

            //IF IT FINDS A BIGGER VALUE THAN KEY OR IS AT THE START OF THE ARRAY
            while(j >= 0 && a[j] > key){
                //GET THE BIGGER VALUE TO THE RIGHT
                //THE SMALLER VALUE WILL BE ADDED LATER (LINE 30)
                a[j+1] = a[j];

                //KEEP GOING TILL A BIGGER NUMBER OR THE START OF THE ARRAY IS REACHED
                j = j - 1;
            }
            //ADD BACK THE SMALLER VALUE WHEN SHIFTING THE BIGGER NUMBER TO THE RIGHT
            a[j+1] = key;
            }
        }


    private static void main(String[] args) {
        int [] array = {4,1,35,5,213,123,21,1,3,6};
        System.out.println("Unsorted Array : ");
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        insertionSort(array);
        System.out.println("\nSorted Array : ");
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }

    }
}
