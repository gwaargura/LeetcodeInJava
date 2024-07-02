package LeetCode.Medium;

public class RotateFunction {
    public int maxRotateFunction(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += j * nums[(j + i) % n];
            }
            max = Math.max(max, sum);
        }

        return max;
    }

    public static void main(String[] args) {
        RotateFunction rf = new RotateFunction();
        System.out.println(rf.maxRotateFunction(new int[]{1,2,3,4,5}));
    }

}
