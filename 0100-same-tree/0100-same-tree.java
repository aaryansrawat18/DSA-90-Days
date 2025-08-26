/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
     // both trees are empty → same
        if (p == null && q == null) {
            return true;
        }

        // one tree is empty and the other is not → not same
        if (p == null && q != null) {
            return false;
        }
        if (p != null && q == null) {
            return false;
        }

        // values are different → not same
        if (p.val != q.val) {
            return false;
        }

        // check both left and right sides
        boolean leftSame = isSameTree(p.left, q.left);
        boolean rightSame = isSameTree(p.right, q.right);

        return leftSame && rightSame;
        
    }
}