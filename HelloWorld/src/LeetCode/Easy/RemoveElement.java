package LeetCode.Easy;
/*
*
* Remove all values = target in given array
*
* Link: https://leetcode.com/problems/remove-element
*
* */

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int end = nums.length - 1;
        for(int i = 0; i <= end; i++) {
            if(nums[i] == val) {
                if(nums[i] != nums[end]) {
//                    System.out.println("Number is " + nums[i] + " and value is " + nums[end]);
                    int temp = nums[i];
                    nums[i] = nums[end];
                    nums[end] = temp;
                }
                else{
                    i--;
                }
                end--;
            }
        }
//        for(int i = 0; i < nums.length; i++) {
//            System.out.print(nums[i] + " -> ");
//        }
        System.out.println();
        return end+1;
    }
    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        System.out.println(removeElement.removeElement(new int[]{1,2,2,3}, 3));
        System.out.println(removeElement.removeElement(new int[]{1,2,2,3,1,2,3,4,5}, 3));
        System.out.println(removeElement.removeElement(new int[]{1,2,2,3,4,4,2,3,2}, 2));
        System.out.println(removeElement.removeElement(new int[]{1,2,2,3,1,1,22,1,1}, 1));
    }
}
