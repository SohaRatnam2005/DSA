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
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> res = new ArrayList<>();
        if(root == null) return res ;
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode node = root;
        q.offer(node);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0 ; i < size ; i++){
                TreeNode n = q.poll();
                list.add(n.val);
                if(n.left != null) q.offer(n.left);
                if(n.right != null )q.offer(n.right);
            }
            res.add(list.get(list.size()-1));
        }
        return res ;

    }
}
