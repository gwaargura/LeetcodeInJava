package CodeForces.Easy;

import java.util.Scanner;

public class Problem734A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int d = 0;
        int a = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'A') {
                a++;
            }
            else if(s.charAt(i) == 'D') {
                d++;
            }
        }
        if(d == a) {
            System.out.println("Friendship");
            return;
        }
        if(a > d){
            System.out.println("Anton");
            return;
        }
        System.out.println("Danik");
    }
}
