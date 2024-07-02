package LeetCode.Hard;


/*
* STATUS: DONE
* OPTIMIZED: 6%
*
* Code explanation:
*
* Taking values from 2 ends.
*
* If 1 is bigger than the other, the other moves inward.
* The moving end keeps track of the maximum value.
*
* Let's say if left is moving inward, then the new maximum value is bigger than the right side,
* right end moves inward, left stays still.
*
* Keep updating water level with the maximum value - the value that left or right comes across
* that is not maximum.
*
* Link: https://leetcode.com/problems/trapping-rain-water
*
*
* */
public class TrappingRainWater {


    public void print(int[] height) {
        for (int i = 0; i < height.length; i++) {
            System.out.print(height[i] + " ");
        }
        System.out.println();
    }

    public int trap(int[] height) {
        if (height.length < 2) {
            return 0;
        }

        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                    System.out.println("Left: " + leftMax);
                } else {
                    water += leftMax - height[left];
                    System.out.println("Water: " + water + " , height: " + height[left]);
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                    System.out.println("Right: " + rightMax);
                } else {
                    water += rightMax - height[right];
                    System.out.println("Water: " + water + " , height: " + height[right]);
                }
                right--;
            }
        }

        return water;
    }

    public static void main(String[] args) {
        TrappingRainWater t = new TrappingRainWater();
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
//        System.out.println(height.length);
//        System.out.println("Expected: 6 - Result: " + t.trap(height));
//        System.out.println();
        int[] height1 = {4, 2, 0, 3, 2, 5};
        System.out.println("Expected: 9 - Result: " + t.trap(height1));

        int[] height2 = {5,5,1,7,1,1,5,2,7,6};
//        System.out.println("Expected: 23 - Result: " + t.trap(height2));
    }

}
