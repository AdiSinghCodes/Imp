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
    public List<Integer> check(TreeNode root, ArrayList<Integer> arr)
    {
        if(root!=null)
        {
            arr.add(root.val);
        }
        if(root==null)
        {
            return arr;
        }
        check(root.left,arr);
        check(root.right, arr);
        return arr;
    }
    public int getMinimumDifference(TreeNode root) {
        if(root==null)
        {
            return 0;
        }

        ArrayList<Integer> arr = new ArrayList<>();
        check(root,arr);
        int u = Integer.MAX_VALUE;
        for(int i=0; i<arr.size()-1; i++)
        {
            for(int j=i+1; j<arr.size(); j++)
            {
                u = Math.min(u, Math.abs(arr.get(i)-arr.get(j)));
            }
        }
        return u;
    }
}