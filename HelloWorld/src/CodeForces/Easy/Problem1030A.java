package CodeForces.Easy;

import java.util.Scanner;

public class Problem1030A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            int a = in.nextInt();
            if(a == 1){
                System.out.println("HARD");
                return;
            }
        }
        System.out.println("EASY");
    }
}
