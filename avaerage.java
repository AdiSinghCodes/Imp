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
    public List<Double> averageOfLevels(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        List<Double> ans = new ArrayList<>();
        while(!q.isEmpty())
        {
            int m = q.size();
            ArrayList<Double> d = new ArrayList<>();
            for(int i=0; i<m; i++)
            {
                TreeNode h = q.poll();
                if(h.left!=null)
                {
                    q.add(h.left);
                }
                if(h.right!=null)
                {
                    q.add(h.right);
                }
                d.add((double)h.val);

            }
            double u = 0;
            for(int i=0; i<d.size(); i++)
            {
                u += d.get(i);
            }
            ans.add(u/d.size());

        }
        return ans;
    }
}