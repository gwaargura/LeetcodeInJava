package LeetCode.Easy;

/*
*
* Link: https://leetcode.com/problems/maximum-depth-of-binary-tree
*
* */

public class MaximumDepthOfBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public int maxDepth(TreeNode root) {
        return getHeight_private(root, 0);
    }
    private int getHeight_private(TreeNode current, int value){
        if(current == null){
            return value;
        }
        int left = getHeight_private(current.left, value + 1);
        int right = getHeight_private(current.right, value + 1);
        return Math.max(left, right);
    }
}
