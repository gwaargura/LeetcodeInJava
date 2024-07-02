package CodeForces.Easy;

import java.util.HashMap;
import java.util.Scanner;

public class Problem271A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n++;
        while(!beautifulNumber(n)){
            n = n+1;
        }
        System.out.println(n);
    }

    public static boolean beautifulNumber(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        while (n > 0) {
            int temp = n % 10;
            if (map.containsKey(temp)) {
                return false;
            }
            map.put(temp, 1);
            n = n / 10;
        }
        return true;
    }
}
