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
    public boolean isBalanced(TreeNode root) {
        if(maxheight(root) == -1){
            return false;
        }
        return true ;
    }

    public int maxheight(TreeNode root){
        if(root == null) return 0 ;

        int left = maxheight(root.left);
        int right = maxheight(root.right);

        if(Math.abs(left - right) > 1)
            return -1;

        return 1+(Math.max(left , right));
    }
}
