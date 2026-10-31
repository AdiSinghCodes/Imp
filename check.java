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
    public void make(TreeNode root, ArrayList<Integer> arr)
    {
        if(root==null)
        {
            return;
        }
        arr.add(root.val);
        make(root.left, arr);
        make(root.right, arr);
    }
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        make(root,arr);
        for(int i=0; i<arr.size()-1; i++)
        {
            for(int j=i+1; j<arr.size(); j++)
            {
                if(arr.get(i) + arr.get(j) == k)
                {
                    return true;
                }
            }
        }
        return false;
    }
}