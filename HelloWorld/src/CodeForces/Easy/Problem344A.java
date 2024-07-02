package CodeForces.Easy;

import java.util.Scanner;

public class Problem344A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int count = 1;
        for(int a0 = 0; a0 < n; a0++){
            arr[a0] = in.nextInt();
            if(a0 == 0);
            else{
                if(arr[a0]/10 == arr[a0 - 1]%10){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
