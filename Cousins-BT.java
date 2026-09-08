public /**
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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null)
            return false;
        q.add(root);
        
        while(!q.isEmpty())
        {
            boolean foundx = false;
        boolean foundy = false;
        int m = q.size();
        for(int i=0; i<m; i++)
        {
            TreeNode n = q.poll();
            if(n.left!=null)
            {
                if(n.left.val==x && n.right!=null && n.right.val ==y || n.left.val==y && n.right!=null && n.right.val ==x)
                {
                    return false;
                }

                if(n.left.val==x)
                {
                    foundx = true;
                }

                 if(n.left.val==y)
                {
                    foundy = true;
                }
                q.add(n.left);
            }

            if(n.right!=null)
            {
                if(n.right.val==x)
                {
                    foundx = true;
                }

                 if(n.right.val==y)
                {
                    foundy = true;
                }
                q.add(n.right);
            }
            
        }
        if(foundx && foundy)
            {
                return true;
            }
            if(foundx || foundy)
            {
                return false;
            }
        }
        
        
        return false;
    }
} {
    
}
