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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if(root==null)
        {
            return list;
        }

        dfs(root,"",list);
        return list;
    }

    public void dfs(TreeNode root, String k, List<String> list)
    {
        if(root==null)
        {
            return;
        }

        k = k + root.val;
        if(root.left==null && root.right==null)
        {
            list.add(k);
            return;
        }
        k = k + "->";
        dfs(root.left,k,list);
        dfs(root.right,k,list);
    }
}