package LeetCode.Easy;

public class HappyNumber {
    public boolean isHappy(int n) {

        if (n == 1) {
            return true;
        }

        int sum = 0;

        while (n > 0) {
            sum += Math.pow(n % 10, 2);
            n /= 10;
        }
        return isHappy(sum);
    }

    public static void main(String[] args) {
        HappyNumber h = new HappyNumber();
        System.out.println(h.isHappy(1));
        System.out.println(h.isHappy(19));
    }
}

