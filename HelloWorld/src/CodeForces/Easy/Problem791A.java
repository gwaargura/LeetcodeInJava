package CodeForces.Easy;

import java.util.Scanner;

public class Problem791A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        while(n <= m){
            m = m*2;
            n = n*3;
            count++;
        }
        System.out.println(count);
    }
}
