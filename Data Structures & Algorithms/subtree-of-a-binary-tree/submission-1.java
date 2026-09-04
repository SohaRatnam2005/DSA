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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        String rootString = preOrder(root);
        String subRootString= preOrder(subRoot);

        return(rootString.contains(subRootString)); 
    }
    private String preOrder(TreeNode root ){
        StringBuilder sb = new StringBuilder();
        if(root == null) return "null";
        sb.append(root.val);
        sb.append(preOrder(root.left));
        sb.append(preOrder(root.right));

        return sb.toString();

    }
}
