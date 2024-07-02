package LeetCode.Easy;

public class ConvertSortedArrayToBST {
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

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        if (nums.length == 1) {
            return new TreeNode(nums[0]);
        }
        int mid = nums.length / 2;
        TreeNode root = new TreeNode(nums[mid]);
        TreeNode current = root;
        int left = mid;
        int right = mid;
        while (left > 0) {
            current.left = new TreeNode(nums[left-2]);
            if(current != root){
                current.right = new TreeNode(nums[left-1]);
            }
            if(current.right != null) {
                System.out.println("current: " + current.val +
                        " left: " + current.left.val +
                        " right: " + current.right.val);
            }
            current = current.left;
            left = left - 2;
        }
        current = root;
        while (right < nums.length - 1) {
            current.right = new TreeNode(nums[right+2]);
            if(current != root){
                current.left = new TreeNode(nums[right+1]);
            }
            System.out.println("current: " + current.val +
                    " right: " + current.right.val +
                    " left: " + current.left.val);
            current = current.right;
            right = right + 2;
        }
        return root;
    }

    public static void printBST(TreeNode root) {
        if (root == null) {
            return;
        }
        printBST(root.left);
        System.out.print(root.val + " -> ");
        printBST(root.right);
    }

    public static void main(String[] args) {
        ConvertSortedArrayToBST c = new ConvertSortedArrayToBST();
        int[] nums = {0,1,2,3,4,5};
        TreeNode root = c.sortedArrayToBST(nums);
        System.out.println(root.val);
        printBST(root);

//        int[] nums1 = {1, 3};
//        TreeNode root1 = c.sortedArrayToBST(nums1);
//        System.out.println(root1.val);
    }
}
