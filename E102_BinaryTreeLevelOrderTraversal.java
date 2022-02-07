import java.util.*;

public class E102_BinaryTreeLevelOrderTraversal {
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

    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null)
            return new ArrayList<>();

        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.isEmpty()){
            int size = q.size();
            List<Integer> curList = new ArrayList<>();
            for(int i = 0 ; i < size ; i++){
                TreeNode curNode = q.poll();
                curList.add(curNode.val);

                if(curNode.left != null)
                    q.add(curNode.left);

                if(curNode.right != null)
                    q.add(curNode.right);

            }
            res.add(curList);
        }
        return res;
    }
}
