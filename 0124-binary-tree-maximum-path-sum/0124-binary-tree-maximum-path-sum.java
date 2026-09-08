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
    int maxsum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxpath(root);
        return maxsum;}
        public int maxpath(TreeNode root){
            
        
        if(root==null){
            return 0;
        }
       
        int lh=Math.max(0,maxpath(root.left));
        int rh=Math.max(0,maxpath(root.right));
      int currpath=root.val+lh+rh;
        maxsum=Math.max(maxsum,currpath);
        return root.val+Math.max(lh,rh);
        
    }
}