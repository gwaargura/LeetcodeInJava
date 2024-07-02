package LeetCode.Medium;

public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if(dividend == 0){
            return 0;
        }
        if(divisor == 1){
            return dividend;
        }
        if(divisor == -1){
            long out = dividend;
            out = -out;
            if(out < Integer.MIN_VALUE){
                out = Integer.MAX_VALUE;
            }else if (out > Integer.MAX_VALUE){
                out = Integer.MAX_VALUE;
            }
            return (int)out;
        }
        boolean negative1 = (dividend < 0 || divisor < 0);
        boolean nagative2 = (divisor < 0 && dividend < 0);

        long d1 = dividend;
        long d2 = divisor;
        d1 = Math.abs(d1);
        d2 = Math.abs(d2);
        long out = 0;
        while(d1 >= d2){
            d1 = d1 - d2;
            out++;
        }
        if(nagative2){
            if(out > Integer.MAX_VALUE){
                out = Integer.MAX_VALUE;
            }
        }else if(negative1 && !nagative2){
            out = -out;
            if(out < Integer.MIN_VALUE){
                out = Integer.MIN_VALUE;
            }
        }
        return (int)out;
    }

    public static void main(String[] args) {
        DivideTwoIntegers d = new DivideTwoIntegers();
        System.out.println(d.divide(2, 2));
        System.out.println(d.divide(8, 2));
        System.out.println(d.divide(8, 3));
        System.out.println(d.divide(10, 3));
        System.out.println(d.divide(-2147483648, -1));
    }
}
