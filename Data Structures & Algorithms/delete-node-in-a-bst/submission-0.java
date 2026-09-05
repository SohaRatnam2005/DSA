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
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode node = root ;
        if(node == null) return null ;
        if(node.val < key ){
           node.right = deleteNode(node.right, key);
        }
        else if(node.val > key){
           node.left =  deleteNode(node.left ,key);
        }
        else{
            if(node.left == null){
                return node.right;
            }
            if(node.right == null){
                return node.left ;
            }
            TreeNode predecessor = node.left ;
            while(predecessor.right != null){
                predecessor = predecessor.right ;
            }
            node.val = predecessor.val ;
            node.left = deleteNode(node.left , predecessor.val);

        }
        return root ;
    }
}