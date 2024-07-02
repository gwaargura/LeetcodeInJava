package LeetCode.Medium;

/*
* STATUS: DONE
* OPTIMIZED: NONE
*
*
* */
public class Pow {
    public double myPow(double x, int n) {
        if(n==0) return 1;
        if(n==1) return x;
        if(x == 0.0) return 0;
        return (double)Math.pow(x, n);
    }

    public static void main(String[] args) {
        Pow p = new Pow();
        System.out.println(p.myPow(10, 3));
    }
}
