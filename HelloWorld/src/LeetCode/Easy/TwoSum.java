package LeetCode.Easy;

/*
* Return index of 2 numbers in given array that is equal to target
*
* */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        TwoSum twoSum = new TwoSum();
        int[] res = twoSum.twoSum(nums, target);
        System.out.println(res[0] + " " + res[1]);
    }
}
