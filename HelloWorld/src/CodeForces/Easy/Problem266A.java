package CodeForces.Easy;

import java.util.Scanner;

public class Problem266A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i) == s.charAt(i+1)) {
                s = s.substring(0, i+1) + s.substring(i+2);
                count++;
                i--;
            }
        }
        System.out.println(count);
    }
}
