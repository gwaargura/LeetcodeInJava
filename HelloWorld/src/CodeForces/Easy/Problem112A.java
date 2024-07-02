package CodeForces.Easy;

import java.util.Scanner;

public class Problem112A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        int n = s.compareToIgnoreCase(t);
        if(n < 0) {
            n = -1;
        }
        else if(n > 0) {
            n = 1;
        }
        System.out.println(n);
    }
}
