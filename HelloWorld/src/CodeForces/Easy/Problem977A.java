package CodeForces.Easy;

import java.util.Scanner;

public class Problem977A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        while(m > 0){
            if (n % 10 == 0) {
                n = n/10;
            }
            else{
                n = n-1;
            }
            m--;
        }
        System.out.println(n);
    }
}
