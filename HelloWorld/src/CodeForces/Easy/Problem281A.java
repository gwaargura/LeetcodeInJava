package CodeForces.Easy;

import java.util.Scanner;

public class Problem281A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        s = s.substring(0, 1).toUpperCase() + s.substring(1);
        System.out.println(s);
    }
}
