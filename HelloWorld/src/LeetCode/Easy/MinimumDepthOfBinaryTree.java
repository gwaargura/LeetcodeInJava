package LeetCode.Easy;

public class MinimumDepthOfBinaryTree {
    public static class TreeNode {
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
    public int minDepth(TreeNode root) {
        return a(root, 1);
    }
    public int a(TreeNode root, int depth) {
        if (root == null){
            return depth;
        }
        if(root.left == null && root.right == null){
            return depth;
        }
        int left = a(root.left, depth + 1);
        int right = a(root.right, depth + 1);
        if (left == 1) {
            return right;
        }
        else if (right == 1) {
            return left;
        }
        return Math.min(left, right) ;
    }

    public static void main(String[] args) {
        MinimumDepthOfBinaryTree tree = new MinimumDepthOfBinaryTree();
        MinimumDepthOfBinaryTree.TreeNode n1 = new MinimumDepthOfBinaryTree.TreeNode(3);
        MinimumDepthOfBinaryTree.TreeNode n2 = new MinimumDepthOfBinaryTree.TreeNode(9);
        MinimumDepthOfBinaryTree.TreeNode n3 = new MinimumDepthOfBinaryTree.TreeNode(20);
        MinimumDepthOfBinaryTree.TreeNode n4 = new MinimumDepthOfBinaryTree.TreeNode(15);
        MinimumDepthOfBinaryTree.TreeNode n5 = new MinimumDepthOfBinaryTree.TreeNode(7);

        n1.left = n2;
        n1.right = n3;
        n3.left = n4;
        n3.right = n5;
        System.out.println(tree.minDepth(n1));

        MinimumDepthOfBinaryTree.TreeNode n6 = new MinimumDepthOfBinaryTree.TreeNode(2);
        MinimumDepthOfBinaryTree.TreeNode n7 = new MinimumDepthOfBinaryTree.TreeNode(3);
        MinimumDepthOfBinaryTree.TreeNode n8 = new MinimumDepthOfBinaryTree.TreeNode(4);
        MinimumDepthOfBinaryTree.TreeNode n9 = new MinimumDepthOfBinaryTree.TreeNode(5);
        MinimumDepthOfBinaryTree.TreeNode n10 = new MinimumDepthOfBinaryTree.TreeNode(6);

        n6.right = n7;
        n7.right = n8;
        n8.right = n9;
        n9.right = n10;
        System.out.println(tree.minDepth(n6));
    }
}
