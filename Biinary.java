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
    public int findTilt(TreeNode root) {
        if(root==null)
            return 0;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        int total = 0;
        while(!st.isEmpty())
        {
            TreeNode m = st.pop();
            
                int leftsum = getsum(m.left);
            
           
                int rightsum = getsum(m.right);
            
            
            total += Math.abs(leftsum-rightsum);
            if(m.left!=null)
            {
                st.push(m.left);
            }
            if(m.right!=null)
            {
                st.push(m.right);
            }
        }
        return total;
    }


    public int getsum(TreeNode root)
    {
        if(root==null)
            return 0;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        int sum = 0;
        while(!st.isEmpty())
        {
            TreeNode m = st.pop();
            sum += m.val;
    
            
            if(m.left!=null)
            {
                st.push(m.left);
            }
            if(m.right!=null)
            {
                st.push(m.right);
            }

        }
        return sum;
    }
}