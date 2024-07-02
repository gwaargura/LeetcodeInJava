package CodeForces.Easy;

import java.util.Scanner;

public class Problem41A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String t = in.nextLine();
        int low = 0;
        int high = t.length() - 1;
        while(low < s.length() && high >= 0) {
            if(s.charAt(low) != t.charAt(high)) {
                System.out.println("NO");
                return;
            }
            low++;
            high--;
        }
        System.out.println("YES");
    }
}
