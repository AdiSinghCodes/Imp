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
    public TreeNode sortedArrayToBST(int[] nums) {
        return creaBst(nums,0,nums.length-1);
    }

    public TreeNode creaBst(int[] nums, int left, int right)
    {
        if(left>right)
        {
            return null;
        }
        int mid = (left + right)/2;
        TreeNode m = new TreeNode(nums[mid]);
        m.left = creaBst(nums,left,mid-1);
        m.right = creaBst(nums,mid+1,right);
        return m;
    }
}