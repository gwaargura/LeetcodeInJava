package LeetCode.Medium;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0) return 0;
        if(height.length == 1) return height[0];
        if(height.length == 2) return Math.min(height[0], height[1]);
        int left = 0,right = height.length-1;
        int maxLeft = 0;
        int maxRight = 0;
        int maxArea = 0;
        while (left <= right) {
            int temp = Math.min(height[left], height[right]);
//            System.out.println("left = " + height[left] + ", right = " + height[right]);
//            System.out.println("temp = " + temp);
            maxArea = Math.max(maxArea, temp * (right - left));
//            System.out.println("maxArea = " + maxArea + ", " + temp + ", " + right + ", " + left);
            if(height[left] <= height[right]) {
                left ++;
            }
            else if (height[left] > height[right]) {
                right--;
            }
        }
        return maxArea;
    }


    public static void main(String[] args) {
        ContainerWithMostWater cw = new ContainerWithMostWater();
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(cw.maxArea(height));

        int[] height1 = new int[]{1,1};
//        System.out.println(cw.maxArea(height1));

        int[] height2 = new int[]{4,3,2,1,4};
//        System.out.println(cw.maxArea(height2));
    }
}
