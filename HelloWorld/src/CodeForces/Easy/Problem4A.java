package CodeForces.Easy;

import java.util.Scanner;

public class Problem4A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n % 2 == 0 && n > 2) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}
