package CodeForces.Easy;

import java.util.Scanner;

public class Problem467A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int room = 0;
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            if(y - x >= 2){
                room++;
            }
        }
        System.out.println(room);
    }
}
