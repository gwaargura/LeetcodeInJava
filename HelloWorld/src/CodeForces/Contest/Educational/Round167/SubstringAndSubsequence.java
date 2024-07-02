package CodeForces.Contest.Educational.Round167;

import java.util.Scanner;

public class SubstringAndSubsequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            String t = sc.next();
            System.out.println(getLength(s, t));
        }

    }

    public static int getLength(String s, String t) {
        int n = 0;
        int start = 0;
        int max = 0;
        for (int i = 0; i < t.length(); i++) {
            int track = i;
            for(int j = start; j < s.length(); j++) {
                if(t.charAt(track) == s.charAt(j)) {
//                    System.out.println("t: [" + track + "] " + t.charAt(track) + ", [" + j + "] " + s.charAt(j));
                    n++;
                    track++;
                    if(track == t.length()) {
                        break;
                    }
                }
            }
            max = Math.max(max, n);
            n = 0;
        }
        return s.length() + t.length() - max;
    }
}
