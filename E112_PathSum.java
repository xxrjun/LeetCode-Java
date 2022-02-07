import com.sun.source.tree.Tree;

import java.time.temporal.Temporal;

public class E112_PathSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5,
                new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null),
                new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(1))));
        System.out.println(hasPathSum(root, 22));
    }
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        return helper(root, 0, targetSum);
    }
    public static boolean helper(TreeNode root, int curSum, int targetSum){
        if(root == null) return false;

        System.out.println(root.val + " ");

        curSum += root.val;
        boolean left = helper(root.left , curSum, targetSum);
        boolean right = helper(root.right, curSum, targetSum);
        System.out.println("l: " + left + " r: " + right);
        if(root.left == null && root.right == null && curSum == targetSum)
            return true;

        return left || right;
    }

}
