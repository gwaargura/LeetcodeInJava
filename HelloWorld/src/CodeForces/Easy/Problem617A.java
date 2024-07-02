package CodeForces.Easy;

import java.util.Scanner;

public class Problem617A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 0;
        int count = 1;
        while(m < n){
            m = m + 5;
            if(m < n){
                count++;
            }
        }
        System.out.println(count);
    }
}
