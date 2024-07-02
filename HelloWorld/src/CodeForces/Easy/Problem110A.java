package CodeForces.Easy;

import java.util.Scanner;

public class Problem110A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        int count = 0;
        int i = n.length() - 1;
        while(i >= 0) {
            int a = Integer.parseInt(n.charAt(i) + "");
            if(a % 10 == 4 || a % 10 == 7) {
                count++;
            }
            i--;
        }
        if(count == 4 || count == 7) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}
