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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>>result=new ArrayList<>();
        if(root==null){
            return result;

        }
        Stack<List<Integer>>st=new Stack<>();
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
        int len=q.size();
      
            List<Integer>currlevel=new ArrayList<>();
            for(int i=0;i<len;i++){
            TreeNode curr=q.remove();
            currlevel.add(curr.val);
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
        st.add(currlevel);

        
        }
        while(!st.isEmpty()){
           result.add(st.pop());
        }
        return result;
    }
    }
