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
    public List<Integer> complete(ArrayList<Integer> arr, TreeNode root)
    {
        if(root==null)
        {
            arr.add(null);
            return arr;
        }
        arr.add(root.val);
        complete(arr,root.left);
        complete(arr,root.right);
        return arr;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
        if(root==null)
        {
            return false;
        }

        if(root.val==subRoot.val)
        {
            ArrayList<Integer> arr1 = new ArrayList<>();
            complete(arr1,subRoot);
            ArrayList<Integer> arr2 = new ArrayList<>();
            complete(arr2,root);
            if(arr1.equals(arr2))
            {
                return true;
            }

        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
}