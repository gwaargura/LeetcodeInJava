package CodeForces.Easy;

import java.util.HashMap;
import java.util.Scanner;

public class Problem236A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.putIfAbsent(c, 1);
        }
        int i = map.size();
        if(i % 2 == 0){
            System.out.println("CHAT WITH HER!");
            return;
        }
        System.out.println("IGNORE HIM!");
    }
}
