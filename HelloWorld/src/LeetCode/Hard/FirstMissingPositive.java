package LeetCode.Hard;

/*
* STATUS: DONE
* OPTIMIZED: 20%
*
* Description:
* Given an unsorted array, find the first positive number that is not in the array.
*
* Algorithm must be O(n) in time complexity, O(1) in space complexity.
*
* Link:
* */


import java.util.HashSet;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        if(nums == null || nums.length == 0){
            return 1;
        }
        if(nums.length == 1){
            if(nums[0] == 1){
                return 2;
            }
            return 1;
        }
        HashSet<Integer> set = new HashSet<>();
        int min = 1;
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
//            System.out.println("check: " + set.contains(String.valueOf(nums[i])));
            if(nums[i] == min) {
                min = min + 1;
            }
        }
        if(min == 0){
            return 1;
        }
        while(set.contains(min)){
            min = min + 1;
        }

        return min;
    }
    public static void main(String[] args) {
        FirstMissingPositive f = new FirstMissingPositive();
        System.out.println(f.firstMissingPositive(new int[]{1,2,0}));
        System.out.println(f.firstMissingPositive(new int[]{3,4,-1,1}));
        System.out.println(f.firstMissingPositive(new int[]{7,8,9,11,12}));
    }
}
