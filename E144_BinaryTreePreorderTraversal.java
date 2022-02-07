import java.util.ArrayList;
import java.util.List;

public class E144_BinaryTreePreorderTraversal {
    public class TreeNode {
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
    class Solution {
        public List<Integer> res = new ArrayList<>();
        public List<Integer> preorderTraversal(TreeNode root) {
            if(root == null)
                return new ArrayList<>();
            res.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
            return res;
        }

    }
}
