package CodeForces.Easy;

import java.util.Scanner;

public class Problem546A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int a = 0;
        for(int i = 1; i <= k; i++){
            a = a + i*n;
        }
        if(a > m){
            System.out.println(a-m);
            return;
        }
        System.out.println(0);
    }
}
