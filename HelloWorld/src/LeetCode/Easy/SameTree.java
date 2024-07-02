package LeetCode.Easy;

/*
*
* Link: https://leetcode.com/problems/same-tree
*
* */


public class SameTree {
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

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            System.out.println("1");
            return true;
        }
        if(p != null && q == null) {
            System.out.println("2");
            return false;
        }
        if(p == null && q != null) {
            System.out.println("3");
            return false;
        }
        System.out.println("p: " + p.val + ", q: " + q.val);
        if (p.val == q.val) {
            System.out.println("4");
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        System.out.println("5");
        return false;
    }

    public static void main(String[] args) {
        TreeNode n1 = new  TreeNode(1, null, null);
        TreeNode n2 = new  TreeNode(2, null, null);
        TreeNode n3 = new  TreeNode(3, null, null);

        n1.left = n2;
        n1.right = n3;

        TreeNode n4 = new  TreeNode(1, null, null);
        TreeNode n5 = new  TreeNode(2, null, null);
        TreeNode n6 = new  TreeNode(3, null, null);

        n4.left = n5;
        n4.right = n6;

        System.out.println(isSameTree(n1, n4));

    }
}
