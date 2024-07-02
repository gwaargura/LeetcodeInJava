package CodeForces.Easy;

import java.util.Scanner;

public class Problem59A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int low = 0;
        int up = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            if(low(s.charAt(i))) {
                low++;
            }
            else{
                up++;
            }
        }
        if(low >= up) {
            s = s.toLowerCase();
        }
        else{
            s = s.toUpperCase();
        }
        System.out.println(s);
    }
    public static boolean low(char c) {
        if((int)c >= 97 && c <= 122) {
            return true;
        }
        return false;
    }
}
