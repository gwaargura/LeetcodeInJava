package CodeForces.Easy;

import java.util.Scanner;

public class Problem116A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n*2];
        int min = 0;
        int passengers = 0;
        for(int i = 0; i < arr.length; i = i + 2){
            arr[i] = sc.nextInt();
            arr[i+1] = sc.nextInt();
            passengers -= arr[i];
            passengers += arr[i+1];
            min = Math.max(min, passengers);
        }
        System.out.println(min);
    }
}
